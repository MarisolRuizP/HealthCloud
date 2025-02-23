/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

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
    private String apellidoPaciente;
    private Doctor doctor;

    public Cita() {
    }

// Constructor que utiliza nombre y apellido del paciente
    public Cita(String folioEmergencia, Date fecha, Time hora, String motivo, String estadoCita, String nombrePaciente, String apellidoPaciente) {
        this.folioEmergencia = folioEmergencia;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estadoCita = estadoCita;
        this.nombrePaciente = nombrePaciente + " " + apellidoPaciente;
    }

// Constructor para historial de citas con el doctor
    public Cita(String folioEmergencia, Date fecha, Time hora, String motivo, String estadoCita, String nombreDoctor) {
        this.folioEmergencia = folioEmergencia;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estadoCita = estadoCita;
        this.nombreDoctor = nombreDoctor;
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

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public void setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }
    
}
