/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;
import java.math.BigDecimal;
import modelo.DocumProductoDet;

/**
 *
 * @author nazav
 */
public class ProductoVentaDTO implements Serializable {

    private DocumProductoDet productoDet;
    private Long idDeInformeMedicoTratamiento;
    private BigDecimal stock;
    private String tipoNoCubierto;

    public ProductoVentaDTO() {
    }

    public DocumProductoDet getProductoDet() {
        return productoDet;
    }

    public void setProductoDet(DocumProductoDet productoDet) {
        this.productoDet = productoDet;
    }

    public Long getIdDeInformeMedicoTratamiento() {
        return idDeInformeMedicoTratamiento;
    }

    public void setIdDeInformeMedicoTratamiento(Long idDeInformeMedicoTratamiento) {
        this.idDeInformeMedicoTratamiento = idDeInformeMedicoTratamiento;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public String getTipoNoCubierto() {
        return tipoNoCubierto;
    }

    public void setTipoNoCubierto(String tipoNoCubierto) {
        this.tipoNoCubierto = tipoNoCubierto;
    }

    @Override
    public String toString() {
        return "ProductoVentaDTO{" + "productoDet=" + productoDet + ", idDeInformeMedicoTratamiento=" + idDeInformeMedicoTratamiento + ", stock=" + stock + ", tipoNoCubierto=" + tipoNoCubierto + '}';
    }

}
