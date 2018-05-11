package modelo;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
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
@Table(name = "facturaspagadasdet")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class FacturasPagadasDet extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "numerocompleto")
    private String numeroCompleto;

    @Column(name = "serie")
    private String serie;

    @Column(name = "numero")
    private Long numero;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idfacturaspagadascab")
    private FacturasPagadasCab facturasPagadasCab;

    public FacturasPagadasDet() {
    }

    public String getNumeroCompleto() {
        return numeroCompleto;
    }

    public void setNumeroCompleto(String numeroCompleto) {
        this.numeroCompleto = numeroCompleto;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public FacturasPagadasCab getFacturasPagadasCab() {
        return facturasPagadasCab;
    }

    public void setFacturasPagadasCab(FacturasPagadasCab facturasPagadasCab) {
        this.facturasPagadasCab = facturasPagadasCab;
    }

}
