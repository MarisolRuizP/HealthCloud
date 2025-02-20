package BO;

import Conexion.IConexionBD;
import DAO.IPacienteDAO;
import DAO.PacienteDAO;
import DTO.PacienteNuevoDTO;
import Entidades.Paciente;
import Exception.NegocioException;
import Exception.PersistenciaException;
import Mapper.PacienteMapper;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PacienteBO {

    IPacienteDAO pacienteDAO;
    

    public PacienteBO (IConexionBD conexion) {
        this.pacienteDAO = new PacienteDAO (conexion);
    }

    public void ValidarPaciente (PacienteNuevoDTO pacienteNuevo) throws NegocioException {
        
        if (pacienteNuevo == null) {
            throw new NegocioException("Favor de llenar los espacios.");
        }

        if (pacienteNuevo.getNombrePila().isEmpty()) {
            throw new NegocioException("Favor de ingresar el nombre del paciente.");
        }

        if (pacienteNuevo.getApellidoPaterno().isEmpty()) {
            throw new NegocioException("Favor de ingresar el apellido paterno del paciente.");
        }

        if (pacienteNuevo.getNumTelefono().isEmpty()) {
            throw new NegocioException("Favor de ingresar el numero de telefono del paciente.");
        }

        if (pacienteNuevo.getFechaNacimiento() == null) {
            throw new NegocioException("Favor de introducir la fecha de nacimiento del paciente.");
        }

        if (pacienteNuevo.getCorreoElectronico().isEmpty()) {
            throw new NegocioException("Favor de agregar el correo del paciente.");
        }
        
        if (!pacienteNuevo.getCorreoElectronico().contains("@")) {
            throw new NegocioException("Correo no valido.");
        }

        if (pacienteNuevo.getDireccion() == null) {
            throw new NegocioException("Favor de agregar la direccion del paciente.");
        }

    }

    public String registrarPaciente (PacienteNuevoDTO pacienteNuevo) throws NegocioException {
        try {
            ValidarPaciente(pacienteNuevo);

            Paciente paciente = new Paciente();
            PacienteMapper convertidor = new PacienteMapper();
            paciente = convertidor.toEntity(pacienteNuevo);

            Paciente pacienteRegistrado = pacienteDAO.registrarPaciente(paciente);
            return "Paciente registrado";
        }catch (PersistenciaException ex) {
            Logger.getLogger(PacienteBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new NegocioException ("Ha ocurrido un error al registrar el paciente.", ex);
        }

    }

}
