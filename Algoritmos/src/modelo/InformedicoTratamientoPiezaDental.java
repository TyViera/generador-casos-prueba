package modelo;

import util.AuditoriaBean;

public class InformedicoTratamientoPiezaDental extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private InforMedico informedico;

    private PiezaDental piezaDental;

    private Boolean mesial;

    private Boolean lingual;

    private Boolean distal;

    private Boolean vestibular;

    private Boolean oclusal;

    private Boolean todaPieza;

    private Boolean palantina;

    private Boolean cervical;

    private Boolean incisal;

    public InformedicoTratamientoPiezaDental() {
    }

    public InforMedico getInformedico() {
        return informedico;
    }

    public void setInformedico(InforMedico informedico) {
        this.informedico = informedico;
    }

    public PiezaDental getPiezaDental() {
        return piezaDental;
    }

    public void setPiezaDental(PiezaDental piezaDental) {
        this.piezaDental = piezaDental;
    }

    public Boolean getMesial() {
        return mesial;
    }

    public void setMesial(Boolean mesial) {
        this.mesial = mesial;
    }

    public Boolean getLingual() {
        return lingual;
    }

    public void setLingual(Boolean lingual) {
        this.lingual = lingual;
    }

    public Boolean getDistal() {
        return distal;
    }

    public void setDistal(Boolean distal) {
        this.distal = distal;
    }

    public Boolean getVestibular() {
        return vestibular;
    }

    public void setVestibular(Boolean vestibular) {
        this.vestibular = vestibular;
    }

    public Boolean getOclusal() {
        return oclusal;
    }

    public void setOclusal(Boolean oclusal) {
        this.oclusal = oclusal;
    }

    public Boolean getTodaPieza() {
        return todaPieza;
    }

    public void setTodaPieza(Boolean todaPieza) {
        this.todaPieza = todaPieza;
    }

    public Boolean getPalantina() {
        return palantina;
    }

    public void setPalantina(Boolean palantina) {
        this.palantina = palantina;
    }

    public Boolean getCervical() {
        return cervical;
    }

    public void setCervical(Boolean cervical) {
        this.cervical = cervical;
    }

    public Boolean getIncisal() {
        return incisal;
    }

    public void setIncisal(Boolean incisal) {
        this.incisal = incisal;
    }

}
