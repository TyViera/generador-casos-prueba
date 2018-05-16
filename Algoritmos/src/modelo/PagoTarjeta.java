package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class PagoTarjeta extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private DocumentoCabecera documentoCabecera;

    private Banco banco;

    private TipoTarjetaCredito tipoTarjetaCredito;

    private String numeroDeOperacion;

    private BigDecimal importe;

    public PagoTarjeta() {
    }

    public DocumentoCabecera getDocumentoCabecera() {
        return documentoCabecera;
    }

    public void setDocumentoCabecera(DocumentoCabecera documentoCabecera) {
        this.documentoCabecera = documentoCabecera;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public TipoTarjetaCredito getTipoTarjetaCredito() {
        return tipoTarjetaCredito;
    }

    public void setTipoTarjetaCredito(TipoTarjetaCredito tipoTarjetaCredito) {
        this.tipoTarjetaCredito = tipoTarjetaCredito;
    }

    public String getNumeroDeOperacion() {
        return numeroDeOperacion;
    }

    public void setNumeroDeOperacion(String numeroDeOperacion) {
        this.numeroDeOperacion = numeroDeOperacion;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

}
