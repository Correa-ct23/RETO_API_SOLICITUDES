public class ReglaDocumentos implements Regla {

    @Override
    public boolean evaluar(SolicitudReembolso solicitud) {

        if (solicitud.getDocumentos() == null || solicitud.getDocumentos().isEmpty()) {
            return false;
        }

        return true;
    }

    @Override
    public String motivo() {
        return "Faltan documentos obligatorios";
    }
}