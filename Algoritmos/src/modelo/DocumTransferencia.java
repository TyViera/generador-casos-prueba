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
@Table(name = "documtransferencia")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class DocumTransferencia extends AuditoriaBean {
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iddocumentocab")
    private DocumentoCabecera documentoCabecera;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idalmacenorigen")
    private Almacen almacenOrigen;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idalmacendestino")
    private Almacen almacenDestino;

    @Column(name = "recibido", nullable = false)
    private Boolean recibido;
    
    @Column(name = "fecharecibido", nullable = false)
    private Timestamp fechaRecibido;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idusuariorecibe")
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
