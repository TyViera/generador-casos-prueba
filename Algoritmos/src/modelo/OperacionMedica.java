package modelo;

import java.sql.Timestamp;
import java.util.List;
import util.AuditoriaBean;

public class OperacionMedica extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Timestamp fechaOperacion;

    private Boolean laparoscopica;

    private Admision admision;

    private DocumentoMedico documentoMedico;

    private Long idAdmisionMedicoPrincipal;

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
