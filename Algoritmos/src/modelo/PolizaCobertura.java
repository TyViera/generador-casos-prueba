package modelo;

import java.math.BigDecimal;

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

/**
 * The persistent class for the polizacobertura database table.
 *
 */
@Entity
@Table(name = "polizacobertura")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class PolizaCobertura extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "copagofijo", nullable = false, precision = 7, scale = 2)
    private BigDecimal copagoFijo;

    @Column(name = "copagovariable", nullable = false, precision = 7, scale = 2)
    private BigDecimal copagoVariable;

    @Column(name = "copagodental", precision = 7, scale = 2)
    private BigDecimal copagoDental;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcobertura", nullable = false)
    private Cobertura cobertura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpoliza", nullable = false)
    private Poliza poliza;

    public PolizaCobertura() {
    }

    public BigDecimal getCopagoFijo() {
        return this.copagoFijo;
    }

    public void setCopagoFijo(BigDecimal copagoFijo) {
        this.copagoFijo = copagoFijo;
    }

    public BigDecimal getCopagoVariable() {
        return this.copagoVariable;
    }

    public void setCopagoVariable(BigDecimal copagoVariable) {
        this.copagoVariable = copagoVariable;
    }

    public BigDecimal getCopagoDental() {
        return copagoDental;
    }

    public void setCopagoDental(BigDecimal copagoDental) {
        this.copagoDental = copagoDental;
    }

    public Cobertura getCobertura() {
        return this.cobertura;
    }

    public void setCobertura(Cobertura cobertura) {
        this.cobertura = cobertura;
    }

    public Poliza getPoliza() {
        return this.poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

}
