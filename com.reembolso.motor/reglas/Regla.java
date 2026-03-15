public interface Regla {

    boolean evaluar(SolicitudReembolso solicitud);

    String motivo();
}