package modelo;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "informedicoindicacionmedico")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class InforMedicoIndicacion extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "fechainicio")
    private Timestamp fechaInicio;

    @Column(name = "indicaciones")
    private String indicaciones;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idinformedico")
    private InforMedico informedico;

    public InforMedicoIndicacion() {
    }

    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public InforMedico getInformedico() {
        return informedico;
    }

    public void setInformedico(InforMedico informedico) {
        this.informedico = informedico;
    }

}
