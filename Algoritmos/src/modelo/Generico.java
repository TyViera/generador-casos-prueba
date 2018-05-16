package modelo;

import java.util.List;
import util.AuditoriaBean;

public class Generico extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private List<ProductoContGenerico> productoContGenericos;

    public Generico() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ProductoContGenerico> getProductoContGenericos() {
        return this.productoContGenericos;
    }

    public void setProductoContGenericos(List<ProductoContGenerico> productoContGenericos) {
        this.productoContGenericos = productoContGenericos;
    }

    public ProductoContGenerico addProductocontgenerico(ProductoContGenerico productoContGenerico) {
        getProductoContGenericos().add(productoContGenerico);
        productoContGenerico.setGenerico(this);
        return productoContGenerico;
    }

    public ProductoContGenerico removeProductocontgenerico(ProductoContGenerico productoContGenerico) {
        getProductoContGenericos().remove(productoContGenerico);
        productoContGenerico.setGenerico(null);
        return productoContGenerico;
    }

}
