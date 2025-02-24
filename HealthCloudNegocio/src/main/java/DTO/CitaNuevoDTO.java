package DTO;

import Entidades.Doctor;
import Entidades.Paciente;
import java.sql.Time;
import java.util.Date;

public class CitaNuevoDTO {

    private String folioEmergencia;
    private Date fecha; // Manejar localDate para registrar fecha del sistema (agregar import)
    private Time hora;
    private String motivo;
    private Paciente paciente; // Agregar dependencias
    private Doctor doctor; // Agregar dependencias
    private String estadoCita;
    private String nombreDoctor;
    private String especialidad;

    // Constructor vacio
    public CitaNuevoDTO(){
    }

    // Constructor con todo
    public CitaNuevoDTO(String folioEmergencia, Date fecha, Time hora, String motivo, Paciente paciente, Doctor doctor) {
        this.folioEmergencia = folioEmergencia;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.paciente = paciente;
        this.doctor = doctor;
    }
    
    public CitaNuevoDTO(String folioEmergencia, Date fecha, Time hora, String motivo, String estadoCita, String nombreDoctor, String especialidad) {
        this.folioEmergencia = folioEmergencia;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estadoCita = estadoCita;
        this.nombreDoctor = nombreDoctor;
        this.especialidad = especialidad;
    }

    // Getters and Setters
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

    // toString
    @Override
    public String toString() {
        return "CitaNuevoDTO{" + "folioEmergencia=" + folioEmergencia + ", fecha=" + fecha + ", hora=" + hora + ", motivo=" + motivo + ", paciente=" + paciente + ", doctor=" + doctor + '}';
    }



}
