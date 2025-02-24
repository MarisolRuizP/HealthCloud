package BO;

import Conexion.IConexionBD;
import DAO.CitaDAO;
import DAO.ICitaDAO;
import DTO.AgendarCitaDTO;
import Entidades.Cita;
import Entidades.horarioAtencion;
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
        this.doctorBO = new DoctorBO(conexion, null);
    }

    public Cita agendarCita(AgendarCitaDTO citaDTO) throws NegocioException {
        try {

            validarDatosAgendarCita(citaDTO);
            validarEspecialidadDoctor(citaDTO.getIdDoctor(), citaDTO.getEspecialidad());
            validarDisponibilidadDoctor(citaDTO);

            CitaMapper mapper = new CitaMapper();
            Cita cita = mapper.toEntity(citaDTO);

            Cita citaRegistrada = citaDAO.agendarCita(cita);
            return citaRegistrada;
        } catch (PersistenciaException ex) {
            logger.log(Level.SEVERE, "Error al agendar la cita", ex);
            throw new NegocioException("No se pudo agendar la cita", ex);
        }
    }

    private void validarDatosAgendarCita(AgendarCitaDTO citaDTO) throws NegocioException {
        if (citaDTO.getEspecialidad() == null || citaDTO.getEspecialidad().trim().isEmpty()) {
            throw new NegocioException("Favor de seleccionar una especialidad.");
        }
        if (citaDTO.getIdDoctor() <= 0) {
            throw new NegocioException("Favor de seleccionar un doctor válido.");
        }
        if (citaDTO.getFecha() == null) {
            throw new NegocioException("Favor de seleccionar una fecha.");
        }
        if (citaDTO.getHora() == null) {
            throw new NegocioException("Favor de seleccionar la hora.");
        }
        if (citaDTO.getNotasParaDoctor() == null || citaDTO.getNotasParaDoctor().trim().isEmpty()) {
            throw new NegocioException("Favor de escribir notas para el doctor.");
        }
        Date fechaActual = new Date(System.currentTimeMillis());
        if (citaDTO.getFecha().before(fechaActual)) {
            throw new NegocioException("La fecha seleccionada debe ser futura.");
        }
        validarHorarioAtencion(citaDTO);
    }

    private void validarEspecialidadDoctor(int idDoctor, String especialidad) throws NegocioException {
        String especialidadDoctor = doctorBO.consultarEspecialidad(idDoctor);
        if (!especialidadDoctor.equalsIgnoreCase(especialidad)) {
            throw new NegocioException("El doctor seleccionado no pertenece a la especialidad seleccionada.");
        }
    }

    private void validarDisponibilidadDoctor(AgendarCitaDTO citaDTO) throws NegocioException {
        if (!doctorBO.estaActivo(citaDTO.getIdDoctor())) {
            throw new NegocioException("El doctor seleccionado no se encuentra disponible actualmente.");
        }
        if (doctorBO.doctorTieneCitaEnHorario(citaDTO.getIdDoctor(), citaDTO.getFecha(), citaDTO.getHora())) {
            throw new NegocioException("El doctor no tiene disponibilidad en ese momento.");
        }
    }

    private void validarHorarioAtencion(AgendarCitaDTO citaDTO) throws NegocioException {
        List<horarioAtencion> horarios = doctorBO.consultarHorarioAtencion(citaDTO.getIdDoctor());
        String diaSemana = citaDTO.getFecha().toLocalDate().getDayOfWeek().toString();
        boolean horarioValido = false;
        for (horarioAtencion horario : horarios) {
            if (horario.getDia().equalsIgnoreCase(diaSemana)) {
                if (citaDTO.getHora().after(horario.getHoraEntrada())
                        && citaDTO.getHora().before(horario.getHoraSalida())) {
                    horarioValido = true;
                    break;
                }
            }
        }
        if (!horarioValido) {
            throw new NegocioException("La hora seleccionada está fuera del horario de atención del doctor.");
        }
    }

}
