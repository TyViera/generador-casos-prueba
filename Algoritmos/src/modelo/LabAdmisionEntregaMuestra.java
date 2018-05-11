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
@Table(name = "labadmisionentregamuestra")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class LabAdmisionEntregaMuestra extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idlabadmisiondet")
    private LabAdmisionDet labAdmisionDet;

    @Column(name = "fechaentrega ")
    private Timestamp fechaEntrega;

    public LabAdmisionEntregaMuestra() {
    }

    public LabAdmisionDet getLabAdmisionDet() {
        return labAdmisionDet;
    }

    public void setLabAdmisionDet(LabAdmisionDet labAdmisionDet) {
        this.labAdmisionDet = labAdmisionDet;
    }

    public Timestamp getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Timestamp fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

}
