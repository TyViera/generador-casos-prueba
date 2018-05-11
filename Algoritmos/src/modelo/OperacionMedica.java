package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "operacionmedica")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class OperacionMedica extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "fechaoperacion")
    private Timestamp fechaOperacion;

    @Column(name = "laparoscopica")
    private Boolean laparoscopica;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idadmision")
    private Admision admision;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iddocumentomedico")
    private DocumentoMedico documentoMedico;

    @Transient
    private Long idAdmisionMedicoPrincipal;

    @JsonIgnoreProperties("operacionMedica")
    @OneToMany(mappedBy = "operacionMedica", fetch = FetchType.LAZY)
    private List<OperacionMedicaDetalle> operacionesMedicasDetalle;

    public OperacionMedica() {
    }

    public Timestamp getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(Timestamp fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public Boolean getLaparoscopica() {
        return laparoscopica;
    }

    public void setLaparoscopica(Boolean laparoscopica) {
        this.laparoscopica = laparoscopica;
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }

    public DocumentoMedico getDocumentoMedico() {
        return documentoMedico;
    }

    public void setDocumentoMedico(DocumentoMedico documentoMedico) {
        this.documentoMedico = documentoMedico;
    }

    public List<OperacionMedicaDetalle> getOperacionesMedicasDetalle() {
        return operacionesMedicasDetalle;
    }

    public void setOperacionesMedicasDetalle(List<OperacionMedicaDetalle> operacionesMedicasDetalle) {
        this.operacionesMedicasDetalle = operacionesMedicasDetalle;
    }

    public Long getIdAdmisionMedicoPrincipal() {
        return idAdmisionMedicoPrincipal;
    }

    public void setIdAdmisionMedicoPrincipal(Long idAdmisionMedicoPrincipal) {
        this.idAdmisionMedicoPrincipal = idAdmisionMedicoPrincipal;
    }

}
