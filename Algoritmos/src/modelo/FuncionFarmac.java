package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;

/**
 * The persistent class for the funcionfarmac database table.
 *
 */
@Entity
@Table(name = "funcionfarmac")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class FuncionFarmac extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "ctacontable")
    private String cuentaContable;

    @JsonIgnoreProperties("funcionFarmac")
    @OneToMany(mappedBy = "funcionFarmac")
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
