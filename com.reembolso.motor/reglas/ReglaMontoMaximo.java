public class ReglaMontoMaximo implements Regla {

    @Override
    public boolean evaluar(SolicitudReembolso solicitud) {

        double valor = solicitud.getValorSolicitado();

        switch (solicitud.getTipo()) {

            case MEDICAMENTO:
                return valor <= 800000;

            case PROCEDIMIENTO:
                return valor <= 2500000;

            case URGENCIAS:
                return valor <= 3500000;

            case EXAMENES:
                return valor <= 1200000;

            default:
                return false;
        }
    }

    @Override
    public String motivo() {
        return "El monto solicitado supera el máximo permitido";
    }
}