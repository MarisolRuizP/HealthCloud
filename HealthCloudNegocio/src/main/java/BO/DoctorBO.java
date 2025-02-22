package BO;

import Conexion.IConexionBD;
import DAO.DoctorDAO;
import DAO.IDoctorDAO;
import Exception.NegocioException;
import Exception.PersistenciaException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoctorBO {
    
    private final IDoctorDAO doctorDAO;
    private static final Logger logger = Logger.getLogger(DoctorBO.class.getName());
    
    public DoctorBO(IConexionBD conexion) {
        this.doctorDAO = new DoctorDAO(conexion);
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
}
