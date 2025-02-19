/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.healthcloudpersistencia;

import Conexion.ConexionBD;
import DAO.PacienteDAO;
import Entidades.Direccion;
import Entidades.Paciente;
import Entidades.Usuario;
import Exception.PersistenciaException;
import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author Maryr
 */
public class HealthCloudPersistencia {

    public static void main(String[] args) {

        // Instancia de la conexión a la base de datos
        ConexionBD conexionBD = new ConexionBD();

        // Instancia del DAO
        PacienteDAO pacienteDAO = new PacienteDAO(conexionBD);

        // Crear los objetos necesarios para la prueba
        Usuario usuario = new Usuario();
        usuario.setIdentificador("user123");
        usuario.setContrasenia("password");
        usuario.setTipoDeUsuario("Paciente");

        Direccion direccion = new Direccion();
        direccion.setCalleYNum("Calle 123");
        direccion.setColonia("Colonia ABC");
        direccion.setMunicipio("Municipio XYZ");

        Paciente paciente = new Paciente();
        paciente.setNombrePila("Juan");
        paciente.setApellidoPaterno("Pérez");
        paciente.setApellidoMaterno("López");
        paciente.setNumTelefono("1234567890");
        paciente.setFechaNacimiento(Date.valueOf(LocalDate.of(1990, 1, 1)));
        paciente.setCorreoElectronico("juan.perez@example.com");
        paciente.setUsuario(usuario);
        paciente.setDireccion(direccion);

        // Registrar el paciente
        try {
            Paciente pacienteRegistrado = pacienteDAO.registrarPaciente(paciente);
            System.out.println("Paciente registrado con éxito: " + pacienteRegistrado.getId());
        } catch (PersistenciaException e) {
            System.err.println("Error al registrar el paciente: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

    

