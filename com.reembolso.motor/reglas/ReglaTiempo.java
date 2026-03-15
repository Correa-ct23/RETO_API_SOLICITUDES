import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ReglaTiempo implements Regla {

    @Override
    public boolean evaluar(SolicitudReembolso solicitud) {

        long dias = ChronoUnit.DAYS.between(
                solicitud.getFechaEvento(),
                LocalDate.now()
        );

        return dias <= 60;
    }

    @Override
    public String motivo() {
        return "La solicitud supera la ventana de 60 días";
    }
}