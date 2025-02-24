package DAO;

import Entidades.Cita;
import Entidades.Doctor;
import Exception.PersistenciaException;
import java.util.ArrayList;
import java.util.List;

public interface ICitaEmergenciaDAO {

    public Doctor buscarDoctorConEspacioLibreMasPronto(String especialidad) throws PersistenciaException;
    public boolean verificarFolioEnBD(String folio) throws PersistenciaException;
    public String generarFolioUnico() throws PersistenciaException;

}
