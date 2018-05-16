package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class HospitalizacionPagoCuenta extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String tipoPaciente;

    private BigDecimal importePagadoParticular;

    private BigDecimal importePagadoSeguros;

    private String numeroCartaGarantia;

    private DocumentoCabecera documentoCabecera;

    public HospitalizacionPagoCuenta() {
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(String tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }

    public BigDecimal getImportePagadoParticular() {
        return importePagadoParticular;
    }

    public void setImportePagadoParticular(BigDecimal importePagadoParticular) {
        this.importePagadoParticular = importePagadoParticular;
    }

    public BigDecimal getImportePagadoSeguros() {
        return importePagadoSeguros;
    }

    public void setImportePagadoSeguros(BigDecimal importePagadoSeguros) {
        this.importePagadoSeguros = importePagadoSeguros;
    }

    public String getNumeroCartaGarantia() {
        return numeroCartaGarantia;
    }

    public void setNumeroCartaGarantia(String numeroCartaGarantia) {
        this.numeroCartaGarantia = numeroCartaGarantia;
    }

    public DocumentoCabecera getDocumentoCabecera() {
        return documentoCabecera;
    }

    public void setDocumentoCabecera(DocumentoCabecera documentoCabecera) {
        this.documentoCabecera = documentoCabecera;
    }

}
