/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.IConexionBD;
import DAO.ConsultaDAO;
import DAO.IConsulta;
import Entidades.Consulta;
import Exception.NegocioException;
import Exception.PersistenciaException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jrasc
 */
public class ConsultaBO {

    private final IConsulta consultaDAO;
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
            if (consulta.getReceta() == null) {
                throw new NegocioException("La consulta debe llevar una receta medica, es obligatorio");
            }
            if (consulta.getNotasMedicas() == null) {
                throw new NegocioException("La consulta debe llevar notas medicas, es obligatorio");
            }
            System.out.println(consulta.getCita().getEstadoCita());
            if (consulta.getCita().getEstadoCita() == null || consulta.getCita().getEstadoCita().equalsIgnoreCase("Cancelada")) {
                throw new NegocioException("La consulta no se puede generar si la cita ha sido cancelada");
            }
            if (consulta.getCita().getFecha().after(new java.util.Date())) {
                throw new NegocioException("No puedes consultar a una cita futura");
            }
            return consultaDAO.Registrarconsulta(consulta);
        } catch (PersistenciaException ex) {
            logger.log(Level.SEVERE, "Error al registrar la consulta", ex);
            throw new NegocioException("Ocurrió un error al registrar la consulta: " + ex.getMessage(), ex);
        }
    }
}
