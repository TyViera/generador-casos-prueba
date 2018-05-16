package modelo;

import util.AuditoriaBean;

public class DocumentoMedico extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private AdmisionMedico admisionMedico;

    private DocumentoCabecera documentoCabecera;

    public DocumentoMedico() {
    }

    public AdmisionMedico getAdmisionMedico() {
        return admisionMedico;
    }

    public void setAdmisionMedico(AdmisionMedico admisionMedico) {
        this.admisionMedico = admisionMedico;
    }

    public DocumentoCabecera getDocumentoCabecera() {
        return documentoCabecera;
    }

    public void setDocumentoCabecera(DocumentoCabecera documentoCabecera) {
        this.documentoCabecera = documentoCabecera;
    }

}
