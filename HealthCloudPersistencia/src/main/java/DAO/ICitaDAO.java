/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Entidades.Cita;
import Entidades.Doctor;
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
    public List<String> obtenerEspecialidades() throws PersistenciaException;
    public List<Doctor> obtenerDoctoresPorEspecialidad(String especialidad) throws PersistenciaException;
    public List<Time> obtenerHorasAtencion(String identificador,  Date fecha) throws PersistenciaException;
    public void cancelarCita(int idCita) throws PersistenciaException;
}
