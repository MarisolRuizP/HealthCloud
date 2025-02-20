package BO;

public class PacienteBO {

    IPacienteDAO pacienteDAO;

    public PacienteBO (IConexionBD conexion) {
        this.pacienteDAO = new PacienteDAO (conexion);
    }

    // Validar que se registren todos los datos del paciente.
    public ValidarPaciente (PacienteNuevoDTO pacienteNuevo) throws NegocioException {

        if (pacienteNuevo == null) {
            throw new NegocioException("Favor de llenar los espacios.");
        }

        if (pacienteNuevo.getNombrePila() == null) {
            throw new NegocioException("Favor de ingresar el nombre del paciente.");
        }

        if (pacienteNuevo.getApellidoPaterno() == null) {
            throw new NegocioException("Favor de ingresar el apellido paterno del paciente.");
        }

        if (pacienteNuevo.getApellidoMaterno() == null) {
            throw new NegocioException("Favor de ingresar el apellido materno del paciente.");
        }

        if (pacienteNuevo.getNumTelefono() == null) {
            throw new NegocioException("Favor de ingresar el numero de telefono del paciente.");
        }

        if (pacienteNuevo.getFechaNacimiento() == null) {
            throw new NegocioException("Favor de introducir la fecha de nacimiento del paciente.");
        }
        // Validar para que no sea posible agregar una fecha de nacimiento posterior a la actual?

        if (pacienteNuevo.getCorreoElectronico() == null) {
            throw new NegocioException("Favor de agregar el correo del paciente.");
        }
        // Validar caracteres especificos?

        if (pacienteNuevo.getDireccion() == null) {
            throw new NegocioException("Favor de agregar la direccion del paciente.");
        }

    }

    public boolean PacienteNuevoDTO registrarPaciente (PacienteNuevoDTO pacienteNuevo) throws NegocioException {
        
        ValidarPaciente(pacienteNuevo);

        Paciente paciente = new Paciente();
        PacienteMapper convertidor = new PacienteMapper();
        paciente = convertidor.toEntity(pacienteNuevo);


        try {
            Paciente pacienteRegistrado = pacienteDAO.registrarPaciente(paciente);
            return true;
        }catch (PersistenciaException ex) {
            Logger.getLogger(PacienteBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new NegocioException ("Ha ocurrido un error al registrar el paciente.", ex);
        }
    }

}
