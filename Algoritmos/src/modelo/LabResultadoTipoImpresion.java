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
@Table(name = "labresultadotipoimpresion")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class LabResultadoTipoImpresion extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "numeroimpresiones", nullable = false)
    private Integer numeroImpresiones;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idanalisistipo")
    private AnalisisTipo analisisTipo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idlabresultadocab")
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
