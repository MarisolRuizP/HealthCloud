package DTO;

import Entidades.Direccion;
import Entidades.Usuario;
import java.util.Date;

public class PacienteNuevoDTO {

    private String nombrePila;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correoElectronico;
    private String numTelefono;
    private Date fechaNacimiento; 
    private Direccion direccion;
    private Usuario usuario;

    // Constructor vacio
    public PacienteNuevoDTO() {
    }

    // Constructor con todo
    public PacienteNuevoDTO(String nombrePila, String apellidoPaterno, String apellidoMaterno, String numTelefono, Date fechaNacimiento, String correoElectronico, Direccion direccion, Usuario usuario) {
        this.nombrePila = nombrePila;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.numTelefono = numTelefono;
        this.fechaNacimiento = fechaNacimiento;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.usuario = usuario;
    }

    public String getNombrePila() {
        return nombrePila;
    }

    public void setNombrePila(String nombrePila) {
        this.nombrePila = nombrePila;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "PacienteNuevoDTO{" + "nombrePila=" + nombrePila + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", correoElectronico=" + correoElectronico + ", numTelefono=" + numTelefono + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + '}';
    }
   
}
