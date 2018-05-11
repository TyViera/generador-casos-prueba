package modelo;

import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * The persistent class for the laboratorio database table.
 *
 */
@Entity
@Table(name = "labresultadodet")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class LabResultadoDet extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idlabresultadocab")
    private LabResultadoCab labResultadocab;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idanalisisparametro")
    private AnalisisParametro analisisParametro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idanalisisparametroresultado")
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
