package modelo;

import java.util.List;
import util.AuditoriaBean;

public class Presentacion extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String abreviatura;

    private String nombre;

    private List<Producto> productos;

    public Presentacion() {
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Producto addProducto(Producto producto) {
        getProductos().add(producto);
        producto.setPresentacion(this);
        return producto;
    }

    public Producto removeProducto(Producto producto) {
        getProductos().remove(producto);
        producto.setPresentacion(null);
        return producto;
    }

}
