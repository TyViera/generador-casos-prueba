package modelo;

import util.AuditoriaBean;

public class LabEtapaMetodo extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String metodo;

    private LabResultadoCab labResultadocab;

    private AnalisisEtapa analisisEtapa;

    public LabEtapaMetodo() {
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public LabResultadoCab getLabResultadocab() {
        return labResultadocab;
    }

    public void setLabResultadocab(LabResultadoCab labResultadocab) {
        this.labResultadocab = labResultadocab;
    }

    public AnalisisEtapa getAnalisisEtapa() {
        return analisisEtapa;
    }

    public void setAnalisisEtapa(AnalisisEtapa analisisEtapa) {
        this.analisisEtapa = analisisEtapa;
    }

}
