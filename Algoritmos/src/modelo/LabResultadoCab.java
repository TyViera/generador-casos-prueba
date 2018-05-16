package modelo;

import java.sql.Timestamp;
import java.util.List;
import util.AuditoriaBean;

public class LabResultadoCab extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private LabAdmisionCab labAdmisionCab;

    private Timestamp fechaResultado;

    private Boolean entregado;

    private Usuario usuarioResp;

    private Timestamp fechaEntrega;

    private String observacion;

    private List<LabResultadoDet> labResultadosDet;

    private List<LabObservacionResultado> labObservacionesResultadoDet;

    private List<LabEtapaMetodo> labEtapaMetodos;

    public LabResultadoCab() {
    }

    public LabAdmisionCab getLabAdmisionCab() {
        return labAdmisionCab;
    }

    public void setLabAdmisionCab(LabAdmisionCab labAdmisionCab) {
        this.labAdmisionCab = labAdmisionCab;
    }

    public Timestamp getFechaResultado() {
        return fechaResultado;
    }

    public void setFechaResultado(Timestamp fechaResultado) {
        this.fechaResultado = fechaResultado;
    }

    public Boolean getEntregado() {
        return entregado;
    }

    public void setEntregado(Boolean entregado) {
        this.entregado = entregado;
    }

    public Usuario getUsuarioResp() {
        return usuarioResp;
    }

    public void setUsuarioResp(Usuario usuarioResp) {
        this.usuarioResp = usuarioResp;
    }

    public Timestamp getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Timestamp fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public List<LabResultadoDet> getLabResultadosDet() {
        return labResultadosDet;
    }

    public void setLabResultadosDet(List<LabResultadoDet> labResultadosDet) {
        this.labResultadosDet = labResultadosDet;
    }

    public List<LabObservacionResultado> getLabObservacionesResultadoDet() {
        return labObservacionesResultadoDet;
    }

    public void setLabObservacionesResultadoDet(List<LabObservacionResultado> labObservacionesResultadoDet) {
        this.labObservacionesResultadoDet = labObservacionesResultadoDet;
    }

    public List<LabEtapaMetodo> getLabEtapaMetodos() {
        return labEtapaMetodos;
    }

    public void setLabEtapaMetodos(List<LabEtapaMetodo> labEtapaMetodos) {
        this.labEtapaMetodos = labEtapaMetodos;
    }

}
