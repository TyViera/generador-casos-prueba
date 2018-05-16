package modelo;

import util.AuditoriaBean;

public class ProductoContGenerico extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Generico generico;

    private Producto producto;

    public ProductoContGenerico() {
    }

    public Generico getGenerico() {
        return this.generico;
    }

    public void setGenerico(Generico generico) {
        this.generico = generico;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
