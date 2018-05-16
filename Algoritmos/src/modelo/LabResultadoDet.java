package modelo;

import util.AuditoriaBean;

public class LabResultadoDet extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private LabResultadoCab labResultadocab;

    private AnalisisParametro analisisParametro;

    private AnalisisParametroResultado analisisParametroResultado;

    public LabResultadoDet() {
    }

    public LabResultadoCab getLabResultadocab() {
        return labResultadocab;
    }

    public void setLabResultadocab(LabResultadoCab labResultadocab) {
        this.labResultadocab = labResultadocab;
    }

    public AnalisisParametro getAnalisisParametro() {
        return analisisParametro;
    }

    public void setAnalisisParametro(AnalisisParametro analisisParametro) {
        this.analisisParametro = analisisParametro;
    }

    public AnalisisParametroResultado getAnalisisParametroResultado() {
        return analisisParametroResultado;
    }

    public void setAnalisisParametroResultado(AnalisisParametroResultado analisisParametroResultado) {
        this.analisisParametroResultado = analisisParametroResultado;
    }

}
