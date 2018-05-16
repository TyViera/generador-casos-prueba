package modelo;

import java.sql.Timestamp;
import util.AuditoriaBean;

public class DocumentoSunat extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private DocumentoCabecera documentoCabecera;

    private Timestamp fechaEmision;

    private Timestamp fechaValidacion;

    private Character estadoDoc;

    public DocumentoCabecera getDocumentoCabecera() {
        return documentoCabecera;
    }

    public void setDocumentoCabecera(DocumentoCabecera documentoCabecera) {
        this.documentoCabecera = documentoCabecera;
    }

    public Timestamp getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Timestamp fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Timestamp getFechaValidacion() {
        return fechaValidacion;
    }

    public void setFechaValidacion(Timestamp fechaValidacion) {
        this.fechaValidacion = fechaValidacion;
    }

    public Character getEstadoDoc() {
        return estadoDoc;
    }

    public void setEstadoDoc(Character estadoDoc) {
        this.estadoDoc = estadoDoc;
    }
}
