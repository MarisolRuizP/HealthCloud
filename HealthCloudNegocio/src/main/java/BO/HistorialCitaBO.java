/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.IConexionBD;
import DAO.CitaDAO;
import DTO.PacienteNuevoDTO;
import Entidades.Cita;
import Entidades.Paciente;
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

    public HistorialCitaBO(IConexionBD conexion) {
        this.historialCita = new CitaDAO(conexion); 
        pacienteBO = new PacienteBO(conexion);
    }

    public List<Cita> obtenerHistorialCitas(String identificador) throws NegocioException {
        try {
            PacienteNuevoDTO paciente = pacienteBO.consultarPacientePorCorreo(identificador);
            if(paciente != null) {
            return historialCita.obtenerHistorialCitas(paciente.getIdPaciente());
            } else {
                throw new NegocioException("No se encontró el paciente");
            }
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al ver las citas", e);
        }
    }
}

