package modelo;

import util.AuditoriaBean;

public class LabResultadoTipoImpresion extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Integer numeroImpresiones;

    private AnalisisTipo analisisTipo;

    private LabResultadoCab labResultadocab;

    public LabResultadoTipoImpresion() {
    }

    public Integer getNumeroImpresiones() {
        return numeroImpresiones;
    }

    public void setNumeroImpresiones(Integer numeroImpresiones) {
        this.numeroImpresiones = numeroImpresiones;
    }

    public AnalisisTipo getAnalisisTipo() {
        return analisisTipo;
    }

    public void setAnalisisTipo(AnalisisTipo analisisTipo) {
        this.analisisTipo = analisisTipo;
    }

    public LabResultadoCab getLabResultadocab() {
        return labResultadocab;
    }

    public void setLabResultadocab(LabResultadoCab labResultadocab) {
        this.labResultadocab = labResultadocab;
    }

}
