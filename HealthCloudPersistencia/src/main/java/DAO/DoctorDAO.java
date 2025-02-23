package DAO;

import Conexion.IConexionBD;
import Entidades.Doctor;
import Entidades.Usuario;
import Entidades.horarioAtencion;
import Exception.PersistenciaException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mindrot.jbcrypt.BCrypt;

public class DoctorDAO implements IDoctorDAO {

    private final IConexionBD conexion;
    private static final Logger logger = Logger.getLogger(DoctorDAO.class.getName());

    public DoctorDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    /**
     * Para verificar si tiene citas pendientes el doc
     *
     */
    @Override
    public boolean tieneCitasPendientes(int idDoctor) throws PersistenciaException {

        String sql = "SELECT COUNT(*) FROM Citas WHERE idDoctor = ? AND fecha >= CURDATE()";

        try (Connection con = conexion.crearConexion(); PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, idDoctor);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }

            return false;

        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "Hubo un error al verificar las citas pendientes", ex);
            throw new PersistenciaException("blablabla", ex);
        }
    }

    /**
     * Para que se pueda dar de baja temporal el doc
     *
     */
    @Override
    public void darBajaTemporal(int idDoctor) throws PersistenciaException {

        String sql = "UPDATE Doctores SET estado = 'Inactivo' WHERE idDoctor = ?";

        try (Connection con = conexion.crearConexion(); PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, idDoctor);
            int filasAfectadas = stmt.executeUpdate();

            if (filasAfectadas == 0) {
                throw new PersistenciaException("No se encontro al doctor");
            }

        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "Ocurrio un error al dar de baja al doctor", ex);
            throw new PersistenciaException("Ocurrio un error en el proceso de baja", ex);
        }
    }

    // Para verificar que el doctor este activo
    @Override
    public boolean estaActivo(int idDoctor) throws PersistenciaException {
        String sql = "SELECT estado FROM Doctores WHERE idDoctor = ?";

        try (Connection con = conexion.crearConexion(); PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, idDoctor);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String estado = rs.getString("estado");
                    return estado.equals("Activo");
                }
                throw new PersistenciaException("Doctor no encontrado.");
            }

        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "Hubo un error al verificar estado del doctor.", ex);
            throw new PersistenciaException("Hubo un error al verificar al doctor.", ex);

        }

    }

    @Override
    public void agregarDoctorNuevo(Doctor doctor, String contrasenia) throws PersistenciaException {
        String sql = "CALL agregarDoctorNuevo(?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = conexion.crearConexion(); CallableStatement stmt = con.prepareCall(sql)) {
            // Encriptar la contraseña usando Bcrypt
            String hashedPassword = BCrypt.hashpw(contrasenia, BCrypt.gensalt());

            stmt.setString(1, doctor.getCedulaProfesional());
            stmt.setString(2, hashedPassword);
            stmt.setString(3, "Medico"); // Tipo de usuario
            stmt.setString(4, doctor.getNombrePila());
            stmt.setString(5, doctor.getApellidoPaterno());
            stmt.setString(6, doctor.getApellidoMaterno());
            stmt.setInt(7, doctor.getIdEspecialidad());
            stmt.setString(8, doctor.getEstado());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al agregar el doctor y usuario", ex);
        }
    }

    public void agregarHorarioAtencion(int idDoctor, String diaSemana, Time horaInicio, Time horaFin) throws PersistenciaException {
        String sql = "CALL agregarHorarioAtencion(?, ?, ?, ?)";

        try (Connection con = conexion.crearConexion(); CallableStatement stmt = con.prepareCall(sql)) {
            stmt.setInt(1, idDoctor);
            stmt.setString(2, diaSemana);
            stmt.setTime(3, horaInicio);
            stmt.setTime(4, horaFin);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al agregar horario de atención", ex);
        }
    }

    @Override
    public Doctor obtenerDoctorPorCedula(String cedulaProfesional) throws PersistenciaException {
        String sql = "CALL consultarDoctorPorCedula(?)";
        try (Connection con = conexion.crearConexion(); CallableStatement stmt = con.prepareCall(sql)) {
            stmt.setString(1, cedulaProfesional);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setIdDoctor(rs.getInt("idDoctor"));
                    doctor.setNombrePila(rs.getString("nombrePila"));
                    doctor.setApellidoPaterno(rs.getString("apellidoPaterno"));
                    doctor.setApellidoMaterno(rs.getString("apellidoMaterno"));
                    doctor.setIdEspecialidad(rs.getInt("idEspecialidad"));
                    doctor.setCedulaProfesional(rs.getString("cedulaProfesional"));
                    doctor.setEstado(rs.getString("estado"));

                    Usuario usuario = new Usuario();
                    usuario.setIdentificador(rs.getString("cedulaProfesional"));
                    usuario.setTipoDeUsuario(rs.getString("tipoDeUsuario"));
                    doctor.setUsuario(usuario);

                    return doctor;
                } else {
                    throw new PersistenciaException("Doctor no encontrado");
                }
            }
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al obtener el doctor por cédula", ex);
        }
    }

    public String consultarEspecialidad(int idDoctor) throws PersistenciaException {
        String sql = "{CALL consultarEspecialidad(?)}";

        try (Connection con = conexion.crearConexion(); CallableStatement stmt = con.prepareCall(sql)) {
            stmt.setInt(1, idDoctor);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("nombreEspecialidad");
                } else {
                    throw new PersistenciaException("Especialidad no encontrada para el doctor con ID: " + idDoctor);
                }
            }
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al consultar la especialidad del doctor", ex);
        }
    }

    public List<horarioAtencion> consultarHorarioAtencion(int idDoctor) throws PersistenciaException {
        String sql = "{CALL consultarHorarioAtencion(?)}";
        List<horarioAtencion> horarios = new ArrayList<>();

        try (Connection con = conexion.crearConexion(); CallableStatement stmt = con.prepareCall(sql)) {
            stmt.setInt(1, idDoctor);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    horarioAtencion horario = new horarioAtencion(rs.getString("diaSemana"),
                            rs.getTime("horaInicio"),
                            rs.getTime("horaFin"),
                            idDoctor);
                    horarios.add(horario);
                }
            }
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al consultar el horario de atención del doctor", ex);
        }
        return horarios;
    }

}
