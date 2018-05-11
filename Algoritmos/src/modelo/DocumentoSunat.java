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

/**
 *
 * 
 */
@Entity
@Table(name = "documentosunat")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class DocumentoSunat extends AuditoriaBean{
    private static final long serialVersionUID = 1L;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iddocumentocab")
    private DocumentoCabecera documentoCabecera;
    
    @Column(name = "fechaemision")
    private Timestamp fechaEmision;

    @Column(name = "fechavalidacion")
    private Timestamp fechaValidacion;
    
    @Column(name = "estadodoc", nullable=false)
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
