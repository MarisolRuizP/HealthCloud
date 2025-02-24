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
import java.sql.PreparedStatement;
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

        try (Connection con = conexion.crearConexion(); CallableStatement stm = con.prepareCall(sentenciaSQLAgendarCita)) {

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
        List<Cita> citas = new ArrayList<>();
        String sql = "CALL obtenerHistorialCitas(?)";

        try (Connection con = conexion.crearConexion(); CallableStatement stmt = con.prepareCall(sql)) {
            stmt.setInt(1, idPaciente);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cita cita = new Cita(
                        rs.getString("folioEmergencia"),
                        rs.getDate("fecha"),
                        rs.getTime("hora"),
                        rs.getString("motivo"),
                        rs.getString("estadoCita"),
                        rs.getString("nombreDoctor") + " " + rs.getString("apellidoDoctor"),
                        rs.getString("especialidadDoctor")
                );
                citas.add(cita);
            }
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al obtener el historial de citas", ex);
        }
        return citas;
    }

    @Override
    public List<Cita> obtenerCitasDoctor(int idDoctor) throws PersistenciaException {
        String sentenciaSQLObtenerCitas = "CALL obtenerCitasDoctor(?)";
        List<Cita> citas = new ArrayList<>();

        try (Connection con = conexion.crearConexion(); CallableStatement stmt = con.prepareCall(sentenciaSQLObtenerCitas)) {
            stmt.setInt(1, idDoctor);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Cita cita = new Cita(
                            rs.getString("folioEmergencia"),
                            rs.getDate("fecha"),
                            rs.getTime("hora"),
                            rs.getString("motivo"),
                            rs.getString("estadoCita"),
                            rs.getString("nombrePaciente"),
                            rs.getString("apellidoPaciente")
                    );
                    citas.add(cita);
                }
            }
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al obtener el historial de citas del paciente", ex);
        }
        return citas;
    }
    
    @Override
    public boolean doctorTieneCitaEnHorario(int idDoctor, Date fecha, Time hora) throws PersistenciaException {
        String sql = "SELECT COUNT(*) AS total FROM Citas WHERE idDoctor = ? AND fecha = ? AND hora = ?";
        try (Connection con = conexion.crearConexion(); PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, idDoctor);
            stmt.setDate(2, fecha);
            stmt.setTime(3, hora);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt("total");
                    return count > 0;
                }
            }
        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "Error al verificar el horario del doctor", ex);
            throw new PersistenciaException("Error al verificar la cita del doctor en ese horario", ex);
        }
        return false;
    }
    
}
