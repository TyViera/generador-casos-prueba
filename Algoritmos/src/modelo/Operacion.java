package modelo;

import java.util.List;
import util.AuditoriaBean;

public class Operacion extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String abreviatura;

    private Boolean inventario;

    private String nombre;

    private String regCompra;

    private String regVenta;

    private String tipo;

    private String tipoTransaccion;

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
