/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author jrasc
 */
public class CitaDTO {

    private int id;
    private String folioEmergencia;
    private Date fecha;
    private Time hora;
    private String motivo;
    private String estadoCita;
    private String nombreDoctor;
    private String nombrePaciente;
    private String especialidad;

    public CitaDTO() {
    }

    public CitaDTO(int id, String folioEmergencia, Date fecha, Time hora, String motivo, String estadoCita, String nombreDoctor, String nombrePaciente, String especialidad) {
        this.id = id;
        this.folioEmergencia = folioEmergencia;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estadoCita = estadoCita;
        this.nombreDoctor = nombreDoctor;
        this.nombrePaciente = nombrePaciente;
        this.especialidad = especialidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFolioEmergencia() {
        return folioEmergencia;
    }

    public void setFolioEmergencia(String folioEmergencia) {
        this.folioEmergencia = folioEmergencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}


