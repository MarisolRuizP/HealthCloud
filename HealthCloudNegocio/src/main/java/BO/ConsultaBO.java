/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.IConexionBD;
import DAO.ConsultaDAO;
import Entidades.Consulta;
import Exception.NegocioException;
import Exception.PersistenciaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import DAO.IConsultaDAO;

/**
 *
 * @author jrasc
 */
public class ConsultaBO {

    private final IConsultaDAO consultaDAO;
    private static final Logger logger = Logger.getLogger(ConsultaBO.class.getName());

    public ConsultaBO(IConexionBD conexion) {
        this.consultaDAO = new ConsultaDAO(conexion);
    }
    
    public Consulta registrarConsulta(Consulta consulta) throws NegocioException {

        try {
            if (consulta.getCita() == null) {
                throw new NegocioException("La consulta no puede generarse sin cita previa");
            }
            if (consulta.getCita().getId() == 0) {
                throw new NegocioException("La cita no existe");
            }
            if (consulta.getReceta() == null || consulta.getReceta().isEmpty()) {
                throw new NegocioException("La consulta debe llevar una receta médica, es obligatorio");
            }
            if (consulta.getNotasMedicas() == null || consulta.getNotasMedicas().isEmpty()) {
                throw new NegocioException("La consulta debe llevar notas médicas, es obligatorio");
            }
            if (consulta.getDiagnostico() == null || consulta.getDiagnostico().isEmpty()) {
                throw new NegocioException("La consulta debe llevar un diagnóstico, es obligatorio");
            }
            if (consulta.getCita().getEstadoCita() == null || consulta.getCita().getEstadoCita().equalsIgnoreCase("Cancelada")) {
                throw new NegocioException("La consulta no se puede generar si la cita ha sido cancelada");
            }
            if (consulta.getCita().getFecha().after(new java.util.Date())) {
                throw new NegocioException("No puedes consultar a una cita futura");
            }
            Consulta result = consultaDAO.registrarconsulta(consulta);
            logger.log(Level.INFO, "Consulta registrada exitosamente: {0}", result);
            return result;
        } catch (PersistenciaException ex) {
            logger.log(Level.SEVERE, "Error al registrar la consulta", ex);
            throw new NegocioException("Ocurrió un error al registrar la consulta: " + ex.getMessage(), ex);
        }
    }
}
