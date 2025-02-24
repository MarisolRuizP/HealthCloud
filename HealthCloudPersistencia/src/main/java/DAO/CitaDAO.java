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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jrasc
 */
public class CitaDAO implements ICitaDAO {

    private final IConexionBD conexion;
    private static final Logger logger = Logger.getLogger(CitaDAO.class.getName());

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
            throw new PersistenciaException("Error al agendar la cita", ex);
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
                    cita.setId(rs.getInt("idCita"));
                    citas.add(cita);
                }
            }
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al obtener el historial de citas del paciente", ex);
        }
        return citas;
    }

    @Override
    public List<String> obtenerEspecialidades() throws PersistenciaException {
        String sql = "SELECT nombreEspecialidad FROM especialidades";
        List<String> especialidades = new ArrayList<>();

        try (Connection con = conexion.crearConexion(); PreparedStatement stmt = con.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                especialidades.add(rs.getString("nombreEspecialidad"));
            }
        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "Error al obtener especialidades", ex);
            throw new PersistenciaException("Error al obtener especialidades", ex);
        }

        return especialidades;
    }

    @Override
    public List<Doctor> obtenerDoctoresPorEspecialidad(String especialidad) throws PersistenciaException {
        String sql = "SELECT * FROM doctores WHERE idEspecialidad = (SELECT idEspecialidad FROM especialidades WHERE nombreEspecialidad = ?)";
        List<Doctor> doctores = new ArrayList<>();

        try (Connection con = conexion.crearConexion(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, especialidad);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setIdDoctor(rs.getInt("idDoctor"));
                    doctor.setNombrePila(rs.getString("nombrePila"));
                    doctor.setApellidoPaterno(rs.getString("apellidoPaterno"));
                    doctor.setApellidoMaterno(rs.getString("apellidoMaterno"));
                    doctor.setCedulaProfesional(rs.getString("cedulaProfesional"));
                    doctor.setEstado(rs.getString("estado"));
                    doctor.setIdEspecialidad(rs.getInt("idEspecialidad"));
                    doctores.add(doctor);
                }
            }
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al obtener doctores por especialidad", ex);
        }

        return doctores;
    }

    @Override
    public List<Time> obtenerHorasAtencion(String identificador, Date fecha) throws PersistenciaException {
        SimpleDateFormat formatoDia = new SimpleDateFormat("EEEE");
        String nombreDia = formatoDia.format(fecha);
        String sql = "SELECT horaInicio, horaFin FROM HorarioAtencion WHERE idDoctor =(SELECT idDoctor FROM doctores WHERE cedulaProfesional = ?) AND diaSemana = ?";
        List<Time> horas = new ArrayList<>();

        try (Connection con = conexion.crearConexion(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, identificador);
            stmt.setString(2, nombreDia);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Time horaInicio = rs.getTime("horaInicio");
                    Time horaFin = rs.getTime("horaFin");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(horaInicio);
                    while (calendar.getTime().before(horaFin)) {
                        horas.add(new Time(calendar.getTimeInMillis()));
                        calendar.add(Calendar.MINUTE, 30); // Intervalos de 30 minutos
                    }
                }
            }
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al obtener horas de atención", ex);
        }

        return horas;
    }

    @Override
    public void cancelarCita(int idCita) throws PersistenciaException {
        String sql = "UPDATE Citas SET estadoCita = 'Cancelada' WHERE idCita = ?";

        try (Connection con = conexion.crearConexion(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, idCita);
            int filasAfectadas = stmt.executeUpdate();

            if (filasAfectadas == 0) {
                throw new PersistenciaException("No se encontró la cita con ID: " + idCita);
            }

        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "Error al cancelar la cita con ID: " + idCita, ex);
            throw new PersistenciaException("Error al cancelar la cita con ID: " + idCita, ex);
        }
    }

}
