/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.sql.Time;


/**
 *
 * @author jrasc
 */
public class HorarioAtencion {

    private int id;
    private String dia;
    private Time horaEntrada;
    private Time horaSalida;
    private int idDoctor;

    public HorarioAtencion() {
    }

    public HorarioAtencion(String dia, Time horaEntrada, Time horaSalida, int idDoctor) {
        this.dia = dia;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.idDoctor = idDoctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Time getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getDoctor() {
        return idDoctor;
    }

    public void setDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

}
