/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

/**
 *
 * @author jrasc
 */
import BO.DoctorBO;
import BO.HistorialCitaBO;
import Conexion.ConexionBD;
import Conexion.IConexionBD;
import DTO.DoctorDTO;
import Entidades.Cita;
import Entidades.horarioAtencion;
import Exception.NegocioException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pruebas {

    public static void main(String[] args) {

        IConexionBD conexion = new ConexionBD();
        DoctorBO doctorBO = new DoctorBO(conexion);
        // Probar consultar especialidad
//            try {
//                String especialidad = doctorBO.consultarEspecialidad(1);
//                System.out.println("Especialidad del doctor: " + especialidad);
//            } catch (NegocioException e) {
//                e.printStackTrace();
//            }
//            
//            // Probar consultar horario de atención
//            List<horarioAtencion> horarios = doctorBO.consultarHorarioAtencion(1);
//            for (horarioAtencion horario : horarios) {
//                System.out.println("Día: " + horario.getDia());
//                System.out.println("Hora de Entrada: " + horario.getHoraEntrada());
//                System.out.println("Hora de Salida: " + horario.getHoraSalida());
//                System.out.println();
//            }
//            
//            // Probar obtener doctor por cédula
//            try {
//                DoctorDTO doctorConsultado = doctorBO.obtenerDoctorPorCedula("1234567890");
//                if (doctorConsultado != null) {
//                    System.out.println("¡Doctor encontrado: " + doctorConsultado.getNombrePila() + " " + doctorConsultado.getApellidoPaterno() + "!");
//                } else {
//                    System.out.println("No se encontró un doctor con esa cédula.");
//                }
//            } catch (NegocioException e) {
//                e.printStackTrace();
//            }
//            
//           
//            
//        } catch (NegocioException ex) {
//            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);

        HistorialCitaBO historialCitaBO = new HistorialCitaBO(conexion);

        // Identificador del paciente (por ejemplo, correo electrónico)
        String identificador = "sol@sol.com";

        // Probar obtener historial de citas
        try {
            List<Cita> historialCitas = historialCitaBO.obtenerHistorialCitas(identificador);
            if (historialCitas.isEmpty()) {
                System.out.println("No se encontraron citas para el paciente con identificador: " + identificador);
            }
            for (Cita cita : historialCitas) {
                System.out.println("Folio Emergencia: " + (cita.getFolioEmergencia() != null ? cita.getFolioEmergencia() : "N/A"));
                System.out.println("Fecha: " + cita.getFecha());
                System.out.println("Hora: " + cita.getHora());
                System.out.println("Motivo: " + cita.getMotivo());
                System.out.println("Estado: " + cita.getEstadoCita());
                System.out.println("Doctor: " + cita.getNombreDoctor());
                System.out.println("Especialidad: " + cita.getEspecialidad());
                System.out.println("-------------------------------");
            }
        } catch (NegocioException e) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, "Error al obtener el historial de citas.", e);
        }

    }

}
