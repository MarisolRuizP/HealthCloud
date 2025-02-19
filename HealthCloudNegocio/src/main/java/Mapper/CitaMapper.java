package Mapper;

import DTO.CitaNuevoDTO;
import Entidades.Cita;

public class CitaMapper {

    /**
     * Es necesario agregar la dependencia de Persistencia.
     * Realizar Clean and Build de HealthCloudPersistencia y agregar en Dependencia de HealthCloudNegocio.
     * Por ultimo realizar import necesario.
     */

    public Cita toEntity (CitaNuevoDTO citaNuevo) {
        Cita cita = new Cita(citaNuevo.getFolioEmergencia(), citaNuevo.getFecha(), citaNuevo.getHora(), citaNuevo.getMotivo(),
        citaNuevo.getPaciente(), citaNuevo.getDoctor());
        return cita;
    }

    public CitaNuevoDTO toDTO (Cita cita) {
        CitaNuevoDTO citaDTO = new CitaNuevoDTO (cita.getFolioEmergencia(), cita.getFecha(), cita.getHora(), cita.getMotivo(),
        cita.getPaciente(), cita.getDoctor());
        return citaDTO;
    }

}
