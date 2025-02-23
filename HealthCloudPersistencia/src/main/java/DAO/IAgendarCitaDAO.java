/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Entidades.Cita;
import Entidades.Paciente;
import Exception.PersistenciaException;
import java.util.List;

/**
 *
 * @author jrasc
 */
public interface IAgendarCitaDAO {
    
    public Cita agendarCita(Cita cita) throws PersistenciaException;
    public List<Cita> historialCitas (Paciente paciente) throws PersistenciaException;
        
}
