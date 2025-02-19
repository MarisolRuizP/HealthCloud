package Mapper;

import DTO.PacienteNuevoDTO;
import Entidades.Paciente;
import java.sql.Date;

public class PacienteMapper {

    /**
     * Es necesario agregar la dependencia de Persistencia.
     * Realizar Clean and Build de HealthCloudPersistencia y agregar en Dependencia de HealthCloudNegocio.
     * Por ultimo realizar import necesario.
     */  

    public Paciente toEntity (PacienteNuevoDTO pacienteNuevo) {
        Paciente paciente = new Paciente(pacienteNuevo.getNombrePila(), pacienteNuevo.getApellidoPaterno(), 
        pacienteNuevo.getApellidoMaterno(), pacienteNuevo.getCorreoElectronico(), pacienteNuevo.getNumTelefono(), (Date) pacienteNuevo.getFechaNacimiento(), 
        pacienteNuevo.getContrasenia(), pacienteNuevo.getDireccion());
        return paciente;
    }

    public PacienteNuevoDTO toDTO (Paciente paciente) {
        PacienteNuevoDTO pacienteDTO = new PacienteNuevoDTO(paciente.getNombrePila(), paciente.getApellidoPaterno(),
        paciente.getApellidoMaterno(), paciente.getCorreoElectronico(), paciente.getNumTelefono(), paciente.getContrasenia(),
        paciente.getFechaNacimiento(), paciente.getDireccion());
        return pacienteDTO;
    }

}
