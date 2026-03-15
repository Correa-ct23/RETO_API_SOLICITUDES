import java.util.List;

public class MotorReglas {

    private List<Regla> reglas;

    public MotorReglas(List<Regla> reglas) {
        this.reglas = reglas;
    }

    public ResultadoEvaluacion evaluarSolicitud(SolicitudReembolso solicitud) {

        ResultadoEvaluacion resultado = new ResultadoEvaluacion();

        for (Regla regla : reglas) {

            boolean cumple = regla.evaluar(solicitud);

            if (!cumple) {
                resultado.agregarMotivo(regla.motivo());
            }
        }

        return resultado;
    }
}