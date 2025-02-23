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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jrasc
 */
public class CitaDAO implements ICitaDAO {

    private final IConexionBD conexion;
    private static final Logger logger = Logger.getLogger(PacienteDAO.class.getName());

    public CitaDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    @Override
    public Cita agendarCita(Cita cita) throws PersistenciaException {

        Paciente paciente = cita.getPaciente();
        Doctor doctor = cita.getDoctor();

        String sentenciaSQLAgendarCita = "CALL agendarCita (?,?,?,?,?,?)";
        
        try (Connection con = conexion.crearConexion(); CallableStatement stm = con.prepareCall(sentenciaSQLAgendarCita)){
            
            stm.setString(1, cita.getFolioEmergencia());
            stm.setDate(2, cita.getFecha());
            stm.setTime(3, cita.getHora());
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
    
    @Override
    public List<Cita> obtenerHistorialCitas(int idPaciente) throws PersistenciaException {
        String sql = "{CALL obtenerHistorialCitas(?)}";
        List<Cita> citas = new ArrayList<>();

        try (Connection con = conexion.crearConexion(); CallableStatement stmt = con.prepareCall(sql)) {
            stmt.setInt(1, idPaciente);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Cita cita = new Cita(
                            rs.getString("folioEmergencia"),
                            rs.getDate("fecha"),
                            rs.getTime("hora"),
                            rs.getString("motivo"),
                            rs.getString("estadoCita"),
                            rs.getString("nombreDoctor") + " " + rs.getString("apellidoDoctor")
                    );
                    citas.add(cita);
                }
            }
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al obtener el historial de citas del paciente", ex);
        }
        return citas;
    }
}
