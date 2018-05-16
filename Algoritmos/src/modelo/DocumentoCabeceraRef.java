package modelo;

import util.AuditoriaBean;

public class DocumentoCabeceraRef extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private DocumentoCabecera documentoCabecera;

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
