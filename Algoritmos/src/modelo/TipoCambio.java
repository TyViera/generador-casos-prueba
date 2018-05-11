package modelo;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;

/**
 * The persistent class for the tipocambio database table.
 *
 */
@Entity
@Table(name = "tipocambio")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class TipoCambio extends AuditoriaBean {
    private static final long serialVersionUID = 1L;

    @Column(name = "moneda", nullable = false)
    private String moneda;


    @Column(nullable = false, precision = 6, scale = 2)
    private BigDecimal importe;

    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @Temporal(TemporalType.DATE)
    @Column(name = "fechacambio")
    private Date fechaCambio;

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public Date getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(Date fechaCambio) {
        this.fechaCambio = fechaCambio;
    }
}
