package modelo;

import util.AuditoriaBean;

public class LabEtapaAnalisisEtiqueta extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Integer orden;

    private AnalisisEtapa analisisEtapa;

    private LabAnalisisEtiqueta analisisEtiqueta;

    public LabEtapaAnalisisEtiqueta() {
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public AnalisisEtapa getAnalisisEtapa() {
        return analisisEtapa;
    }

    public void setAnalisisEtapa(AnalisisEtapa analisisEtapa) {
        this.analisisEtapa = analisisEtapa;
    }

    public LabAnalisisEtiqueta getAnalisisEtiqueta() {
        return analisisEtiqueta;
    }

    public void setAnalisisEtiqueta(LabAnalisisEtiqueta analisisEtiqueta) {
        this.analisisEtiqueta = analisisEtiqueta;
    }

}
