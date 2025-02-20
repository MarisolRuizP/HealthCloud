package Mapper;

import DTO.PacienteNuevoDTO;
import Entidades.Paciente;
import Entidades.Usuario;
import java.sql.Date;

public class PacienteMapper {

    public Paciente toEntity (PacienteNuevoDTO pacienteNuevo) {
        
        Usuario usuario = new Usuario();
        usuario.setIdentificador(pacienteNuevo.getCorreoElectronico());
        usuario.setContrasenia("1234");
        usuario.setTipoDeUsuario("PACIENTE");
        
        Paciente paciente;
        paciente = new Paciente(pacienteNuevo.getNombrePila(), pacienteNuevo.getApellidoPaterno(), 
                pacienteNuevo.getApellidoMaterno(), pacienteNuevo.getNumTelefono(), new java.sql.Date(pacienteNuevo.getFechaNacimiento().getTime()), pacienteNuevo.getCorreoElectronico(),
                pacienteNuevo.getDireccion());
        
        paciente.setUsuario(usuario);
        return paciente;
    }

    public PacienteNuevoDTO toDTO (Paciente paciente) {
        PacienteNuevoDTO pacienteDTO = new PacienteNuevoDTO(paciente.getNombrePila(), paciente.getApellidoPaterno(),
        paciente.getApellidoMaterno(), paciente.getNumTelefono(), paciente.getFechaNacimiento(), paciente.getCorreoElectronico(), paciente.getDireccion());
        return pacienteDTO;
    }

}
