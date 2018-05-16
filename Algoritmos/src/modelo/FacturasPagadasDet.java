package modelo;

import util.AuditoriaBean;

public class FacturasPagadasDet extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String numeroCompleto;

    private String serie;

    private Long numero;

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
