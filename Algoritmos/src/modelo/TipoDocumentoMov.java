package modelo;

import java.util.List;
import util.AuditoriaBean;

public class TipoDocumentoMov extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String abreviatura;

    private String codigoSunat;

    private String nombre;

    private String impresora;

    private Boolean esComprobante;

    private List<DocumentoCabecera> documentosCabecera;

    private List<CorrelativoDocum> correlativos;

    public TipoDocumentoMov() {
    }

    public String getAbreviatura() {
        return this.abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoSunat() {
        return codigoSunat;
    }

    public void setCodigoSunat(String codigoSunat) {
        this.codigoSunat = codigoSunat;
    }

    public String getImpresora() {
        return impresora;
    }

    public void setImpresora(String impresora) {
        this.impresora = impresora;
    }

    public Boolean getEsComprobante() {
        return esComprobante;
    }

    public void setEsComprobante(Boolean esComprobante) {
        this.esComprobante = esComprobante;
    }

    public List<DocumentoCabecera> getDocumentosCabecera() {
        return documentosCabecera;
    }

    public void setDocumentosCabecera(List<DocumentoCabecera> documentosCabecera) {
        this.documentosCabecera = documentosCabecera;
    }

}
