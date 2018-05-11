package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.OneToMany;

/**
 * The persistent class for the informedico database table.
 *
 */
@Entity
@Table(name = "informedicoexamenes")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class InforMedicoExamen extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idinformedico", nullable = false)
    private InforMedico informedico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idsegus", nullable = false)
    private Tarifario examenSeguro;

    @Column(name = "atendido")
    private Boolean atendido;

    @Column(name = "detalle")
    private String detalle;

    @Column(name = "fechareceta")
    private Timestamp fechaReceta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtarifaparticular", nullable = false)
    private TarifaParticular examenParticular;

    @JsonIgnoreProperties("inforMedicoExamen")
    @OneToMany(mappedBy = "inforMedicoExamen", fetch = FetchType.LAZY)
    private List<InformedicoProcedimientoPorPieza> procedimientosPorPieza;

    public InforMedico getInformedico() {
        return informedico;
    }

    public void setInformedico(InforMedico informedico) {
        this.informedico = informedico;
    }

    public Tarifario getExamenSeguro() {
        return examenSeguro;
    }

    public void setExamenSeguro(Tarifario examenSeguro) {
        this.examenSeguro = examenSeguro;
    }

    public TarifaParticular getExamenParticular() {
        return examenParticular;
    }

    public void setExamenParticular(TarifaParticular examenParticular) {
        this.examenParticular = examenParticular;
    }

    public Boolean getAtendido() {
        return atendido;
    }

    public void setAtendido(Boolean atendido) {
        this.atendido = atendido;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Timestamp getFechaReceta() {
        return fechaReceta;
    }

    public void setFechaReceta(Timestamp fechaReceta) {
        this.fechaReceta = fechaReceta;
    }

    public List<InformedicoProcedimientoPorPieza> getProcedimientosPorPieza() {
        return procedimientosPorPieza;
    }

    public void setProcedimientosPorPieza(List<InformedicoProcedimientoPorPieza> procedimientosPorPieza) {
        this.procedimientosPorPieza = procedimientosPorPieza;
    }

}
