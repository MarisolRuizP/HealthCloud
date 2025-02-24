package Mapper;

import DTO.AgendarCitaDTO;
import DTO.CitaNuevoDTO;
import Entidades.Cita;
import Entidades.Doctor;
import Entidades.Paciente;
import java.sql.Date;

public class CitaMapper {

    /**
     * Es necesario agregar la dependencia de Persistencia.
     * Realizar Clean and Build de HealthCloudPersistencia y agregar en Dependencia de HealthCloudNegocio.
     * Por ultimo realizar import necesario.
     */

    public Cita toEntity (CitaNuevoDTO citaNuevo) {
        Cita cita = new Cita(citaNuevo.getFolioEmergencia(), (Date) citaNuevo.getFecha(), citaNuevo.getHora(), citaNuevo.getMotivo(),
        citaNuevo.getPaciente(), citaNuevo.getDoctor());
        return cita;
    }

    public CitaNuevoDTO toDTO (Cita cita) {
        CitaNuevoDTO citaDTO = new CitaNuevoDTO (cita.getFolioEmergencia(), cita.getFecha(), cita.getHora(), cita.getMotivo(),
        cita.getPaciente(), cita.getDoctor());
        return citaDTO;
    }
    
    public Cita toEntity(AgendarCitaDTO agendarCitaDTO) {
        Cita cita = new Cita();
        cita.setFolioEmergencia(agendarCitaDTO.getFolioEmergencia());
        cita.setFecha(agendarCitaDTO.getFecha());
        cita.setHora(agendarCitaDTO.getHora());
        cita.setMotivo(agendarCitaDTO.getNotasParaDoctor());

        Doctor doctor = new Doctor();
        doctor.setIdDoctor(agendarCitaDTO.getIdDoctor());
        cita.setDoctor(doctor);

        Paciente paciente = new Paciente();
        paciente.setIdPaciente(agendarCitaDTO.getIdPaciente());
        cita.setPaciente(paciente);

        return cita;
}


}
