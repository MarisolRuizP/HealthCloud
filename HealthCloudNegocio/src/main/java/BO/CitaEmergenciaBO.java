package BO;

import Conexion.IConexionBD;
import DAO.CitaEmergenciaDAO;
import DAO.ICitaEmergenciaDAO;
import Entidades.Cita;
import Exception.NegocioException;
import Exception.PersistenciaException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CitaEmergenciaBO {
    

    private final ICitaEmergenciaDAO citaEmergenciaDAO;


    private static final Logger logger = Logger.getLogger(CitaEmergenciaBO.class.getName());


    
    public CitaEmergenciaBO(IConexionBD conexion) {
        this.citaEmergenciaDAO = new CitaEmergenciaDAO(conexion);
    }
    
//    public Cita registrarCitaEmergencia(String especialidad) throws NegocioException {
//        try {
//
//            validarEspecialidad(especialidad);
//            
//            return citaEmergenciaDAO.registrarCitaEmergencia(especialidad);
//            
//        } catch (PersistenciaException ex) {
//            logger.log(Level.SEVERE, "Hubo un error al registrar cita de emergencia.", ex);
//            throw new NegocioException("No se pudo registrar la cita de emergencia,", ex);
//        }
//    }
    
    public void validarEspecialidad(String especialidad) throws NegocioException, PersistenciaException {

        if (especialidad == null || especialidad.trim().isEmpty()) {

            throw new NegocioException("Favor de incluir la especialidad.");
        }
        
        List<String> especialidadesDisponibles = citaEmergenciaDAO.obtenerEspecialidades();
        if (!especialidadesDisponibles.contains(especialidad)) {
            throw new NegocioException("La especialidad no esta disponible.");
        }
    }
    
    public List<String> obtenerEspecialidadesDisponibles() throws NegocioException {
        try {
            return citaEmergenciaDAO.obtenerEspecialidades();
        } catch (PersistenciaException ex) {
            logger.log(Level.SEVERE, "Hubo un error al obtener especialidades.", ex);
            throw new NegocioException("No se pudieron obtener las especialidades disponibles.", ex);

        }

    }

    
}
