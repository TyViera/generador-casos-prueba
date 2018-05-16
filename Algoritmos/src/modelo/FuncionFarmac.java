package modelo;

import java.util.List;
import util.AuditoriaBean;

public class FuncionFarmac extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private String cuentaContable;

    private List<Producto> productos;

    public FuncionFarmac() {
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
        producto.setFuncionFarmac(this);
        return producto;
    }

    public Producto removeProducto(Producto producto) {
        getProductos().remove(producto);
        producto.setFuncionFarmac(null);
        return producto;
    }

    public String getCuentaContable() {
        return cuentaContable;
    }

    public void setCuentaContable(String cuentaContable) {
        this.cuentaContable = cuentaContable;
    }

}
