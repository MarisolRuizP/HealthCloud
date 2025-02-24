package DAO;

import Conexion.IConexionBD;
import Entidades.Doctor;
import Exception.PersistenciaException;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CitaEmergenciaDAO implements ICitaEmergenciaDAO {

    private final IConexionBD conexion;
    private static final Logger logger = Logger.getLogger(CitaEmergenciaDAO.class.getName());

    public CitaEmergenciaDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    @Override
    public Doctor buscarDoctorConEspacioLibreMasPronto(String especialidad) throws PersistenciaException {
        String sql = "CALL buscarDoctorConEspacioLibreMasPronto(?)";

        try (Connection con = conexion.crearConexion(); CallableStatement stmt = con.prepareCall(sql)) {

            stmt.setString(1, especialidad);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setIdDoctor(rs.getInt("idDoctor"));
                    doctor.setNombrePila(rs.getString("nombrePila"));
                    doctor.setApellidoPaterno(rs.getString("apellidoPaterno"));
                    doctor.setApellidoMaterno(rs.getString("apellidoMaterno"));
                    doctor.setIdEspecialidad(rs.getInt("idEspecialidad"));
                    doctor.setCedulaProfesional(rs.getString("cedulaProfesional"));

                    LocalDate fechaDisponible = rs.getDate("fechaDisponible").toLocalDate();
                    LocalTime horaDisponible = rs.getTime("horaDisponible").toLocalTime();

                    logger.log(Level.INFO, "Doctor con espacio libre: {0} {1}, Disponibilidad: {2} {3}",
                            new Object[]{doctor.getNombrePila(), doctor.getApellidoPaterno(), fechaDisponible, horaDisponible});

                    return doctor;
                } else {
                    throw new PersistenciaException("No hay doctores con espacios libres para la especialidad: " + especialidad);
                }
            }
        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "Error al buscar doctor con espacio libre más pronto", ex);
            throw new PersistenciaException("Error al buscar doctor con espacio libre más pronto", ex);
        }
    }

    @Override
    public boolean verificarFolioEnBD(String folio) throws PersistenciaException {
        String sql = "SELECT COUNT(*) FROM Citas WHERE folioEmergencia = ?";

        try (Connection con = conexion.crearConexion(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, folio);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0; 
                }
            }
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al verificar la existencia del folio en la base de datos", ex);
        }
        return false;
    }

    @Override
    public String generarFolioUnico() throws PersistenciaException {
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String folio;
        boolean existe;
        do {
            StringBuilder folioBuilder = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                folioBuilder.append(caracteres.charAt(random.nextInt(caracteres.length())));
            }
            folio = folioBuilder.toString();
            existe = verificarFolioEnBD(folio);
        } while (existe); 

        return folio;
    }
}
