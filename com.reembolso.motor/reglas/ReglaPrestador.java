public class ReglaPrestador implements Regla {

    @Override
    public boolean evaluar(SolicitudReembolso solicitud) {

        return solicitud.getPrestador() != null
                && solicitud.getPrestador().isHabilitado();
    }

    @Override
    public String motivo() {
        return "El prestador no está habilitado";
    }
}