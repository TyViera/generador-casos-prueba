package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;

import java.util.List;

/**
 * The persistent class for the operacion database table.
 *
 */
@Entity
@Table(name = "operacion")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Operacion extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "abreviatura")
    private String abreviatura;

    @Column(name = "inventario")
    private Boolean inventario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "regcompra")
    private String regCompra;

    @Column(name = "regventa")
    private String regVenta;

    @Column(name = "tipo")
    private String tipo;
    
    @Column(name = "tipotransaccion")
    private String tipoTransaccion;

    @JsonIgnoreProperties("documentoCabecera")
    @OneToMany(mappedBy = "documentoCabecera", fetch = FetchType.LAZY)
    private List<DocumProductoDet> documentosProductoDet;

    public Operacion() {
    }

    public String getAbreviatura() {
        return this.abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public Boolean getInventario() {
        return this.inventario;
    }

    public void setInventario(Boolean inventario) {
        this.inventario = inventario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegCompra() {
        return this.regCompra;
    }

    public void setRegCompra(String regCompra) {
        this.regCompra = regCompra;
    }

    public String getRegVenta() {
        return this.regVenta;
    }

    public void setRegVenta(String regVenta) {
        this.regVenta = regVenta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public List<DocumProductoDet> getDocumentosProductoDet() {
        return documentosProductoDet;
    }

    public void setDocumentosProductoDet(List<DocumProductoDet> documentosProductoDet) {
        this.documentosProductoDet = documentosProductoDet;
    }

}
