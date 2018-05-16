package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class ProductoPrecioEspecial extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private BigDecimal precio;

    private Producto producto;

    private Aseguradora aseguradora;

    public ProductoPrecioEspecial() {

    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }

}
