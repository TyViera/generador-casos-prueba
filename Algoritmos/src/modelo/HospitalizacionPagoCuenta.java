package modelo;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "hosppagoacuenta")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class HospitalizacionPagoCuenta extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "tipopac")
    private String tipoPaciente;

    @Column(name = "importepart")
    private BigDecimal importePagadoParticular;

    @Column(name = "importeseguro")
    private BigDecimal importePagadoSeguros;

    @Column(name = "numcartagarantia")
    private String numeroCartaGarantia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iddocumetocab")
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
