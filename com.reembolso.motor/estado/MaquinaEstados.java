import java.util.List;

public class MaquinaEstados {

    public boolean esAccionValida(EstadoSolicitud estado, Accion accion) {

        switch (estado) {

            case DRAFT:
                return accion == Accion.SUBMIT;

            case SUBMITTED:
                return accion == Accion.START_REVIEW;

            case UNDER_REVIEW:
                return accion == Accion.EVALUATE
                        || accion == Accion.APPROVE
                        || accion == Accion.REJECT;

            default:
                return false;
        }
    }

    public EstadoSolicitud siguienteEstado(EstadoSolicitud estado, Accion accion) {

        switch (estado) {

            case DRAFT:
                if (accion == Accion.SUBMIT)
                    return EstadoSolicitud.SUBMITTED;

            case SUBMITTED:
                if (accion == Accion.START_REVIEW)
                    return EstadoSolicitud.UNDER_REVIEW;

            case UNDER_REVIEW:
                if (accion == Accion.APPROVE)
                    return EstadoSolicitud.APPROVED;

                if (accion == Accion.REJECT)
                    return EstadoSolicitud.REJECTED;

            default:
                return estado;
        }
    }

    public List<Accion> accionesPermitidas(EstadoSolicitud estado) {

        switch (estado) {

            case DRAFT:
                return List.of(Accion.SUBMIT);

            case SUBMITTED:
                return List.of(Accion.START_REVIEW);

            case UNDER_REVIEW:
                return List.of(
                        Accion.EVALUATE,
                        Accion.APPROVE,
                        Accion.REJECT
                );

            default:
                return List.of();
        }
    }
}