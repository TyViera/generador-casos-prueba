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

@Entity
@Table(name = "tipotarjetadsctoservicio")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class TipoTarjetaDescuentoServicio extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "descuento", precision = 6, scale = 2)
    private BigDecimal descuento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtarifaparticular")
    private TarifaParticular tarifaParticular;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtipotarjetadscto")
    private TipoTarjetaDescuento tipoTarjetaDescuento;

    public TipoTarjetaDescuentoServicio() {

    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public TarifaParticular getTarifaParticular() {
        return tarifaParticular;
    }

    public void setTarifaParticular(TarifaParticular tarifaParticular) {
        this.tarifaParticular = tarifaParticular;
    }

    public TipoTarjetaDescuento getTipoTarjetaDescuento() {
        return tipoTarjetaDescuento;
    }

    public void setTipoTarjetaDescuento(TipoTarjetaDescuento tipoTarjetaDescuento) {
        this.tipoTarjetaDescuento = tipoTarjetaDescuento;
    }
}
