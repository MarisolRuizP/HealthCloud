package DAO;

import Conexion.IConexionBD;
import Entidades.Doctor;
import Exception.PersistenciaException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoctorDAO implements IDoctorDAO {
    
    private final IConexionBD conexion;
    private static final Logger logger = Logger.getLogger (DoctorDAO.class.getName());

    public DoctorDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }


    /**
    * Para verificar si tiene citas pendientes el doc
    * 
    */

    @Override
    public boolean tieneCitasPendientes(int idDoctor) throws PersistenciaException {

        String sql = "SELECT COUNT(*) FROM Citas WHERE idDoctor = ? AND fecha >= CURDATE()";
        
        try (Connection con = conexion.crearConexion();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            
            stmt.setInt(1, idDoctor);
            
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
            
            return false;
            
        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "Hubo un error al verificar las citas pendientes", ex);
            throw new PersistenciaException("blablabla", ex);
        }
    }

    /**
    * Para que se pueda dar de baja temporal el doc
    * 
    */
    @Override
    public void darBajaTemporal (int idDoctor) throws PersistenciaException {

        String sql = "UPDATE Doctores SET activo = false WHERE idDoctor = ?";
        
        try (Connection con = conexion.crearConexion();
            PreparedStatement stmt = con.prepareStatement(sql)) {
            
            stmt.setInt(1, idDoctor);
            int filasAfectadas = stmt.executeUpdate();
            
            if (filasAfectadas == 0) {
                throw new PersistenciaException ("No se encontro el ID.");
            }
            
        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "Ocurrio un error al dar de baja al doctor", ex);
            throw new PersistenciaException("Otro error", ex);
        }
    }
    
    // Para verificar que el doctor este activo
    @Override
    public boolean estaActivo(int idDoctor) throws PersistenciaException {
        String sql = "SELECT activo FROM Doctores WHERE idDoctor = ?";
        
        try (Connection con = conexion.crearConexion();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            
            stmt.setInt(1, idDoctor);
            
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getBoolean("Activo.");
                }
                throw new PersistenciaException("Doctor no encontrado.");
            }
            
        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "Hubo un error al verificar estado del doctor.", ex);
            throw new PersistenciaException("Hubo un error al verificar al doctor.", ex);

        }

    }



    
}