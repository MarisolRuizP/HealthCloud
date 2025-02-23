/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.IConexionBD;
import Entidades.Direccion;
import Entidades.Paciente;
import Entidades.Usuario;
import Exception.PersistenciaException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author jrasc
 */
public class PacienteDAO implements IPacienteDAO {

    private final IConexionBD conexion;
    private static final Logger logger = Logger.getLogger(PacienteDAO.class.getName());

    public PacienteDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    /**
     *
     * @param paciente recibe un objeto de tipo paciente para poder realizar la
     * insercion
     * @return
     * @throws PersistenciaException
     */
    @Override
    public Paciente registrarPaciente(Paciente paciente) throws PersistenciaException {

        String sentenciaSQLUsuario = "INSERT INTO Usuarios (identificador, contrasenia, tipoDeUsuario) VALUES (?, ?, ?)";
        try (Connection con = conexion.crearConexion()) {
            con.setAutoCommit(false);

            Usuario usuario = paciente.getUsuario();
            String hashedPswd = BCrypt.hashpw(usuario.getContrasenia(), BCrypt.gensalt());

            try (PreparedStatement psUsuario = con.prepareStatement(sentenciaSQLUsuario, Statement.RETURN_GENERATED_KEYS)) {
                psUsuario.setString(1, usuario.getIdentificador());
                psUsuario.setString(2, hashedPswd);
                psUsuario.setString(3, usuario.getTipoDeUsuario());

                int filasAfectadasUsuario = psUsuario.executeUpdate();
                if (filasAfectadasUsuario == 0) {
                    throw new PersistenciaException("La creación del usuario falló.");
                }

                try (ResultSet generatedKeys = psUsuario.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int idUsuario = generatedKeys.getInt(1);
                        paciente.getUsuario().setId(idUsuario);
                    } else {
                        throw new PersistenciaException("No se obtuvo ID para el usuario.");
                    }
                }
            }

            String sentenciaSQLDireccion = "INSERT INTO DireccionPacientes (calleYNumCasa, colonia, municipio) VALUES (?,?,?)";
            try (PreparedStatement psDireccion = con.prepareStatement(sentenciaSQLDireccion, Statement.RETURN_GENERATED_KEYS)) {
                Direccion direccion = paciente.getDireccion();
                psDireccion.setString(1, direccion.getCalleYNum());
                psDireccion.setString(2, direccion.getColonia());
                psDireccion.setString(3, direccion.getMunicipio());

                int filasAfectadasDireccion = psDireccion.executeUpdate();
                if (filasAfectadasDireccion == 0) {
                    throw new PersistenciaException("La creación de la dirección falló.");
                }

                try (ResultSet generatedKeys = psDireccion.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int idDireccion = generatedKeys.getInt(1);
                        paciente.getDireccion().setId(idDireccion);
                    } else {
                        throw new PersistenciaException("No se obtuvo ID para la dirección.");
                    }
                }
            }

