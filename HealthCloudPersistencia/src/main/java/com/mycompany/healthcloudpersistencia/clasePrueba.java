/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.healthcloudpersistencia;

import Conexion.ConexionBD;
import Conexion.IConexionBD;
import DAO.IPacienteDAO;
import DAO.PacienteDAO;
import Entidades.Direccion;
import Entidades.Paciente;
import Entidades.Usuario;
import Exception.PersistenciaException;

/**
 *
 * @author jrasc
 */
public class clasePrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IConexionBD conexion = new ConexionBD();
        IPacienteDAO pacienteDAO = new PacienteDAO(conexion);

        Usuario usuario = new Usuario("pepepicapapas");
        Direccion direccion = new Direccion("reborte 12", "El pirata de culiacan", "asi nomas quedo");
        Paciente paciente = new Paciente(1, "elpiratita", "De Culiacan", "asinomasquedo", "6648371954", "repollo@1223.com", direccion, usuario);

        try {
            pacienteDAO.editarPaciente(paciente);
        } catch (PersistenciaException e) {
            e.printStackTrace();
        }
    }

}
