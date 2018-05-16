package modelo;

import util.AuditoriaBean;

public class LoteFactura extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private LoteCabecera loteCabecera;

    private DocumentoCabecera documentoCabecera;

    public LoteCabecera getLoteCabecera() {
        return loteCabecera;
    }

    public void setLoteCabecera(LoteCabecera loteCabecera) {
        this.loteCabecera = loteCabecera;
    }

    public DocumentoCabecera getDocumentoCabecera() {
        return documentoCabecera;
    }

    public void setDocumentoCabecera(DocumentoCabecera documentoCabecera) {
        this.documentoCabecera = documentoCabecera;
    }
}
