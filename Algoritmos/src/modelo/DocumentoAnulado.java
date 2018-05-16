package modelo;

import java.sql.Timestamp;
import util.AuditoriaBean;

public class DocumentoAnulado extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private DocumentoCabecera documentoCabecera;

    private Usuario usuario;

    private Timestamp fechaAnulacion;

    private String motivoAnulacion;

    public DocumentoAnulado() {

    }

    public DocumentoCabecera getDocumentoCabecera() {
        return documentoCabecera;
    }

    public void setDocumentoCabecera(DocumentoCabecera documentoCabecera) {
        this.documentoCabecera = documentoCabecera;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Timestamp getFechaAnulacion() {
        return fechaAnulacion;
    }

    public void setFechaAnulacion(Timestamp fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }

    public String getMotivoAnulacion() {
        return motivoAnulacion;
    }

    public void setMotivoAnulacion(String motivoAnulacion) {
        this.motivoAnulacion = motivoAnulacion;
    }
}
