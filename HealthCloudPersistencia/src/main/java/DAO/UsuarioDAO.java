/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.IConexionBD;
import Entidades.Usuario;
import Exception.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Maryr
 */
public class UsuarioDAO implements IUsuarioDAO {

    private final IConexionBD conexion;
    private static final Logger logger = Logger.getLogger(PacienteDAO.class.getName());

    public UsuarioDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    @Override
    public String iniciarSesion(String identificador, String contrasenia) throws PersistenciaException {
        Usuario usuario = consultarUSuarioPorIdentificador(identificador);       
        if (usuario != null) {
            if (BCrypt.checkpw(contrasenia, usuario.getContrasenia())) {
                return usuario.getTipoDeUsuario();
            } else {
                return "Contraseña incorrecta";
            }
        } else {
            return "Usuario no encontrado";
        }
    }

    @Override
    public Usuario consultarUSuarioPorIdentificador(String identificador) throws PersistenciaException {
        String sentenciaSQL = "SELECT contrasenia, tipoDeUsuario FROM usuarios WHERE identificador = ?";
        Usuario aux = null;
        try (Connection con = conexion.crearConexion(); PreparedStatement ps = con.prepareCall(sentenciaSQL)) {
            ps.setString(1, identificador);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    aux = new Usuario();
                    aux.setIdentificador(identificador);
                    aux.setContrasenia(rs.getString("contrasenia"));
                    aux.setTipoDeUsuario(rs.getString("tipoDeUsuario"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aux;
    }

}
