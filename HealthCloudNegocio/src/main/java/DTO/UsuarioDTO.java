/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Maryr
 */
public class UsuarioDTO {

    private int id;
    private String identificador;
    private String contrasenia;
    private String tipoDeUsuario;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public UsuarioDTO(String identificador, String contrasenia, String tipoDeUsuario) {
        this.identificador = identificador;
        this.contrasenia = contrasenia;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

}
