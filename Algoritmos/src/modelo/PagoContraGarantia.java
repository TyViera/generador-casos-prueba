package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class PagoContraGarantia extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private DocumentoCabecera documentoCabecera;

    private BigDecimal importe;

    public PagoContraGarantia() {
    }

    public DocumentoCabecera getDocumentoCabecera() {
        return documentoCabecera;
    }

    public void setDocumentoCabecera(DocumentoCabecera documentoCabecera) {
        this.documentoCabecera = documentoCabecera;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

}
