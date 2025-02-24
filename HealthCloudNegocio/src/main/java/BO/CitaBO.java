package BO;

import Conexion.IConexionBD;
import DAO.CitaDAO;
import DAO.ICitaDAO;
import DTO.CitaNuevoDTO;
import Entidades.Cita;
import Entidades.Doctor;
import Exception.NegocioException;
import Exception.PersistenciaException;
import Mapper.CitaMapper;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CitaBO {

    private final ICitaDAO citaDAO;
    private final DoctorBO doctorBO;
    private static final Logger logger = Logger.getLogger(CitaBO.class.getName());

    public CitaBO(IConexionBD conexion) {
        this.citaDAO = new CitaDAO(conexion);
        this.doctorBO = new DoctorBO(conexion);

    }

    public void agendarCita(CitaNuevoDTO citaDTO, String identificador) throws NegocioException {
        try {
            // Validaciones de negocio
            if (citaDTO.getFecha().before(new Date())) {
                throw new NegocioException("No se puede agendar una cita en una fecha pasada.");
            }
            if (citaDTO.getHora() == null) {
                throw new NegocioException("La hora es obligatoria.");
            }

            // Llamar al DAO para registrar la cita en la base de datos
            CitaMapper mapper = new CitaMapper();
            Cita cita = mapper.toEntity(citaDTO);
            citaDAO.agendarCita(cita);

            // Log y mensaje de éxito
            logger.log(Level.INFO, "Cita agendada exitosamente: {0}", cita);

        } catch (PersistenciaException ex) {
            logger.log(Level.SEVERE, "Error al agendar la cita", ex);
            throw new NegocioException("Error al agendar la cita: " + ex.getMessage(), ex);
        }
    }

    public List<String> obtenerEspecialidades() throws NegocioException {
        try {
            return citaDAO.obtenerEspecialidades();
        } catch (PersistenciaException ex) {
            logger.log(Level.SEVERE, "Error al obtener especialidades", ex);
            throw new NegocioException("Error al obtener especialidades", ex);
        }
    }

    public List<Doctor> obtenerDoctoresPorEspecialidad(String especialidad) throws NegocioException {
        try {
            return citaDAO.obtenerDoctoresPorEspecialidad(especialidad);
        } catch (PersistenciaException ex) {
            logger.log(Level.SEVERE, "Error al obtener doctores por especialidad", ex);
            throw new NegocioException("Error al obtener doctores por especialidad", ex);
        }
    }

    public List<Time> obtenerHorasAtencion(String identificador, Date fecha) throws NegocioException {
        try {
            java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime());
            return citaDAO.obtenerHorasAtencion(identificador, fechaSQL);
        } catch (PersistenciaException ex) {
            logger.log(Level.SEVERE, "Error al obtener días de atención", ex);
            throw new NegocioException("Error al obtener horas de atención", ex);
        }
    }
}
