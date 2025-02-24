package DTO;

import java.sql.Time;
import java.sql.Date;

public class AgendarCitaDTO {

    private String especialidad;
    private int idDoctor;
    private Date fecha;
    private Time hora;
    private String notasParaDoctor;
    private int idPaciente;
    private String folioEmergencia;

    // Constructor con todo.
    public AgendarCitaDTO(String especialidad, int idDoctor, Date fecha, Time hora, String notasParaDoctor, int idPaciente) {
        this.especialidad = especialidad;
        this.idDoctor = idDoctor;
        this.fecha = fecha;
        this.hora = hora;
        this.notasParaDoctor = notasParaDoctor;
        this.idPaciente = idPaciente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
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

    public String getNotasParaDoctor() {
        return notasParaDoctor;
    }

    public void setNotasParaDoctor(String notasParaDoctor) {
        this.notasParaDoctor = notasParaDoctor;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getFolioEmergencia() {
        return folioEmergencia;
    }

    public void setFolioEmergencia(String folioEmergencia) {
        this.folioEmergencia = folioEmergencia;
    }

}
