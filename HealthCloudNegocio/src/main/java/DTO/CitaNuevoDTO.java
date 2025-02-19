package DTO;

import Entidades.Doctor;
import Entidades.Paciente;
import java.time.LocalDate;
import java.time.LocalTime;

public class CitaNuevoDTO {

    private int folioEmergencia;
    private LocalDate fecha; // Manejar localDate para registrar fecha del sistema (agregar import)
    private LocalTime hora;
    private String motivo;
    private Paciente paciente; // Agregar dependencias
    private Doctor doctor; // Agregar dependencias

    // Constructor vacio
    public CitaNuevoDTO(){
    }

    // Constructor con todo
    public CitaNuevoDTO(int folioEmergencia, LocalDate fecha, LocalTime hora, String motivo, Paciente paciente, Doctor doctor) {
        this.folioEmergencia = folioEmergencia;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.paciente = paciente;
        this.doctor = doctor;
    }

    // Getters and Setters
    public int getFolioEmergencia() {
        return folioEmergencia;
    }

    public void setFolioEmergencia(int folioEmergencia) {
        this.folioEmergencia = folioEmergencia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
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
