package modelo;

import util.AuditoriaBean;

public class CorrelativoDocum extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String serie;

    private TipoDocumentoMov tipoDocumentoMov;

    private Long numero;

    public CorrelativoDocum() {
    }

    public Long getNumero() {
        return this.numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Long siguienteNumero() {
        this.numero = this.numero + 1;
        return this.numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public TipoDocumentoMov getTipoDocumentoMov() {
        return tipoDocumentoMov;
    }

    public void setTipoDocumentoMov(TipoDocumentoMov tipoDocumentoMov) {
        this.tipoDocumentoMov = tipoDocumentoMov;
    }

}
