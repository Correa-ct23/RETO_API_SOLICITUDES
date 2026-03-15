public class Paciente {

    private String pacienteId;
    private int edad;

    public Paciente(String pacienteId, int edad) {
        this.pacienteId = pacienteId;
        this.edad = edad;
    }

    public String getPacienteId() {
        return pacienteId;
    }

    public int getEdad() {
        return edad;
    }
}