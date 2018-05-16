package modelo;

import util.AuditoriaBean;

public class LabObservacionResultado extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private LabResultadoCab labResultadocab;

    private AnalisisTipo analisisTipo;

    private String observacion;

    public LabObservacionResultado() {
    }

    public LabResultadoCab getLabResultadocab() {
        return labResultadocab;
    }

    public void setLabResultadocab(LabResultadoCab labResultadocab) {
        this.labResultadocab = labResultadocab;
    }

    public AnalisisTipo getAnalisisTipo() {
        return analisisTipo;
    }

    public void setAnalisisTipo(AnalisisTipo analisisTipo) {
        this.analisisTipo = analisisTipo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

}
