public class Prestador {

    private String prestadorId;
    private String nombre;
    private boolean habilitado;

    public Prestador(String prestadorId, String nombre, boolean habilitado) {
        this.prestadorId = prestadorId;
        this.nombre = nombre;
        this.habilitado = habilitado;
    }

    public boolean isHabilitado() {
        return habilitado;
    }
}