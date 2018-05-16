package modelo;

import java.math.BigDecimal;
import java.util.Date;
import util.AuditoriaBean;

public class InventarioTotal extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Producto producto;

    private Almacen almacen;

    private Integer mes;

    private Integer anio;

    private Date fechaCompra;

    private BigDecimal costoPromedio;

    private BigDecimal stockInicial;

    private BigDecimal entrada;

    private BigDecimal salida;

    private BigDecimal precioKairos;

    private BigDecimal precioVenta;

    public InventarioTotal() {
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public BigDecimal getStockInicial() {
        return stockInicial;
    }

    public void setStockInicial(BigDecimal stockInicial) {
        this.stockInicial = stockInicial;
    }

    public BigDecimal getEntrada() {
        return entrada;
    }

    public void setEntrada(BigDecimal entrada) {
        this.entrada = entrada;
    }

    public BigDecimal getSalida() {
        return salida;
    }

    public void setSalida(BigDecimal salida) {
        this.salida = salida;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public BigDecimal getCostoPromedio() {
        return costoPromedio;
    }

    public void setCostoPromedio(BigDecimal costoPromedio) {
        this.costoPromedio = costoPromedio;
    }

    public BigDecimal getPrecioKairos() {
        return precioKairos;
    }

    public void setPrecioKairos(BigDecimal precioKairos) {
        this.precioKairos = precioKairos;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

}
