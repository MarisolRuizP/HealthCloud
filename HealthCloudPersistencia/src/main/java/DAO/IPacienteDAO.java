/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Entidades.Paciente;
import Exception.PersistenciaException;

/**
 *
 * @author jrasc
 */
public interface IPacienteDAO {
    
    public Paciente registrarPaciente(Paciente paciente) throws PersistenciaException;
    public Paciente editarPaciente(Paciente paciente) throws PersistenciaException;
    public  Paciente consultarPacientePorCorreo(String correo) throws PersistenciaException;
 }
