/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

/**
 *
 * @author jrasc
 */
import BO.PacienteBO;
import Conexion.ConexionBD;
import Conexion.IConexionBD;
import DAO.IPacienteDAO;
import DAO.PacienteDAO;
import DTO.PacienteNuevoDTO;
import Entidades.Direccion;
import Entidades.Usuario;
import Exception.NegocioException;
import java.util.Date;

public class Pruebas {

    public static void main(String[] args) {
        IConexionBD conexion = new ConexionBD();
        IPacienteDAO pacienteDAO = new PacienteDAO(conexion);
        PacienteNuevoDTO pacienteNuevo = new PacienteNuevoDTO();
        PacienteBO paciente = new PacienteBO(conexion);
        Usuario usuario = new Usuario();

        Direccion direccion = new Direccion("fefef", "mario armando", "culiacan");
        Date fechaNacimiento = new Date(1999, 2, 24);

        pacienteNuevo.setNombrePila("Juanito");
        pacienteNuevo.setApellidoMaterno("Perez");
        pacienteNuevo.setApellidoPaterno("lopez");
        pacienteNuevo.setCorreoElectronico("abvd64@hotmail.com");
        pacienteNuevo.setDireccion(direccion);
        pacienteNuevo.setFechaNacimiento(fechaNacimiento);
        pacienteNuevo.setNumTelefono("6666666666");
       

        try {
            String mensaje = paciente.registrarPaciente(pacienteNuevo);
            System.out.println(mensaje);
        } catch (NegocioException e) {
            System.out.println("El error fue: " + e.getMessage());
        }
    }
}
