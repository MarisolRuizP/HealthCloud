package Mapper;

import DTO.PacienteNuevoDTO;
import Entidades.Paciente;
import java.sql.Date;

public class PacienteMapper {

    public Paciente toEntity (PacienteNuevoDTO pacienteNuevo) {
        Paciente paciente;
        paciente = new Paciente(pacienteNuevo.getNombrePila(), pacienteNuevo.getApellidoPaterno(), 
                pacienteNuevo.getApellidoMaterno(), pacienteNuevo.getNumTelefono(), (Date) pacienteNuevo.getFechaNacimiento(), pacienteNuevo.getCorreoElectronico(),
                pacienteNuevo.getDireccion());
        return paciente;
    }

    public PacienteNuevoDTO toDTO (Paciente paciente) {
        PacienteNuevoDTO pacienteDTO = new PacienteNuevoDTO(paciente.getNombrePila(), paciente.getApellidoPaterno(),
        paciente.getApellidoMaterno(), paciente.getNumTelefono(), paciente.getFechaNacimiento(), paciente.getCorreoElectronico(), paciente.getDireccion());
        return pacienteDTO;
    }

}
