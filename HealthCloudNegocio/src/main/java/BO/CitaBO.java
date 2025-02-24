package BO;

import Conexion.IConexionBD;
import DAO.CitaDAO;
import DAO.ICitaDAO;
import DTO.AgendarCitaDTO;
import Entidades.Cita;
import Exception.NegocioException;
import Exception.PersistenciaException;
import java.sql.Date;
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

    // Validaciones, llaman metodos .
    public Cita agendarCita(AgendarCitaDTO citaDTO) throws NegocioException {
        try {
    
            // Para verrificar los datos de la cita. (Especialidad, Fecha y Hora)
            validarDatosAgendarCita(citaDTO);
            
            // Para verificar que el doctor pertenezca a la especialidad seleccionada.
            validarEspecialidadDoctor(citaDTO.getIdDoctor(), citaDTO.getEspecialidad());
            
            // Para verificar la disponibilidad del doctor en el horario seleccionado.
            validarDisponibilidadDoctor(citaDTO);

            ////////////////////////////////////////////////////////
            CitaMapper mapper = new CitaMapper();
            Cita cita = mapper.toEntity(citaDTO);

            Cita citaRegistrada = citaDAO.agendarCita(cita);

            return citaRegistrada;
            ////////////////////////////////////////////////////////


            ////////////////////////////////////////////////////////
            // Cita cita = new Cita();
            // cita.setFecha(citaDTO.getFecha());
            // cita.setHora(citaDTO.getHora());
            // cita.setNotas(citaDTO.getNotasParaDoctor());
            // cita.setEstadoCita("Cita Agendada");
            //
            // 
            // Doctor doctor = doctorBO.obtenerDoctorPorId(citaDTO.getIdDoctor());
            // Paciente paciente = pacienteBO.obtenerPacientePorId(citaDTO.getIdPaciente());
            //
            // cita.setDoctor(doctor);
            // cita.setPaciente(paciente);
            // return citaDAO.agendarCita(cita);
            //////////////////////////////////////////////////////// 
           
      
            
        } catch (PersistenciaException ex) {
            logger.log(Level.SEVERE, "Error al agendar la cita", ex);
            throw new NegocioException("No se pudo agendar la cita", ex);
        }
    }

    // Metodo para validar la Especialidad, fecha y hora.
    private void validarDatosAgendarCita(AgendarCitaDTO citaDTO) throws NegocioException {
       
        // Validar especialidad tal vez no sea necesario.
        if (citaDTO.getEspecialidad() == null || citaDTO.getEspecialidad().trim().isEmpty()) {
            throw new NegocioException("Favor de seleccionar una especialidad.");
        }

        if (citaDTO.getDoctor() == null) {
            throw new NegocioException("Favor de seleccionar a un doctor.");
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


        // Para validar que se seleccione una fecha futura. Tal vez inecesario.
        Date fechaActual = new Date(System.currentTimeMillis());
        if (citaDTO.getFecha().before(fechaActual)) {
            throw new NegocioException("No se pudo seleccionar la fecha.");
        }

        // Validar horario de atención
        validarHorarioAtencion(citaDTO);


    }

    // Para validar la especialidad coincida con el doctor. Tal vez inecesario.
    private void validarEspecialidadDoctor(int idDoctor, String especialidad) throws NegocioException {
        try {
            String especialidadDoctor = doctorBO.consultarEspecialidad(idDoctor);
            if (!especialidadDoctor.equals(especialidad)) {
                throw new NegocioException("El doctor seleccionado no pertenece a la especialidad seleccionada.");
            }
        } catch (PersistenciaException ex) {
            throw new NegocioException("Hubo un error al validar la especialidad del doctor.", ex);
        }
    }



    private void validarDisponibilidadDoctor(AgendarCitaDTO citaDTO) throws NegocioException {
        try {

            // Para verificar que el doctor este activo.
            if (!doctorBO.estaActivo(citaDTO.getIdDoctor())) {
                throw new NegocioException("El doctor seleccionado no se encuentra disponible actualmente.");
            }

            // Para verificar si ya tiene una cita en ese horario.
            if (citaDAO.doctorTieneCitaEnHorario(citaDTO.getIdDoctor(), 
                citaDTO.getFecha(), citaDTO.getHora())) {
                throw new NegocioException("El doctor no tiene disponibilidad en ese momento.");
            }
        } catch (PersistenciaException ex) {
            throw new NegocioException("Hubo un error al validar la disponibilidad del doctor.", ex);
        }
    }

    
    // Para validar que el horario del doctor y la hora de la cita agendada coincidan.
    private void validarHorarioAtencion(AgendarCitaDTO citaDTO) throws NegocioException {
        try {
            List<horarioAtencion> horarios = doctorBO.consultarHorarioAtencion(citaDTO.getIdDoctor());
            String diaSemana = citaDTO.getFecha().toLocalDate().getDayOfWeek().toString();
            
            boolean horarioValido = false;
            for (horarioAtencion horario : horarios) {
                if (horario.getDia().equals(diaSemana)) {
                    if (citaDTO.getHora().after(horario.getHoraEntrada()) && 
                        citaDTO.getHora().before(horario.getHoraSalida())) {
                        horarioValido = true;
                        break;
                    }
                }
            }
            
            if (!horarioValido) {
                throw new NegocioException("La hora seleccionada esta fuera del horario de atención del doctor.");
            }
        } catch (PersistenciaException ex) {
            throw new NegocioException("Hubo un error al validar el horario de atencion.", ex);
        }


    }


 
}


