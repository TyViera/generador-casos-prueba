package modelo;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "dsctomedico")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class DescuentoMedico extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private BigDecimal tope;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idmedico")
    private Medico medico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idporcentdscto")
    private PorcentajeDescuento porcentajeDescuento;

    public DescuentoMedico() {
    }

    public BigDecimal getTope() {
        return tope;
    }

    public void setTope(BigDecimal tope) {
        this.tope = tope;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public PorcentajeDescuento getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(PorcentajeDescuento porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

}
