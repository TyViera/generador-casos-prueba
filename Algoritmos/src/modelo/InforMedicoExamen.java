package modelo;

import java.sql.Timestamp;
import java.util.List;
import util.AuditoriaBean;

public class InforMedicoExamen extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private InforMedico informedico;

    private Tarifario examenSeguro;

    private Boolean atendido;

    private String detalle;

    private Timestamp fechaReceta;

    private TarifaParticular examenParticular;

    private List<InformedicoProcedimientoPorPieza> procedimientosPorPieza;

    public InforMedico getInformedico() {
        return informedico;
    }

    public void setInformedico(InforMedico informedico) {
        this.informedico = informedico;
    }

    public Tarifario getExamenSeguro() {
        return examenSeguro;
    }

    public void setExamenSeguro(Tarifario examenSeguro) {
        this.examenSeguro = examenSeguro;
    }

    public TarifaParticular getExamenParticular() {
        return examenParticular;
    }

    public void setExamenParticular(TarifaParticular examenParticular) {
        this.examenParticular = examenParticular;
    }

    public Boolean getAtendido() {
        return atendido;
    }

    public void setAtendido(Boolean atendido) {
        this.atendido = atendido;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Timestamp getFechaReceta() {
        return fechaReceta;
    }

    public void setFechaReceta(Timestamp fechaReceta) {
        this.fechaReceta = fechaReceta;
    }

    public List<InformedicoProcedimientoPorPieza> getProcedimientosPorPieza() {
        return procedimientosPorPieza;
    }

    public void setProcedimientosPorPieza(List<InformedicoProcedimientoPorPieza> procedimientosPorPieza) {
        this.procedimientosPorPieza = procedimientosPorPieza;
    }

}
