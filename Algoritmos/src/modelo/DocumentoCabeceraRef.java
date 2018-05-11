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
@Table(name = "documentocabref")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class DocumentoCabeceraRef extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iddocumentocab")
    private DocumentoCabecera documentoCabecera;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iddocumentocabref")
    private DocumentoCabecera documentoCabeceraReferencia;

    public DocumentoCabeceraRef() {
    }

    public DocumentoCabecera getDocumentoCabecera() {
        return documentoCabecera;
    }

    public void setDocumentoCabecera(DocumentoCabecera documentoCabecera) {
        this.documentoCabecera = documentoCabecera;
    }

    /**
     * Hojas de consumo/servicio
     * @return 
     */
    public DocumentoCabecera getDocumentoCabeceraReferencia() {
        return documentoCabeceraReferencia;
    }

    public void setDocumentoCabeceraReferencia(DocumentoCabecera documentoCabeceraReferencia) {
        this.documentoCabeceraReferencia = documentoCabeceraReferencia;
    }

}
