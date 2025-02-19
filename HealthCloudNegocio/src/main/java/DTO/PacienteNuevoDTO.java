package DTO;

import Entidades.Direccion;
import java.util.Date;

public class PacienteNuevoDTO {

    private String nombrePila;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correoElectronico;
    private String numTelefono;
    private Date fechaNacimiento;  // Realizar Import
    private Direccion direccion;

    // Constructor vacio
    public PacienteNuevoDTO() {
    }

    // Constructor con todo
    public PacienteNuevoDTO(String nombrePila, String apellidoPaterno, String apellidoMaterno, String numTelefono, Date fechaNacimiento, String correoElectronico, Direccion direccion) {
        this.nombrePila = nombrePila;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.numTelefono = numTelefono;
        this.fechaNacimiento = fechaNacimiento;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
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

   
}
