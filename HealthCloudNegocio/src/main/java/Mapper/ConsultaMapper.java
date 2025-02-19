package Mapper;

import DTO.CitaNuevoDTO;
import DTO.ConsultaNuevoDTO;
import Entidades.Consulta;

public class ConsultaMapper {

    /**
     * Es necesario agregar la dependencia de Persistencia.
     * Realizar Clean and Build de HealthCloudPersistencia y agregar en Dependencia de HealthCloudNegocio.
     * Por ultimo realizar import necesario.
     */

    public Consulta toEntity (ConsultaNuevoDTO consultaNuevo) {
        Consulta consulta = new Consulta (consultaNuevo.getNotasMedicas(), consultaNuevo.getReceta(), 
        consultaNuevo.getDiagnostico(), consultaNuevo.getCita());
        return consulta;
    }

    public ConsultaNuevoDTO toDTO (Consulta consulta) {
        ConsultaNuevoDTO consultaDTO = new ConsultaNuevoDTO (consulta.getNotasMedicas(), consulta.getReceta(), 
        consulta.getDiagnostico(), consulta.getCita());
        return consultaDTO;
    }

}
