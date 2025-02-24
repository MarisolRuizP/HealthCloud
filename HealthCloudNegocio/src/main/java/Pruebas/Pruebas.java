/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

/**
 *
 * @author jrasc
 */
import BO.ConsultaBO;
import BO.DoctorBO;
import BO.HistorialCitaBO;
import Conexion.ConexionBD;
import Conexion.IConexionBD;
import DAO.ConsultaDAO;
import DTO.DoctorDTO;
import Entidades.Cita;
import Entidades.Consulta;
import Entidades.horarioAtencion;
import Exception.NegocioException;
import Exception.PersistenciaException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pruebas {

    public static void main(String[] args) {

        IConexionBD conexion = new ConexionBD();
        // DoctorBO doctorBO = new DoctorBO(conexion);
        ConsultaDAO consultaDAO = new ConsultaDAO(conexion);
        ConsultaBO consultaBO = new ConsultaBO(conexion);

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
        /*HistorialCitaBO historialCitaBO = new HistorialCitaBO(conexion);
         */
 /*
        String identificador = "sol@sol.com";

        
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
        int idDoctor = 2;

        try {
            System.out.println("Solicitando baja temporal para el doctor con ID: " + idDoctor);
            doctorBO.solicitarBajaTemporal(idDoctor);
            System.out.println("Baja temporal realizada con éxito para el doctor con ID: " + idDoctor);

        } catch (NegocioException ex) {
            System.out.println("Error al solicitar baja temporal: " + ex.getMessage());
            ex.printStackTrace();
        }*/
        try {
            Cita cita1 = consultaDAO.obtenerCitaPorId(1);
            if (cita1 == null) {
                System.out.println("La cita no existe o no se ha encontrado.");
                return;
            }
            Consulta consulta = new Consulta("El paciente llegó pidiendo agua", "2 paracetamol para aliviar", "Gripe aviar", cita1);
            Consulta registrarConsulta = consultaBO.registrarConsulta(consulta);

        } catch (NegocioException e) {
            System.out.println("Error al registrar la consulta: " + e.getMessage());
            e.printStackTrace();
        } catch (PersistenciaException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, "Error de persistencia: ", ex);
        }

        try {
            Cita citaInvalida = new Cita("F7654321", java.sql.Date.valueOf("2025-02-23"), java.sql.Time.valueOf("09:00:00"), "Consulta general", "Pendiente", "Paciente 2");
            citaInvalida.setId(3);

            Consulta consultaInvalida = new Consulta("Paciente llegó tarde", "Receta: ibuprofeno", "Dolor cabeza", citaInvalida);

            consultaBO.registrarConsulta(consultaInvalida);
            System.out.println("Consulta registrada fuera de los 30 minutos.");

        } catch (NegocioException e) {
            System.out.println("Error al registrar consulta fuera del tiempo permitido: " + e.getMessage());
        }
    }
}
