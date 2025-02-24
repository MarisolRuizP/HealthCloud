/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author jrasc
 */
public class ConsultaDTO {

    private int id;
    private String notasMedicas;
    private String receta;
    private String diagnostico;
    private CitaDTO cita;

    public ConsultaDTO() {
    }

    public ConsultaDTO(int id, String notasMedicas, String receta, String diagnostico, CitaDTO cita) {
        this.id = id;
        this.notasMedicas = notasMedicas;
        this.receta = receta;
        this.diagnostico = diagnostico;
        this.cita = cita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public CitaDTO getCita() {
        return cita;
    }

    public void setCita(CitaDTO cita) {
        this.cita = cita;
    }
}


