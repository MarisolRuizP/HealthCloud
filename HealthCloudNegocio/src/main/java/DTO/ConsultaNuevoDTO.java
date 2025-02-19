package DTO;

import Entidades.Cita;

public class ConsultaNuevoDTO {

    private String notasMedicas;
    private String receta;
    private String diagnostico; 
    private Cita cita;

    public ConsultaNuevoDTO() {
    }

    public ConsultaNuevoDTO(String notasMedicas, String receta, String diagnostico, Cita cita) {
        this.notasMedicas = notasMedicas;
        this.receta = receta;
        this.diagnostico = diagnostico;
        this.cita = cita;
    }

    public String getNotasMedicas() {
        return notasMedicas;
    }

    public void setNotasMedicas(String notasMedicas) {
        this.notasMedicas = notasMedicas;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    @Override
    public String toString() {
        return "ConsultaNuevoDTO{" + "notasMedicas=" + notasMedicas + ", receta=" + receta + ", diagnostico=" + diagnostico + ", cita=" + cita + '}';
    }

}
