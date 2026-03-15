import java.util.List;

public interface IMotorReembolso {

    ResultadoEvaluacion evaluar(SolicitudReembolso solicitud);

    void ejecutarAccion(SolicitudReembolso solicitud, Accion accion);

    List<Accion> accionesPermitidas(SolicitudReembolso solicitud);
}