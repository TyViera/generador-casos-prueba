package modelo;

import java.sql.Timestamp;
import util.AuditoriaBean;

public class DocumTransferencia extends AuditoriaBean {

    private DocumentoCabecera documentoCabecera;

    private Almacen almacenOrigen;

    private Almacen almacenDestino;

    private Boolean recibido;

    private Timestamp fechaRecibido;

    private Usuario usuarioRecibe;

    public DocumTransferencia() {
    }

    public DocumentoCabecera getDocumentoCabecera() {
        return documentoCabecera;
    }

    public void setDocumentoCabecera(DocumentoCabecera documentoCabecera) {
        this.documentoCabecera = documentoCabecera;
    }

    public Almacen getAlmacenOrigen() {
        return almacenOrigen;
    }

    public void setAlmacenOrigen(Almacen almacenOrigen) {
        this.almacenOrigen = almacenOrigen;
    }

    public Almacen getAlmacenDestino() {
        return almacenDestino;
    }

    public void setAlmacenDestino(Almacen almacenDestino) {
        this.almacenDestino = almacenDestino;
    }

    public Boolean getRecibido() {
        return recibido;
    }

    public void setRecibido(Boolean recibido) {
        this.recibido = recibido;
    }

    public Timestamp getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(Timestamp fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public Usuario getUsuarioRecibe() {
        return usuarioRecibe;
    }

    public void setUsuarioRecibe(Usuario usuarioRecibe) {
        this.usuarioRecibe = usuarioRecibe;
    }

}
