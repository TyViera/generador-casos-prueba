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
@Table(name = "informedicoprocedimientoporpieza")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class InformedicoProcedimientoPorPieza extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idinformedicoexamen", nullable = false)
    private InforMedicoExamen inforMedicoExamen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpieza", nullable = false)
    private PiezaDental piezaDental;

    public InformedicoProcedimientoPorPieza() {
    }

    public InforMedicoExamen getInforMedicoExamen() {
        return inforMedicoExamen;
    }

    public void setInforMedicoExamen(InforMedicoExamen inforMedicoExamen) {
        this.inforMedicoExamen = inforMedicoExamen;
    }

    public PiezaDental getPiezaDental() {
        return piezaDental;
    }

    public void setPiezaDental(PiezaDental piezaDental) {
        this.piezaDental = piezaDental;
    }

}
