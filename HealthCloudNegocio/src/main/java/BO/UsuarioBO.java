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
import Exception.PersistenciaException;

/**
 *
 * @author Maryr
 */
public class UsuarioBO {

    private final IUsuarioDAO usuarioDAO;

    public UsuarioBO(IConexionBD conexion) {
        this.usuarioDAO = new UsuarioDAO(conexion);
    }

    public String iniciarSesion(String identificador, String contrasenia) throws PersistenciaException {
        String usuario = usuarioDAO.iniciarSesion(identificador, contrasenia);
        return usuario;
    }

    public UsuarioDTO consultarUsuarioPorIdentificador(String identificador) throws PersistenciaException {
        Usuario usuario = usuarioDAO.consultarUSuarioPorIdentificador(identificador);
        if (usuario != null) {
            return new UsuarioDTO(usuario.getIdentificador(), usuario.getContrasenia(), usuario.getTipoDeUsuario());
        }
        return null;

    }
}
