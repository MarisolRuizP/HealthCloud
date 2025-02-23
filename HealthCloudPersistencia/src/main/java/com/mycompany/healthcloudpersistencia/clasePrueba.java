/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.healthcloudpersistencia;

import Conexion.ConexionBD;
import Conexion.IConexionBD;
import DAO.CitaDAO;
import DAO.PacienteDAO;
import Entidades.Cita;
import Exception.PersistenciaException;
import java.util.List;

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
        PacienteDAO paciente = new PacienteDAO(conexion);
        CitaDAO citas = new CitaDAO(conexion);
        //            // Crear y agregar doctores
//            Usuario usuario1 = new Usuario();
//            usuario1.setContrasenia("contraseniaEncriptada1"); // Asegúrate de encriptar la contraseña
//            usuario1.setTipoDeUsuario("Medico");
//
//            Doctor doctor1 = new Doctor(
//                    "Juan",
//                    "Pérez",
//                    "González",
//                    1, // idEspecialidad, por ejemplo, Cardiología
//                    "1234567890",
//                    "Activo",
//                    usuario1
//            );
//            doctorDAO.agregarDoctorNuevo(doctor1, "contrasenia1");
//
//            Usuario usuario2 = new Usuario();
//            usuario2.setContrasenia("contraseniaEncriptada2");
//            usuario2.setTipoDeUsuario("Medico");
//
//            Doctor doctor2 = new Doctor(
//                    "María",
//                    "López",
//                    "Martínez",
//                    2, // idEspecialidad, por ejemplo, Dermatología
//                    "2345678901",
//                    "Activo",
//                    usuario2
//            );
//            doctorDAO.agregarDoctorNuevo(doctor2, "contrasenia2");
//
//            Usuario usuario3 = new Usuario();
//            usuario3.setContrasenia("contraseniaEncriptada3");
//            usuario3.setTipoDeUsuario("Medico");
//
//            Doctor doctor3 = new Doctor(
//                    "Pedro",
//                    "García",
//                    "Fernández",
//                    3, // idEspecialidad, por ejemplo, Pediatría
//                    "3456789012",
//                    "Activo",
//                    usuario3
//            );
//            doctorDAO.agregarDoctorNuevo(doctor3, "contrasenia3");
//
//            System.out.println("¡Doctores agregados exitosamente!");
//
//            // Agregar horarios de atención
//            doctorDAO.agregarHorarioAtencion(1, "Lunes", Time.valueOf("08:00:00"), Time.valueOf("12:00:00"));
//            doctorDAO.agregarHorarioAtencion(1, "Martes", Time.valueOf("09:00:00"), Time.valueOf("13:00:00"));
//            doctorDAO.agregarHorarioAtencion(1, "Miércoles", Time.valueOf("08:00:00"), Time.valueOf("12:00:00"));
//
//            doctorDAO.agregarHorarioAtencion(2, "Jueves", Time.valueOf("10:00:00"), Time.valueOf("14:00:00"));
//            doctorDAO.agregarHorarioAtencion(2, "Viernes", Time.valueOf("11:00:00"), Time.valueOf("15:00:00"));
//
//            doctorDAO.agregarHorarioAtencion(3, "Lunes", Time.valueOf("08:00:00"), Time.valueOf("12:00:00"));
//            doctorDAO.agregarHorarioAtencion(3, "Martes", Time.valueOf("09:00:00"), Time.valueOf("13:00:00"));
//            doctorDAO.agregarHorarioAtencion(3, "Jueves", Time.valueOf("08:00:00"), Time.valueOf("12:00:00"));
//
//            System.out.println("¡Horarios de atención agregados exitosamente!");
//        } catch (PersistenciaException ex) {
//            Logger.getLogger(clasePrueba.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    // Probar consultar especialidad
//        try {
//            String especialidad = doctorDAO.consultarEspecialidad(1);
//            System.out.println("Especialidad del doctor: " + especialidad);
//        } catch (PersistenciaException e) {
//            e.printStackTrace();
//        }
//// Probar consultar horario de atención
//        try {
//            List<horarioAtencion> horarios = doctorDAO.consultarHorarioAtencion(1);
//            for (horarioAtencion horario : horarios) {
//                System.out.println("Día: " + horario.getDia());
//                System.out.println("Hora de Entrada: " + horario.getHoraEntrada());
//                System.out.println("Hora de Salida: " + horario.getHoraSalida());
//                System.out.println();
//            }
//        } catch (PersistenciaException e) {
//            e.printStackTrace();
//        }
//// Probar obtener doctor por cédula
//        try {
//            Doctor doctorConsultado = doctorDAO.obtenerDoctorPorCedula("1234567890");
//            if (doctorConsultado != null) {
//                System.out.println("¡Doctor encontrado: " + doctorConsultado.getNombrePila() + " " + doctorConsultado.getApellidoPaterno() + "!");
//            } else {
//                System.out.println("No se encontró un doctor con esa cédula.");
//            }
//        } catch (PersistenciaException e) {
//            e.printStackTrace();
//        }
        int idPaciente = 1;

        // Probar obtener historial de citas
        try {
            List<Cita> historialCitas = citas.obtenerHistorialCitas(idPaciente);
            for (Cita cita : historialCitas) {
                System.out.println("Folio Emergencia: " + (cita.getFolioEmergencia() != null ? cita.getFolioEmergencia() : "N/A"));
                System.out.println("Fecha: " + cita.getFecha());
                System.out.println("Hora: " + cita.getHora());
                System.out.println("Motivo: " + cita.getMotivo());
                System.out.println("Estado: " + cita.getEstadoCita());
                System.out.println("Doctor: " + cita.getNombreDoctor());
                System.out.println("-------------------------------");
            }

        } catch (PersistenciaException e) {
            e.printStackTrace();
        }

    }

}
