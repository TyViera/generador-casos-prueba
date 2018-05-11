package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import java.util.List;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * The persistent class for the laboratorio database table.
 *
 */
@Entity
@Table(name = "labadmisiondet")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class LabAdmisionDet extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idlabadmisioncab")
    private LabAdmisionCab labAdmisionCab;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idanalisistipo")
    private AnalisisTipo analisisTipo;

    @Column(name = "muestraentregada")
    private Boolean muestraEntregada;

    @Column(name = "numeromuestras")
    private Integer numeroMuestras;

    @Column(name = "tipo")
    private String tipo;

    @JsonIgnoreProperties("labAdmisionDet")
    @OneToMany(mappedBy = "labAdmisionDet")
    private List<LabAdmisionEntregaMuestra> labAdmisionEntregaMuestras;

    public LabAdmisionDet() {
    }

    public LabAdmisionCab getLabAdmisionCab() {
        return labAdmisionCab;
    }

    public void setLabAdmisionCab(LabAdmisionCab labAdmisionCab) {
        this.labAdmisionCab = labAdmisionCab;
    }

    public AnalisisTipo getAnalisisTipo() {
        return analisisTipo;
    }

    public void setAnalisisTipo(AnalisisTipo analisisTipo) {
        this.analisisTipo = analisisTipo;
    }

    public Boolean getMuestraEntregada() {
        return muestraEntregada;
    }

    public void setMuestraEntregada(Boolean muestraEntregada) {
        this.muestraEntregada = muestraEntregada;
    }

    public Integer getNumeroMuestras() {
        return numeroMuestras;
    }

    public void setNumeroMuestras(Integer numeroMuestras) {
        this.numeroMuestras = numeroMuestras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<LabAdmisionEntregaMuestra> getLabAdmisionEntregaMuestras() {
        return labAdmisionEntregaMuestras;
    }

    public void setLabAdmisionEntregaMuestras(List<LabAdmisionEntregaMuestra> labAdmisionEntregaMuestras) {
        this.labAdmisionEntregaMuestras = labAdmisionEntregaMuestras;
    }

}
