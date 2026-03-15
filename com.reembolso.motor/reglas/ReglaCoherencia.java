public class ReglaCoherencia implements Regla {

    @Override
    public boolean evaluar(SolicitudReembolso solicitud) {

        if (solicitud.getValorSolicitado() <= 0)
            return false;

        if (solicitud.getPaciente() == null)
            return false;

        if (solicitud.getPrestador() == null)
            return false;

        if (solicitud.getTipo() == null)
            return false;

        return true;
    }

    @Override
    public String motivo() {
        return "Datos inconsistentes en la solicitud";
    }
}