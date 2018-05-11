package modelo;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "labetapametodo")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class LabEtapaMetodo extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String metodo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idlabresultadocab")
    private LabResultadoCab labResultadocab;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idanalisisetapa")
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
