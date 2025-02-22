/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.IConexionBD;
import DAO.IUsuarioDAO;
import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import Entidades.Usuario;
import Exception.NegocioException;
import Exception.PersistenciaException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maryr
 */
public class UsuarioBO {

    private final IUsuarioDAO usuarioDAO;

    public UsuarioBO(IConexionBD conexion) {
        this.usuarioDAO = new UsuarioDAO(conexion);
    }

    public String iniciarSesion(String identificador, String contrasenia) throws NegocioException {
        String usuario = null;
        try {
            usuario = usuarioDAO.iniciarSesion(identificador, contrasenia);
        } catch (PersistenciaException ex) {
            Logger.getLogger(UsuarioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }

    public UsuarioDTO consultarUsuarioPorIdentificador(String identificador) throws NegocioException {
        Usuario usuario;
        try {
            usuario = usuarioDAO.consultarUSuarioPorIdentificador(identificador);
            if (usuario != null) {
                return new UsuarioDTO(usuario.getIdentificador(), usuario.getContrasenia(), usuario.getTipoDeUsuario());
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(UsuarioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
