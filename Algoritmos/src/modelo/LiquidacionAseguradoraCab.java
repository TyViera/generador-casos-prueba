package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "liquidaaseguradoracab")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class LiquidacionAseguradoraCab extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "fechacobro")
    private Timestamp fechaCobro;

    @Column(name = "fechadeposito")
    private Timestamp fechaDeposito;

    @Column(name = "fechapago")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaPago;

    @Column(name = "importedeposito")
    private BigDecimal importeDeposito;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idaseguradora")
    private Aseguradora aseguradora;

    @JsonIgnoreProperties("liquidacionAseguradoraCab")
    @OneToMany(mappedBy = "liquidacionAseguradoraCab", fetch = FetchType.LAZY)
    private List<LiquidacionAseguradoraDet> liquidacionAseguradoraDetalle;

    public LiquidacionAseguradoraCab() {
    }

    public Timestamp getFechaCobro() {
        return fechaCobro;
    }

    public void setFechaCobro(Timestamp fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    public Timestamp getFechaDeposito() {
        return fechaDeposito;
    }

    public void setFechaDeposito(Timestamp fechaDeposito) {
        this.fechaDeposito = fechaDeposito;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public BigDecimal getImporteDeposito() {
        return importeDeposito;
    }

    public void setImporteDeposito(BigDecimal importeDeposito) {
        this.importeDeposito = importeDeposito;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }

    public List<LiquidacionAseguradoraDet> getLiquidacionAseguradoraDetalle() {
        return liquidacionAseguradoraDetalle;
    }

    public void setLiquidacionAseguradoraDetalle(List<LiquidacionAseguradoraDet> liquidacionAseguradoraDetalle) {
        this.liquidacionAseguradoraDetalle = liquidacionAseguradoraDetalle;
    }

}
