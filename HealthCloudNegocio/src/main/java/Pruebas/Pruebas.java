/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

/**
 *
 * @author jrasc
 */
import BO.CitaBO;
import BO.DoctorBO;
import Conexion.ConexionBD;
import Conexion.IConexionBD;
import DAO.CitaDAO;
import DAO.ICitaDAO;
import DTO.AgendarCitaDTO;
import Entidades.Cita;
import Exception.NegocioException;
import java.sql.Date;
import java.sql.Time;

public class Pruebas {

    public static void main(String[] args) {
        try {
            // Inicializar dependencias necesarias
            IConexionBD conexion = new ConexionBD(); // Implementa tu propia conexión a BD
            ICitaDAO citaDAO = new CitaDAO(conexion);
            DoctorBO doctorBO = new DoctorBO(conexion, citaDAO);

            // Crear una instancia de CitaBO
            CitaBO citaBO = new CitaBO(conexion);

            Date fecha = Date.valueOf("2025-12-02");
            Time hora = Time.valueOf("10:00:00");
            System.out.println("Fecha: " + fecha);
            System.out.println("Hora: " + hora);
            // Crear un objeto AgendarCitaDTO para la prueba
            AgendarCitaDTO citaDTO = new AgendarCitaDTO(
                    "Cardiología",
                    1,
                    fecha,
                    hora,
                    "Revisión general",
                    1
            );

            // Probar agendar una cita
            Cita citaAgendada = citaBO.agendarCita(citaDTO);

            // Mostrar resultado
            if (citaAgendada != null) {
                System.out.println("Cita agendada con éxito.");
            } else {
                System.out.println("No se pudo agendar la cita.");
            }
        } catch (NegocioException e) {
            System.out.println("Error de negocio: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
