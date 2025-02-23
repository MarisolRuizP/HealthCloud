/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.IConexionBD;
import Entidades.Cita;
import Entidades.Consulta;
import Exception.PersistenciaException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jrasc
 */
public class ConsultaDAO implements IConsulta {

    private final IConexionBD conexion;
    private static final Logger logger = Logger.getLogger(PacienteDAO.class.getName());

    public ConsultaDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    @Override
    public Consulta Registrarconsulta(Consulta consulta) throws PersistenciaException {

        Cita cita = consulta.getCita();

        String sentenciaSQLRegistrarConsulta = "CALL registrarConsulta(?,?,?,?)";


        try (Connection con = conexion.crearConexion(); CallableStatement stm = con.prepareCall(sentenciaSQLRegistrarConsulta)) {

            stm.setString(1, consulta.getNotasMedicas());
            stm.setString(2, consulta.getReceta());
            stm.setString(3, consulta.getDiagnostico());
            stm.setInt(4, cita.getId());
            
            stm.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new PersistenciaException("Error al actualizar al paciente", ex);
        }
        return consulta;
    }
    
    
}
