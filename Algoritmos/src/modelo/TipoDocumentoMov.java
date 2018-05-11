package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;

@Entity
@Table(name = "tipodocumovim")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class TipoDocumentoMov extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "abreviatura")
    private String abreviatura;

    @Column(name = "codsunat")
    private String codigoSunat;

    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "impresora")
    private String impresora;
    
    @Column(name = "escomprobante")
    private Boolean esComprobante;

    @JsonIgnoreProperties("tipoDocumentoMov")
    @OneToMany(mappedBy = "tipoDocumentoMov", fetch = FetchType.LAZY)
    private List<DocumentoCabecera> documentosCabecera;
    
    @JsonIgnoreProperties("tipoDocumentoMov")
    @OneToMany(mappedBy = "tipoDocumentoMov", fetch = FetchType.LAZY)
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
