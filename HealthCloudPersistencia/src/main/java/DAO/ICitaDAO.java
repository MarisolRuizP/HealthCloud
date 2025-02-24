/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Entidades.Cita;
import Entidades.Paciente;
import Exception.PersistenciaException;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

/**
 *
 * @author jrasc
 */
public interface ICitaDAO {
    
    public Cita agendarCita(Cita cita) throws PersistenciaException;
    public List<Cita> obtenerHistorialCitas (int idPaciente) throws PersistenciaException;
    public List<Cita> obtenerCitasDoctor(int idDoctor) throws PersistenciaException;
    public boolean doctorTieneCitaEnHorario(int idDoctor, Date fecha, Time hora) throws PersistenciaException;
}
