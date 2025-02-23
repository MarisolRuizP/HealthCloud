/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.IConexionBD;
import DAO.AgendarCitaDAO;
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

    private final AgendarCitaDAO historialCita;

    public HistorialCitaBO(IConexionBD conexion) {
        this.historialCita = new AgendarCitaDAO(conexion); // Se inicializa correctamente
    }

    public List<Cita> obtenerHistorialCitas(Paciente paciente) throws NegocioException {
        try {
            if (paciente.getIdPaciente() <= 0) {
                throw new NegocioException("El paciente no existe");
            }
            return historialCita.historialCitas(paciente);

        } catch (PersistenciaException e) {
            throw new NegocioException("Error al ver las citas", e);
        }
    }
}

