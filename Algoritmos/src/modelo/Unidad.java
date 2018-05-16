package modelo;

import java.util.List;
import util.AuditoriaBean;

public class Unidad extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String abreviatura;

    private String codSunat;

    private String nombre;

    private List<Producto> productos;

    public Unidad() {
    }

    public String getAbreviatura() {
        return this.abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getCodSunat() {
        return this.codSunat;
    }

    public void setCodSunat(String codSunat) {
        this.codSunat = codSunat;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductos() {
        return this.productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Producto addProducto(Producto producto) {
        getProductos().add(producto);
        producto.setUnidad(this);

        return producto;
    }

    public Producto removeProducto(Producto producto) {
        getProductos().remove(producto);
        producto.setUnidad(null);

        return producto;
    }

}
