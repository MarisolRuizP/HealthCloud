/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.sql.Time;
import java.sql.Date;

/**
 *
 * @author jrasc
 */
public class Cita {

    private int id;
    private String folioEmergencia;
    private Date fecha;
    private Time hora;
    private String motivo;
    private String estadoCita;
    private Paciente paciente;
    private String nombreDoctor;
    private String nombrePaciente;
    private String especialidad;
    private Doctor doctor;

    public Cita() {
    }

    public Cita(String folioEmergencia, Date fecha, Time hora, String motivo, String estadoCita, String nombrePaciente) {
        this.folioEmergencia = folioEmergencia;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estadoCita = estadoCita;
        this.nombrePaciente = nombrePaciente;
    }

    //constructor para el historial de citas
    public Cita(String folioEmergencia, Date fecha, Time hora, String motivo, String estadoCita, String nombreDoctor, String especialidad) {
        this.folioEmergencia = folioEmergencia;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estadoCita = estadoCita;
        this.nombreDoctor = nombreDoctor;
        this.especialidad = especialidad;
    }

    public Cita(String folioEmergencia, Date fecha, Time hora, String motivo, Paciente paciente, Doctor doctor) {
        this.folioEmergencia = folioEmergencia;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.paciente = paciente;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
