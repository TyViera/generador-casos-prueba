package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "liquidaciondiariacab")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class LiquidacionDiariaCab extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "fechaliquidacion")
    private Timestamp fechaLiquidacion;

    @Column(name = "totaldscto")
    private BigDecimal totalDescuento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idmedico")
    private Medico medico;

    @JsonIgnoreProperties("liquidacionDiariaCab")
    @OneToMany(mappedBy = "liquidacionDiariaCab", fetch = FetchType.LAZY)
    private List<LiquidacionDiariaDet> liquidacionDiariaDets;

    public LiquidacionDiariaCab() {
    }

    public Timestamp getFechaLiquidacion() {
        return fechaLiquidacion;
    }

    public void setFechaLiquidacion(Timestamp fechaLiquidacion) {
        this.fechaLiquidacion = fechaLiquidacion;
    }

    public BigDecimal getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(BigDecimal totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public List<LiquidacionDiariaDet> getLiquidacionDiariaDets() {
        return liquidacionDiariaDets;
    }

    public void setLiquidacionDiariaDets(List<LiquidacionDiariaDet> liquidacionDiariaDets) {
        this.liquidacionDiariaDets = liquidacionDiariaDets;
    }

}
