/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Entidades.Usuario;
import Exception.PersistenciaException;

/**
 *
 * @author Maryr
 */
public interface IUsuarioDAO {
    
    public String iniciarSesion(String identificador, String contrasenia) throws PersistenciaException;
    
    public Usuario consultarUsuarioPorIdentificador(String identificador) throws PersistenciaException; 
}
