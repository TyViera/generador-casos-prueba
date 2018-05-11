package modelo;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "informedicotratamientopiezadental")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class InformedicoTratamientoPiezaDental extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idinformedico", nullable = false)
    private InforMedico informedico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpieza", nullable = false)
    private PiezaDental piezaDental;

    @Column(name = "mesial", nullable = false)
    private Boolean mesial;

    @Column(name = "lingual", nullable = false)
    private Boolean lingual;

    @Column(name = "distal", nullable = false)
    private Boolean distal;

    @Column(name = "vestibular", nullable = false)
    private Boolean vestibular;

    @Column(name = "oclusal", nullable = false)
    private Boolean oclusal;

    @Column(name = "todapieza", nullable = false)
    private Boolean todaPieza;

    @Column(name = "palantina", nullable = false)
    private Boolean palantina;

    @Column(name = "cervical", nullable = false)
    private Boolean cervical;

    @Column(name = "incisal", nullable = false)
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
