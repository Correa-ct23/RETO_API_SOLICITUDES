import java.util.List;

public class MotorReembolsoImpl implements IMotorReembolso {

    private MotorReglas motorReglas;
    private MaquinaEstados maquinaEstados;

    public MotorReembolsoImpl(MotorReglas motorReglas, MaquinaEstados maquinaEstados) {
        this.motorReglas = motorReglas;
        this.maquinaEstados = maquinaEstados;
    }

    @Override
    public ResultadoEvaluacion evaluar(SolicitudReembolso solicitud) {

        if (solicitud.getEstado() != EstadoSolicitud.UNDER_REVIEW) {
            throw new RuntimeException("La solicitud no está en estado UnderReview");
        }

        ResultadoEvaluacion resultado = motorReglas.evaluarSolicitud(solicitud);

        solicitud.setResultadoEvaluacion(resultado);

        return resultado;
    }

    @Override
    public void ejecutarAccion(SolicitudReembolso solicitud, Accion accion) {

        if (!maquinaEstados.esAccionValida(solicitud.getEstado(), accion)) {
            throw new RuntimeException("Acción no permitida en este estado");
        }

        EstadoSolicitud siguiente =
                maquinaEstados.siguienteEstado(solicitud.getEstado(), accion);

        solicitud.setEstado(siguiente);
    }

    @Override
    public List<Accion> accionesPermitidas(SolicitudReembolso solicitud) {

        return maquinaEstados.accionesPermitidas(solicitud.getEstado());
    }
}