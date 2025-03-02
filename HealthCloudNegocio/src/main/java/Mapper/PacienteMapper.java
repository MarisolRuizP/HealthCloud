
package Mapper;

import DTO.PacienteNuevoDTO;
import Entidades.Paciente;

public class PacienteMapper {

    public Paciente toEntity (PacienteNuevoDTO pacienteNuevo) {        
        
        Paciente paciente;
        paciente = new Paciente(pacienteNuevo.getIdPaciente(), pacienteNuevo.getNombrePila(), pacienteNuevo.getApellidoPaterno(), 
                pacienteNuevo.getApellidoMaterno(), pacienteNuevo.getNumTelefono(), new java.sql.Date(pacienteNuevo.getFechaNacimiento().getTime()), pacienteNuevo.getCorreoElectronico(),
                pacienteNuevo.getDireccion(), pacienteNuevo.getUsuario());
        
        return paciente; 
    }

    public PacienteNuevoDTO toDTO (Paciente paciente) {
        PacienteNuevoDTO pacienteDTO = new PacienteNuevoDTO(paciente.getIdPaciente(), paciente.getNombrePila(), paciente.getApellidoPaterno(),
        paciente.getApellidoMaterno(), paciente.getNumTelefono(), paciente.getFechaNacimiento(), paciente.getCorreoElectronico(), paciente.getDireccion(), paciente.getUsuario());
        return pacienteDTO;
    }

}
