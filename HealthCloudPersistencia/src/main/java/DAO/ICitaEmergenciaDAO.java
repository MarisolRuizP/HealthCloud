package DAO;

import Entidades.Cita;
import Exception.PersistenciaException;
import java.util.ArrayList;
import java.util.List;

public interface ICitaEmergenciaDAO {

    Cita registrarCitaEmergencia(String especialidad) throws PersistenciaException;
    List<String> obtenerEspecialidades() throws PersistenciaException;

}
