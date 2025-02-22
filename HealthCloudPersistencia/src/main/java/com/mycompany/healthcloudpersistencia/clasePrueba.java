/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.healthcloudpersistencia;

import Conexion.ConexionBD;
import Conexion.IConexionBD;
import DAO.AgendarCitaDAO;
import DAO.ConsultaDAO;
import DAO.IAgendarCitaDAO;
import DAO.IPacienteDAO;
import DAO.PacienteDAO;
import Entidades.Cita;
import Entidades.Consulta;
import Entidades.Direccion;
import Entidades.Doctor;
import Entidades.Paciente;
import Entidades.Usuario;
import Exception.PersistenciaException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

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
        // IPacienteDAO pacienteDAO = new PacienteDAO(conexion);
        // IAgendarCitaDAO citaDAO = new AgendarCitaDAO(conexion);
        /*Usuario usuario = new Usuario("pepepicapapas");
        Direccion direccion = new Direccion("reborte 12", "El pirata de culiacan", "asi nomas quedo");
        Paciente paciente = new Paciente(1, "elpiratita", "De Culiacan", "asinomasquedo", "6648371954", "repollo@1223.com", direccion, usuario);

        try {
            pacienteDAO.editarPaciente(paciente);
        } catch (PersistenciaException e) {
            e.printStackTrace();
        }*/
 /*
        Paciente paciente = new Paciente();
        paciente.setIdPaciente(1);
        
        Doctor doctor = new Doctor();
        doctor.setIdDoctor(1);
        
        Cita citaNueva = new Cita(null,LocalDate.of(2024, 2, 26), LocalTime.of(10, 30), "Balacearon al piratita", paciente, doctor);
        
        try{
        citaDAO.agendarCita(citaNueva);    
        } catch (PersistenciaException e){
            e.printStackTrace();
        }*/

//        ConsultaDAO consultaDAO = new ConsultaDAO(conexion);
//
//        Cita cita = new Cita();
//        cita.setId(1);
//
//        Consulta nuevaConsulta = new Consulta();
//        nuevaConsulta.setNotasMedicas("El piratita viene enfermillo");
//        nuevaConsulta.setReceta("Paracetamol hasta que se aliviane");
//        nuevaConsulta.setDiagnostico("Gripe aviar, influenza y covid");
//        nuevaConsulta.setCita(cita);
//
//        try {
//            Consulta consultaRegistrada = consultaDAO.Registrarconsulta(nuevaConsulta);
//
//        }catch(PersistenciaException e){
//            e.printStackTrace();
//        }

        PacienteDAO paciente = new PacienteDAO(conexion);
        //Paciente  pacienteAct = new Paciente("marisol", "ruiz", "pacheco", "1234567899", new Date(2005, 5, 20), );

    }

}
