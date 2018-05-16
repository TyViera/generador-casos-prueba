package modelo;

import util.AuditoriaBean;

public class ProductoNoCubierto extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String tipo;

    private Aseguradora aseguradora;

    private Producto producto;

    public ProductoNoCubierto() {
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Aseguradora getAseguradora() {
        return this.aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
