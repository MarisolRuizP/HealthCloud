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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
}
