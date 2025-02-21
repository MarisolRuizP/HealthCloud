/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.sql.Date;

/**
 *
 * @author jrasc
 */
public class Paciente extends Usuario {
    
    private int idPaciente;
    private String nombrePila;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String numTelefono;
    private Date fechaNacimiento;
    private String correoElectronico;
    private Direccion direccion;
    private Usuario usuario;

    public Paciente() {
    }

    public Paciente(String nombrePila, String apellidoPaterno, String apellidoMaterno, String numTelefono, Date fechaNacimiento, String correoElectronico, Direccion direccion, Usuario usuario) {
        this.nombrePila = nombrePila;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.numTelefono = numTelefono;
        this.fechaNacimiento = fechaNacimiento;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.usuario = usuario;
    }

    public Paciente(int idPaciente, String nombrePila, String apellidoPaterno, String apellidoMaterno, String numTelefono,String correoElectronico, Direccion direccion, Usuario usuario) {
        this.idPaciente = idPaciente;
        this.nombrePila = nombrePila;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.numTelefono = numTelefono;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.usuario = usuario;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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

}
