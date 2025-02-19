package DTO;

public class PacienteNuevoDTO {

    private String nombrePila;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correoElectronico;
    private String numTelefono;
    private String contrasenia;
    private Date fechaNacimiento;  // Realizar Import
    private String direccion;

    // Constructor vacio
    public PacienteNuevoDTO() {
    }

    // Constructor con todo
    public PacienteNuevoDTO(String nombrePila, String apellidoPaterno, String apellidoMaterno, String correoElectronico, String numTelefono, String contrasenia, Date fechaNacimiento, String direccion) {
        this.nombrePila = nombrePila;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correoElectronico = correoElectronico;
        this.numTelefono = numTelefono;
        this.contrasenia = contrasenia;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    // Getters and Setters
    public String getNombrePila() {
        return nombrePila;
    }

    public void setNombrePila(String nombrePila) {
        this.nombrePila = nombrePila;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // ToString
    @Override
    public String toString() {
        return "PacienteNuevoDTO{" + "nombrePila=" + nombrePila + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", correoElectronico=" + correoElectronico + ", numTelefono=" + numTelefono + ", contrasenia=" + contrasenia + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + '}';
    }

}
