package Mapper;

import DTO.CitaDTO;
import DTO.CitaNuevoDTO;
import DTO.ConsultaDTO;
import DTO.ConsultaNuevoDTO;
import Entidades.Cita;
import Entidades.Consulta;

public class ConsultaMapper {

    /**
     * Es necesario agregar la dependencia de Persistencia. Realizar Clean and
     * Build de HealthCloudPersistencia y agregar en Dependencia de
     * HealthCloudNegocio. Por ultimo realizar import necesario.
     */
    public Consulta toEntity(ConsultaNuevoDTO consultaNuevo) {
        Consulta consulta = new Consulta();
        consulta.setNotasMedicas(consultaNuevo.getNotasMedicas());
        consulta.setReceta(consultaNuevo.getReceta());
        consulta.setDiagnostico(consultaNuevo.getDiagnostico());
        consulta.setCita(consultaNuevo.getCita());
        return consulta;
    }

    public ConsultaDTO toDTO(Consulta consulta) {
        CitaDTO citaDTO = new CitaDTO();
        citaDTO.setId(consulta.getCita().getId());
        ConsultaDTO consultaDTO = new ConsultaDTO(
                consulta.getId(),
                consulta.getNotasMedicas(),
                consulta.getReceta(),
                consulta.getDiagnostico(),
                citaDTO
        );
        return consultaDTO;
    }
}