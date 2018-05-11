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
@Table(name = "pagotarjeta")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class PagoTarjeta extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iddocumentocab")
    private DocumentoCabecera documentoCabecera;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idbanco")
    private Banco banco;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtipotarjcred")
    private TipoTarjetaCredito tipoTarjetaCredito;

    @Column(name = "numoperacion")
    private String numeroDeOperacion;

    @Column(name = "importe", precision = 9, scale = 2)
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