            String sentenciaSQLPaciente = "INSERT INTO Pacientes (nombrePila, apellidoPaterno, apellidoMaterno, numTelefono, fechaNacimiento, correoElectronico, idUsuario, idDireccion) VALUES (?, ?,?,?,?,?,?,?)";
            try (PreparedStatement psPaciente = con.prepareStatement(sentenciaSQLPaciente, Statement.RETURN_GENERATED_KEYS)) {
                psPaciente.setString(1, paciente.getNombrePila());
                psPaciente.setString(2, paciente.getApellidoPaterno());
                psPaciente.setString(3, paciente.getApellidoMaterno());
                psPaciente.setString(4, paciente.getNumTelefono());
                psPaciente.setDate(5, paciente.getFechaNacimiento());
                psPaciente.setString(6, paciente.getCorreoElectronico());
                psPaciente.setInt(7, paciente.getUsuario().getId());
                psPaciente.setInt(8, paciente.getDireccion().getId());

                int filasAfectadasPaciente = psPaciente.executeUpdate();
                if (filasAfectadasPaciente == 0) {
                    throw new PersistenciaException("La creación del paciente falló.");
                }

                try (ResultSet generatedKeys = psPaciente.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        paciente.setId(generatedKeys.getInt(1));
                    } else {
                        throw new PersistenciaException("No se obtuvo ID para el paciente.");
                    }
                }
            }

            con.commit();

        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new PersistenciaException("Error al registrar el paciente", ex);
        }
        return paciente;
    }

    @Override
    public Paciente actualizarPaciente(Paciente paciente) throws PersistenciaException {
        String sentenciaSQLActualizarUsuario = "UPDATE Usuarios SET identificador = ?, contrasenia = ?, tipoDeUsuario = ? WHERE idUsuario = ?";
        String sentenciaSQLActualizarDireccion = "UPDATE DireccionPacientes SET calleYNumCasa = ?, colonia = ?, municipio = ? WHERE idDireccion = (SELECT idDireccion FROM pacientes WHERE idPaciente = ?)";
        String sentenciaSQLActualizarPaciente = "UPDATE Pacientes SET nombrePila = ?, apellidoPaterno = ?, apellidoMaterno = ?, numTelefono = ?, fechaNacimiento = ?, correoElectronico = ? WHERE idPaciente = ?";

        try (Connection con = conexion.crearConexion()) {
            con.setAutoCommit(false);  // Iniciar la transacción

            Paciente pacAux = consultarPacientePorCorreo(paciente.getCorreoElectronico());
            // Actualizar el Usuario
            Usuario usuario = paciente.getUsuario();
            String hashedPswd = BCrypt.hashpw(usuario.getContrasenia(), BCrypt.gensalt());
            try (PreparedStatement psUsuario = con.prepareStatement(sentenciaSQLActualizarUsuario)) {
                psUsuario.setString(1, usuario.getIdentificador());
                psUsuario.setString(2, hashedPswd);
                psUsuario.setString(3, usuario.getTipoDeUsuario());
                psUsuario.setInt(4, pacAux.getUsuario().getId());
                psUsuario.executeUpdate();
            }

            // Actualizar la Dirección
            Direccion direccion = paciente.getDireccion();
            try (PreparedStatement psDireccion = con.prepareStatement(sentenciaSQLActualizarDireccion)) {
                psDireccion.setString(1, direccion.getCalleYNum());
                psDireccion.setString(2, direccion.getColonia());
                psDireccion.setString(3, direccion.getMunicipio());
                psDireccion.setInt(4, pacAux.getIdPaciente());
                psDireccion.executeUpdate();
            }

            // Actualizar el Paciente
            try (PreparedStatement psPaciente = con.prepareStatement(sentenciaSQLActualizarPaciente)) {
                psPaciente.setString(1, paciente.getNombrePila());
                psPaciente.setString(2, paciente.getApellidoPaterno());
                psPaciente.setString(3, paciente.getApellidoMaterno());
                psPaciente.setString(4, paciente.getNumTelefono());
                psPaciente.setDate(5, paciente.getFechaNacimiento());
                psPaciente.setString(6, paciente.getCorreoElectronico());
                psPaciente.setInt(7, pacAux.getIdPaciente());
                psPaciente.executeUpdate();
            }

            con.commit();  // Confirmar la transacción

           return paciente;
        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "Error al actualizar el paciente", ex);
            throw new PersistenciaException("Error al actualizar el paciente", ex);
        }
    }

    @Override
    public Paciente consultarPacientePorCorreo(String correo) throws PersistenciaException {

        Paciente paciente = null;

        String sql = "CALL consultarPorCorreo(?)";

        try (Connection con = conexion.crearConexion(); CallableStatement stm = con.prepareCall(sql)) {

            stm.setString(1, correo);

            try (ResultSet rs = stm.executeQuery()) {
                if (rs.next()) {
                    paciente = new Paciente();
                    paciente.setIdPaciente(rs.getInt("idPaciente"));
                    paciente.setNombrePila(rs.getString("nombrePila"));
                    paciente.setApellidoPaterno(rs.getString("apellidoPaterno"));
                    paciente.setApellidoMaterno(rs.getString("apellidoMaterno"));
                    paciente.setNumTelefono(rs.getString("numTelefono"));
                    paciente.setFechaNacimiento(rs.getDate("fechaNacimiento"));
                    paciente.setCorreoElectronico(rs.getString("correoElectronico"));

                    Direccion direccion = new Direccion(
                            rs.getString("calleYNumCasa"),
                            rs.getString("colonia"),
                            rs.getString("municipio")
                    );
                    paciente.setDireccion(direccion);

                    
                    Usuario usuario = new Usuario(
                            rs.getString("correoElectronico"),
                            rs.getString("contrasenia"),
                            rs.getString("tipoDeUsuario")
                    );
                    paciente.setUsuario(usuario);

                    System.out.println("ID del paciente: " + paciente.getIdPaciente());
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new PersistenciaException("Error al obtener el paciente por correo.", ex);
        }

        return paciente;
    }

}
