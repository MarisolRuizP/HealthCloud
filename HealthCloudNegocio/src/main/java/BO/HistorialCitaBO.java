/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.IConexionBD;
import DAO.CitaDAO;
import DTO.DoctorDTO;
import DTO.PacienteNuevoDTO;
import Entidades.Cita;
import Entidades.Doctor;
import Exception.NegocioException;
import Exception.PersistenciaException;
import java.util.List;

/**
 *
 * @author jrasc
 */
public class HistorialCitaBO {

    private final CitaDAO historialCita;
    private PacienteBO pacienteBO;
    private DoctorBO doctorBO;

    public HistorialCitaBO(IConexionBD conexion) {
        this.historialCita = new CitaDAO(conexion);
        pacienteBO = new PacienteBO(conexion);
        doctorBO = new DoctorBO(conexion, null);
    }

    public List<Cita> obtenerHistorialCitas(String identificador) throws NegocioException {
        try {
            PacienteNuevoDTO paciente = pacienteBO.consultarPacientePorCorreo(identificador);
            if (paciente != null) {
                return historialCita.obtenerHistorialCitas(paciente.getIdPaciente());
            } else {
                throw new NegocioException("No se encontró el paciente");
            }
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al ver las citas", e);
        }
    }



    public List<Cita> obtenerCitasDoctor(String identificador) throws NegocioException {
        try {
            DoctorDTO docAux = doctorBO.obtenerDoctorPorCedula(identificador);
            List<Cita> citas = historialCita.obtenerCitasDoctor(docAux.getIdDoctor());
            if (citas.isEmpty()) {
                throw new NegocioException("El doctor con ID: " + docAux.getIdDoctor() + "No tiene citas programadas");
            }
            return citas;
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al obtener las citas del doctor", e);
        }
    }

}
