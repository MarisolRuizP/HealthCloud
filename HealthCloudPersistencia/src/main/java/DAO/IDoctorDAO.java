package DAO;

import Exception.PersistenciaException;


public interface IDoctorDAO {

   
    public boolean tieneCitasPendientes(int idDoctor) throws PersistenciaException;
    public void darBajaTemporal(int idDoctor) throws PersistenciaException;
    public boolean estaActivo(int idDoctor) throws PersistenciaException;

}