package DAO;

import Entidades.Doctor;
import Entidades.horarioAtencion;
import Exception.PersistenciaException;
import java.util.List;


public interface IDoctorDAO {

    public void agregarDoctorNuevo(Doctor doctor, String contrasenia) throws PersistenciaException;
    public Doctor obtenerDoctorPorCedula(String cedulaProfesional) throws PersistenciaException;
    public String consultarEspecialidad(int idDoctor) throws PersistenciaException;
    public List<horarioAtencion> consultarHorarioAtencion(int idDoctor) throws PersistenciaException;
    public boolean tieneCitasPendientes(int idDoctor) throws PersistenciaException;
    public void darBajaTemporal(int idDoctor) throws PersistenciaException;
    public boolean estaActivo(int idDoctor) throws PersistenciaException;
    public List<Doctor> obtenerDoctoresPorEspecialidad(String especialidad) throws PersistenciaException;

}