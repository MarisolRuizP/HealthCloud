/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.Cita;
import Entidades.Consulta;
import Exception.PersistenciaException;

/**
 *
 * @author jrasc
 */
public interface IConsulta {
    
    public Consulta Registrarconsulta (Consulta consulta) throws PersistenciaException;
    public Cita obtenerCitaPorId(int idCita) throws PersistenciaException;
}
