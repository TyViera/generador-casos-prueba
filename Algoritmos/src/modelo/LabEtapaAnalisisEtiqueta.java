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
@Table(name = "labetapaetiqueta")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class LabEtapaAnalisisEtiqueta extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Integer orden;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idanalisisetapa")
    private AnalisisEtapa analisisEtapa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idanalisisetiqueta")
    private LabAnalisisEtiqueta analisisEtiqueta;

    public LabEtapaAnalisisEtiqueta() {
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public AnalisisEtapa getAnalisisEtapa() {
        return analisisEtapa;
    }

    public void setAnalisisEtapa(AnalisisEtapa analisisEtapa) {
        this.analisisEtapa = analisisEtapa;
    }

    public LabAnalisisEtiqueta getAnalisisEtiqueta() {
        return analisisEtiqueta;
    }

    public void setAnalisisEtiqueta(LabAnalisisEtiqueta analisisEtiqueta) {
        this.analisisEtiqueta = analisisEtiqueta;
    }

}
