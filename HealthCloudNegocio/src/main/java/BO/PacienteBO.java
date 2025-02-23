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
        
        if (!pacienteNuevo.getNumTelefono().matches("^\\d{10}$")) {
            throw new NegocioException("Favor de ingresar el numero de telefono valido");
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

    public void ValidarPacienteActualizacion (PacienteNuevoDTO pacienteActualizar) throws NegocioException {

        if (pacienteActualizar == null) {
            throw new NegocioException("Favor de llenar los espacios.");
        }
    
        // Mas validaciones pero mejores (verificar que funcionen)
        if (pacienteActualizar.getNombrePila() == null || pacienteActualizar.getNombrePila().trim().isEmpty()) {
            throw new NegocioException("Favor de incluir el nombre.");
        }
    
        if (pacienteActualizar.getApellidoPaterno() == null || pacienteActualizar.getApellidoPaterno().trim().isEmpty()) {
            throw new NegocioException("Favor de incluir el apellido paterno.");
        }
    
        if (pacienteActualizar.getNumTelefono() == null || pacienteActualizar.getNumTelefono().trim().isEmpty()) {
            throw new NegocioException("El número de teléfono es obligatorio.");
        }
        
        if (!pacienteActualizar.getNumTelefono().matches("^\\d{10}$")) {
            throw new NegocioException("El número de teléfono es invalido.");
        }            
    
        if (pacienteActualizar.getCorreoElectronico() == null || pacienteActualizar.getCorreoElectronico().trim().isEmpty()) {
            throw new NegocioException("El correo electrónico es obligatorio.");
        }
    
        if (!pacienteActualizar.getCorreoElectronico().contains("@")) {
            throw new NegocioException("El formato del correo electrónico no es válido.");
        }
    
        if (pacienteActualizar.getDireccion() == null) {
            throw new NegocioException("La dirección es obligatoria.");
        }
    
    }
    
    public String actualizarPaciente(PacienteNuevoDTO pacienteActualizar) throws NegocioException {
        try {
        
            ValidarPacienteActualizacion(pacienteActualizar);
        
            PacienteMapper convertidor = new PacienteMapper();
            Paciente paciente = convertidor.toEntity(pacienteActualizar);
    
        
            Paciente pacienteActualizado = pacienteDAO.actualizarPaciente(paciente);
            
            if (pacienteActualizado != null) {
                return "Paciente actualizado";
            } else {
                throw new NegocioException("No se pudo actualizar el paciente");
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(PacienteBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new NegocioException("Ha ocurrido un error al registrar el paciente." , ex);
        }
    }

    public PacienteNuevoDTO consultarPacientePorCorreo(String correo) throws NegocioException {
        try {
            Paciente  paciente = pacienteDAO.consultarPacientePorCorreo(correo);
            if(paciente != null) {
                return new PacienteNuevoDTO(paciente.getIdPaciente(), paciente.getNombrePila(), paciente.getApellidoPaterno(), paciente.getApellidoMaterno(), 
                        paciente.getCorreoElectronico(), paciente.getFechaNacimiento(), paciente.getNumTelefono(), paciente.getDireccion(), paciente.getUsuario());
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(PacienteBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new NegocioException("Ha ocurrido un error al registrar el paciente." , ex);
        }
        return null;
    }
}
