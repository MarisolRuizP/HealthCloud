package DAO;

import Conexion.IConexionBD;
import Exception.PersistenciaException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CitaEmergenciaDAO implements ICitaEmergenciaDAO {
    
    private final IConexionBD conexion;
    private static final Logger logger = Logger.getLogger(CitaEmergenciaDAO.class.getName());

    public CitaEmergenciaDAO (IConexionBD conexion) {
        this.conexion = conexion;
    }
    
    @Override
    public List<String> obtenerEspecialidades () throws PersistenciaException {

        String sentenciaSQL = "SELECT DISTINCT especialidad FROM Doctores";
        List<String> especialidades = new ArrayList<>();
        
        try (Connection con = conexion.crearConexion();
             PreparedStatement stmt = con.prepareStatement(sentenciaSQL);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {

                especialidades.add(rs.getString("especialidad"));

            }
            return especialidades;
            
        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "Hubo un error al obtener las especialidades", ex);
            throw new PersistenciaException("Hubo un error al consultar especialidades disponibles", ex);
        }
    }

//    @Override
//    public Cita registrarCitaEmergencia(String especialidad) throws PersistenciaException {
//        String sentenciaSQL = "{CALL buscarDoctorDisponible(?)}";
//        
//        try (Connection con = conexion.crearConexion()) {
//
//            // Cochinero para encontrar a un doctor disponible
//            Doctor doctorDisponible;
//            LocalDate fecha;
//            LocalTime hora;
//            
//            try (CallableStatement stmt = con.prepareCall(sentenciaSQL)) {
//                stmt.setString(1, especialidad);
//                ResultSet rs = stmt.executeQuery();
//                
//                // ps uqe no hay
//                if (!rs.next()) {
//                    throw new PersistenciaException("No hay doctores disponibles para esta especialidad en este momento.");
//                }
//                
//                doctorDisponible = new Doctor();
//                doctorDisponible.setIdDoctor(rs.getInt("idDoctor"));
//                doctorDisponible.setNombrePila(rs.getString("nombrePila"));
//                doctorDisponible.setApellidoPaterno(rs.getString("apellidoPaterno"));
//                doctorDisponible.setApellidoMaterno(rs.getString("apellidoMaterno"));
//                doctorDisponible.setIdEspecialidad(rs.getInt("especialidad"));
//                doctorDisponible.setCedulaProfesional(rs.getString("cedulaProfesional"));
//                
//                fecha = LocalDate.now();
//                hora = LocalTime.of(rs.getInt("hora_disponible"), 0); 
//            }
//            
//            // Cochinero para generar y registrar la cita de emergencia
//            String folio = generarFolioUnico();
//            
//            try (CallableStatement stmt = con.prepareCall("INSERT INTO Citas (folioEmergencia, fecha, hora, motivo, idDoctor) VALUES (?, ?, ?, ?, ?)")) {
//                stmt.setString(1, folio);
//                stmt.setDate(2, Date.valueOf(fecha));
//                stmt.setTime(3, Time.valueOf(hora));
//                stmt.setString(4, "Emergencia: " + especialidad);
//                stmt.setInt(5, doctorDisponible.getIdDoctor());
//                
//                stmt.executeUpdate();
//            }
//            
//            return new Cita(folio, fecha, hora, "Emergencia:" + especialidad, null, doctorDisponible);
//            
//        } catch (SQLException ex) {
//            logger.log(Level.SEVERE, "Hubo un error al registrar cita de emergencia", ex);
//            throw new PersistenciaException("Hubo un error al registrar la cita de emergencia", ex);
//        }
//    }
    
    private String generarFolioUnico() {
        Random random = new Random();
        StringBuilder folio = new StringBuilder();
        
        // folio unico de 8 caracteres randoms
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < 8; i++) {
            folio.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        
        return folio.toString();

    }

    
}
