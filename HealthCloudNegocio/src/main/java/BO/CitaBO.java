package BO;

import Conexion.IConexionBD;
import DAO.CitaDAO;
import DAO.ICitaDAO;
import Entidades.Cita;
import Exception.NegocioException;
import Exception.PersistenciaException;
import java.sql.Date;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;



public class CitaBO {


    private final ICitaDAO citaDAO;
    private static final Logger logger = Logger.getLogger(CitaBO.class.getName());

    public CitaBO(IConexionBD conexion) {
        this.citaDAO = new CitaDAO(conexion);
    }

    // validaciones.
    public Cita agendarCita(CitaNuevoDTO citaDTO) throws NegocioException {
        try {

            validarCita(citaDTO);
            
            CitaMapper mapper = new CitaMapper();
            Cita cita = mapper.toEntity(citaDTO);
            
            Cita citaRegistrada = citaDAO.agendarCita(cita);
            
            return citaRegistrada;
        } catch (PersistenciaException ex) {
            logger.log(Level.SEVERE, "Hubo un error al agendar la cita.", ex);
            throw new NegocioException("No se pudo agendar la cita.", ex);
        }
    }

    private void validarCita(CitaNuevoDTO citaDTO) throws NegocioException {

        // Para validar la fecha
        Date fechaActual = new Date(System.currentTimeMillis());
        if (citaDTO.getFecha().before(fechaActual)) {
            throw new NegocioException("Favor de seleccionar la fecha.");
        }

        // Validar doctor
        if (citaDTO.getDoctor() == null) {
            throw new NegocioException("Favor de seleccionar a un doctor.");
        }

        // validar notas para el doctor
        if (citaDTO.getMotivo() == null || citaDTO.getMotivo().trim().isEmpty()) {
            throw new NegocioException("Favor de incluir notas para el doctor.");
        }

        // Validar hora dentro del horario de atención
        validarHorarioAtencion(citaDTO);
    }

    private void validarHorarioAtencion(CitaNuevoDTO citaDTO) throws NegocioException {
        try {


            // Consultar el horario de atencion del doctor de DoctorBO
            DoctorBO doctorBO = new DoctorBO(conexion);
            List<horarioAtencion> horarios = doctorBO.consultarHorarioAtencion(citaDTO.getDoctor().getIdDoctor());
            
            // Validar que la hora esté dentro del horario de atencion
            boolean horarioValido = false;
            Time horaCita = citaDTO.getHora();
            
            for (horarioAtencion horario : horarios) {
                if (horario.getDia().equals(obtenerDiaSemana(citaDTO.getFecha()))) {
                    if (horaCita.after(horario.getHoraEntrada()) && 
                        horaCita.before(horario.getHoraSalida())) {
                        horarioValido = true;
                        break;
                    }

                }

            }

            
            if (!horarioValido) {
                throw new NegocioException("La hora seleccionada está fuera del horario de atención del doctor.");
            }
            
        } catch (PersistenciaException ex) {
            throw new NegocioException("Hubo un error al validar horario de atención.", ex);
        }
    }

    ////////////////////////////////////////////////////////
    //private String obtenerDiaSemana(Date fecha) {
    //
    //    return fecha.toLocalDate().getDayOfWeek().toString();
    //}
    ///////////////////////////////////////////////////////
   


}


