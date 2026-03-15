import java.util.ArrayList;
import java.util.List;

public class ResultadoEvaluacion {

    private boolean aprobable;
    private List<String> motivos = new ArrayList<>();

    public void agregarMotivo(String motivo) {
        motivos.add(motivo);
        aprobable = false;
    }

    public boolean isAprobable() {
        return aprobable && motivos.isEmpty();
    }

    public List<String> getMotivos() {
        return motivos;
    }
}