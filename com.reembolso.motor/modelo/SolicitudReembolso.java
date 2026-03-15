import java.time.LocalDate;
import java.util.List;

public class SolicitudReembolso {

    private String id;
    private TipoSolicitud tipo;
    private double valorSolicitado;
    private LocalDate fechaEvento;
    private EstadoSolicitud estado;

    private List<Documento> documentos;
    private Paciente paciente;
    private Prestador prestador;

    private ResultadoEvaluacion resultadoEvaluacion;

    public SolicitudReembolso(String id, TipoSolicitud tipo, double valorSolicitado, LocalDate fechaEvento,
                               List<Documento> documentos, Paciente paciente, Prestador prestador) {

        this.id = id;
        this.tipo = tipo;
        this.valorSolicitado = valorSolicitado;
        this.fechaEvento = fechaEvento;
        this.documentos = documentos;
        this.paciente = paciente;
        this.prestador = prestador;
        this.estado = EstadoSolicitud.DRAFT;
    }

    public EstadoSolicitud getEstado() {
        return estado;
    }

    public void setEstado(EstadoSolicitud estado) {
        this.estado = estado;
    }

    public TipoSolicitud getTipo() {
        return tipo;
    }

    public double getValorSolicitado() {
        return valorSolicitado;
    }

    public LocalDate getFechaEvento() {
        return fechaEvento;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public ResultadoEvaluacion getResultadoEvaluacion() {
        return resultadoEvaluacion;
    }

    public void setResultadoEvaluacion(ResultadoEvaluacion resultadoEvaluacion) {
        this.resultadoEvaluacion = resultadoEvaluacion;
    }
}