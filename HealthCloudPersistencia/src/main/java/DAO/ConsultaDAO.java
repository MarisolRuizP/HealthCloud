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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public Cita obtenerCitaPorId(int idCita) throws PersistenciaException {
        String sql = "SELECT idCita, folioEmergencia, fecha, hora, motivo, estadoCita FROM Citas WHERE idCita = ?";
        Cita cita = null;

        try (Connection con = conexion.crearConexion(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, idCita);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Se encontró la cita con ID: " + idCita);
                    cita = new Cita(
                            rs.getString("folioEmergencia"),
                            rs.getDate("fecha"),
                            rs.getTime("hora"),
                            rs.getString("motivo"),
                            rs.getString("estadoCita"),
                            "Nombre Desconocido"
                    );
                    cita.setId(idCita);
                } else {
                    System.out.println("No se encontró ninguna cita con el ID :" + idCita);
                    return null;
                }
            }
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al obtener la cita con el ID: ", ex);
        }
        return cita;
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
            System.out.println("Consulta registrada en la base de datos.");
            
            cita.setEstadoCita("Completada");

        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new PersistenciaException("Error al registrar la consulta.", ex);
        }
        return consulta;
    }

}
