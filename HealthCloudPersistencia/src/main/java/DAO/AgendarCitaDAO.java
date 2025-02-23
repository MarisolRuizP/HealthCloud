/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.IConexionBD;
import Entidades.Cita;
import Entidades.Doctor;
import Entidades.Paciente;
import Exception.PersistenciaException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jrasc
 */
public class AgendarCitaDAO implements IAgendarCitaDAO {

    private final IConexionBD conexion;
    private static final Logger logger = Logger.getLogger(PacienteDAO.class.getName());

    public AgendarCitaDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    @Override
    public Cita agendarCita(Cita cita) throws PersistenciaException {

        Paciente paciente = cita.getPaciente();
        Doctor doctor = cita.getDoctor();

        String sentenciaSQLAgendarCita = "CALL agendarCita (?,?,?,?,?,?)";
        
        try (Connection con = conexion.crearConexion(); CallableStatement stm = con.prepareCall(sentenciaSQLAgendarCita)){
            
            stm.setString(1, cita.getFolioEmergencia());
            stm.setDate(2, Date.valueOf(cita.getFecha()));
            stm.setTime(3, Time.valueOf(cita.getHora()));
            stm.setString(4, cita.getMotivo());
            stm.setInt(5, paciente.getIdPaciente());
            stm.setInt(6, doctor.getIdDoctor());
            
            stm.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new PersistenciaException("Error al actualizar al paciente", ex);
        }
        return cita;
    }
    
    public List<Cita> historialCitas (Paciente paciente) throws PersistenciaException{
        
        List<Cita> historialCita = new ArrayList<>();
        
        String sentenciaSQLHistorial = "CALL obtenerHistorialCitas(?)";
        
        try (Connection con = conexion.crearConexion(); CallableStatement stm = con.prepareCall(sentenciaSQLHistorial)){
        
            stm.setInt(1, paciente.getIdPaciente());
            
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()){
                Cita cita = new Cita(rs.getString("folioEmergencia"), rs.getDate("fecha").toLocalDate(),  rs.getTime("hora").toLocalTime(), rs.getString("motivo"), rs.getString("estadoCita"));
                historialCita.add(cita);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AgendarCitaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return historialCita;
    }
}
