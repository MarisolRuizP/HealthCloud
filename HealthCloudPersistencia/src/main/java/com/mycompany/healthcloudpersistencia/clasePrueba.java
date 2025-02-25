/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.healthcloudpersistencia;

import Conexion.ConexionBD;
import Conexion.IConexionBD;
import DAO.CitaDAO;
import DAO.DoctorDAO;
import DAO.PacienteDAO;
import Entidades.Cita;
import Entidades.Doctor;
import Exception.PersistenciaException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jrasc
 */
public class clasePrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ConexionBD conexion = new ConexionBD();
        DoctorDAO doctorDAO = new DoctorDAO(conexion);

        // Crear instancia del Doctor con datos de prueba
        Doctor nuevoDoctor = new Doctor();
        nuevoDoctor.setCedulaProfesional("12345678");
        nuevoDoctor.setNombrePila("Carlos");
        nuevoDoctor.setApellidoPaterno("González");
        nuevoDoctor.setApellidoMaterno("Hernández");
        nuevoDoctor.setIdEspecialidad(1); // Cambia según tu base de datos
        nuevoDoctor.setEstado("Activo");

        // Contraseña de prueba
        String contrasenia = "password123";

        try {
            // Llamar al método para agregar el doctor
            doctorDAO.agregarDoctorNuevo(nuevoDoctor, contrasenia);
            System.out.println("✅ Doctor registrado correctamente en la base de datos.");
        } catch (PersistenciaException ex) {
            Logger.getLogger(clasePrueba.class.getName()).log(Level.SEVERE, "❌ Error al registrar el doctor", ex);
        }
    }

}
