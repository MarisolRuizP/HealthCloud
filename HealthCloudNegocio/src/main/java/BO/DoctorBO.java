package BO;

import Conexion.IConexionBD;
import DAO.CitaDAO;
import DAO.DoctorDAO;
import DAO.ICitaDAO;
import DAO.IDoctorDAO;
import DTO.DoctorDTO;
import DTO.HorarioAtencionDTO;
import Entidades.Doctor;
import Entidades.horarioAtencion;
import Exception.NegocioException;
import Exception.PersistenciaException;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoctorBO {

    private final IDoctorDAO doctorDAO;
    private final ICitaDAO citaDAO;
    private static final Logger logger = Logger.getLogger(DoctorBO.class.getName());

    public DoctorBO(IConexionBD conexion) {
        this.doctorDAO = new DoctorDAO(conexion);
        this.citaDAO = new CitaDAO(conexion);
    }

    public void solicitarBajaTemporal(int idDoctor) throws NegocioException {
        try {

            if (!doctorDAO.estaActivo(idDoctor)) {
                throw new NegocioException("Ya se encuentra dado de baja.");
            }

            if (doctorDAO.tieneCitasPendientes(idDoctor)) {
                throw new NegocioException("No se puede dar de baja. Tiene citas pendientes.");
            }

            doctorDAO.darBajaTemporal(idDoctor);

        } catch (PersistenciaException ex) {
            logger.log(Level.SEVERE, "Error al realizar la baja temporal.", ex);
            throw new NegocioException("Error al realizar la solicitud de baja temporal: ", ex);
        }
    }

    public DoctorDTO obtenerDoctorPorCedula(String cedulaProfesional) throws NegocioException {
        try {
            Doctor doctor = doctorDAO.obtenerDoctorPorCedula(cedulaProfesional);
            if (doctor != null) {
                return new DoctorDTO(
                        doctor.getIdDoctor(),
                        doctor.getNombrePila(),
                        doctor.getApellidoPaterno(),
                        doctor.getApellidoMaterno(),
                        doctor.getIdEspecialidad(),
                        doctor.getCedulaProfesional(),
                        doctor.getEstado(),
                        doctor.getUsuario()
                );
            }
        } catch (PersistenciaException ex) {
            logger.log(Level.SEVERE, "Error al buscar al medico ", ex);
            throw new NegocioException("Error al buscar al medico", ex);
        }
        return null;
    }

    public String consultarEspecialidad(int idDoctor) throws NegocioException {
        try {
            return doctorDAO.consultarEspecialidad(idDoctor);
        } catch (PersistenciaException ex) {
            logger.log(Level.SEVERE, "Error al consultar la especialidad del doctor.", ex);
            throw new NegocioException("Error al consultar la especialidad del doctor.", ex);
        }
    }

    public List<horarioAtencion> consultarHorarioAtencion(int idDoctor) throws NegocioException {
        try {
            return doctorDAO.consultarHorarioAtencion(idDoctor);
        } catch (PersistenciaException ex) {
            logger.log(Level.SEVERE, "Error al consultar el horario de atención del doctor.", ex);
            throw new NegocioException("Error al consultar el horario de atención del doctor.", ex);
        }
    }

    public boolean estaActivo(int idDoctor) throws NegocioException {
        try {
            return doctorDAO.estaActivo(idDoctor);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al verificar el estado del doctor.", ex);
        }
    }

    public boolean doctorTieneCitaEnHorario(int idDoctor, Date fecha, Time hora) throws NegocioException {
        try {
            return citaDAO.doctorTieneCitaEnHorario(idDoctor, (java.sql.Date) fecha, hora);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al verificar la disponibilidad del doctor.", ex);
        }
    }
    
    public List<Doctor> obtenerDoctoresPorEspecialidad(String especialidad) throws NegocioException {
    try {
        return doctorDAO.obtenerDoctoresPorEspecialidad(especialidad);
    } catch (PersistenciaException ex) {
        logger.log(Level.SEVERE, "Error al obtener doctores por especialidad", ex);
        throw new NegocioException("Error al obtener doctores", ex);
    }
}


}
