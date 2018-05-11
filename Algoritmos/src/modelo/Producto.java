package modelo;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import com.grupocaritafeliz.sistemaclinico.util.Detalle;
import java.util.Date;
import javax.persistence.Temporal;

/**
 * The persistent class for the producto database table.
 *
 */
@Entity
@Table(name = "producto")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Producto extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "afectoigv")
    private Boolean afectoIgv;

    @Column(name = "fechafinexoner")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFinExoneracion;

    @Column(name = "codbarras")
    private String codBarras;

    @Column(name = "coddigemid")
    private String codDigemid;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "codlaboratorio")
    private String codLaboratorio;

    @Column(name = "codTrama")
    private String codtrama;

    @Column(name = "costopromedio")
    private BigDecimal costoPromedio;

    @Column(name = "ctacontable")
    private String ctaContable;

    @Column(name = "esalcohol")
    private Boolean esAlcohol;

    @Column(name = "esdroga")
    private Boolean esDroga;

    @Column(name = "esestupefaciente")
    private Boolean esEstupefaciente;

    @Column(name = "esmedicamento")
    private Boolean esMedicamento;

    @Column(name = "esotros")
    private Boolean esOtros;

    @Column(name = "esinsumo ")
    private Boolean esInsumo;

    @Column(name = "margen")
    private BigDecimal margen;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "observacion")
    private String observacion;

    @Column(name = "preciokairos")
    private BigDecimal precioKairos;

    @Column(name = "precioventa")
    private BigDecimal precioVenta;

    @Column(name = "stockmin")
    private BigDecimal stockMin;

    @Column(name = "prioridadventa")
    private Integer prioridadVenta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idfuncion")
    private FuncionFarmac funcionFarmac;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idunidad")
    private Unidad unidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idlaboratorio")
    private Laboratorio laboratorio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpresentacion")
    private Presentacion presentacion;

    @Detalle
    @JsonIgnoreProperties("producto")
    @OneToMany(mappedBy = "producto")
    private List<ProductoContGenerico> productoContGenericos;

    @Detalle
    @JsonIgnoreProperties("producto")
    @OneToMany(mappedBy = "producto")
    private List<InforMedicoTratamiento> inforMedicoProductos;

    @JsonIgnoreProperties("producto")
    @OneToMany(mappedBy = "producto")
    private List<ProductoNoCubierto> productoNoCubiertos;

    @JsonIgnoreProperties("producto")
    @OneToMany(mappedBy = "producto")
    private List<InventarioTotal> inventario;

    @JsonIgnoreProperties("documentoCabecera")
    @OneToMany(mappedBy = "documentoCabecera", fetch = FetchType.LAZY)
    private List<DocumProductoDet> documentosProductoDet;

    public Producto() {
    }

    public Boolean getAfectoIgv() {
        return this.afectoIgv;
    }

    public void setAfectoIgv(Boolean afectoIgv) {
        this.afectoIgv = afectoIgv;
    }

    public String getCodBarras() {
        return this.codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getCodDigemid() {
        return this.codDigemid;
    }

    public void setCodDigemid(String codDigemid) {
        this.codDigemid = codDigemid;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodLaboratorio() {
        return this.codLaboratorio;
    }

    public void setCodLaboratorio(String codLaboratorio) {
        this.codLaboratorio = codLaboratorio;
    }

    public String getCodtrama() {
        return this.codtrama;
    }

    public void setCodtrama(String codtrama) {
        this.codtrama = codtrama;
    }

    public BigDecimal getCostoPromedio() {
        return this.costoPromedio;
    }

    public void setCostoPromedio(BigDecimal costoPromedio) {
        this.costoPromedio = costoPromedio;
    }

    public String getCtaContable() {
        return this.ctaContable;
    }

    public void setCtaContable(String ctaContable) {
        this.ctaContable = ctaContable;
    }

    public Boolean getEsAlcohol() {
        return this.esAlcohol;
    }

    public void setEsAlcohol(Boolean esAlcohol) {
        this.esAlcohol = esAlcohol;
    }

    public Boolean getEsDroga() {
        return this.esDroga;
    }

    public void setEsDroga(Boolean esDroga) {
        this.esDroga = esDroga;
    }

    public Boolean getEsEstupefaciente() {
        return this.esEstupefaciente;
    }

    public void setEsEstupefaciente(Boolean esEstupefaciente) {
        this.esEstupefaciente = esEstupefaciente;
    }

    public Boolean getEsMedicamento() {
        return this.esMedicamento;
    }

    public void setEsMedicamento(Boolean esMedicamento) {
        this.esMedicamento = esMedicamento;
    }

    public BigDecimal getMargen() {
        return this.margen;
    }

    public void setMargen(BigDecimal margen) {
        this.margen = margen;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigDecimal getPrecioKairos() {
        return this.precioKairos;
    }

    public void setPrecioKairos(BigDecimal precioKairos) {
        this.precioKairos = precioKairos;
    }

    public BigDecimal getPrecioVenta() {
        return this.precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public BigDecimal getStockMin() {
        return this.stockMin;
    }

    public void setStockMin(BigDecimal stockMin) {
        this.stockMin = stockMin;
    }

    public FuncionFarmac getFuncionFarmac() {
        return this.funcionFarmac;
    }

    public void setFuncionFarmac(FuncionFarmac funcionFarmac) {
        this.funcionFarmac = funcionFarmac;
    }

    public Unidad getUnidad() {
        return this.unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public Presentacion getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(Presentacion presentacion) {
        this.presentacion = presentacion;
    }

    public List<ProductoContGenerico> getProductoContGenericos() {
        return this.productoContGenericos;
    }

    public void setProductoContGenericos(List<ProductoContGenerico> productoContGenericos) {
        this.productoContGenericos = productoContGenericos;
    }

    public ProductoContGenerico addProductocontgenerico(ProductoContGenerico productoContGenerico) {
        getProductoContGenericos().add(productoContGenerico);
        productoContGenerico.setProducto(this);
        return productoContGenerico;
    }

    public ProductoContGenerico removeProductoContGenerico(ProductoContGenerico productoContGenerico) {
        getProductoContGenericos().remove(productoContGenerico);
        productoContGenerico.setProducto(null);
        return productoContGenerico;
    }

    public List<InforMedicoTratamiento> getInforMedicoProductos() {
        return this.inforMedicoProductos;
    }

    public void setInforMedicoProductos(List<InforMedicoTratamiento> inforMedicoProductos) {
        this.inforMedicoProductos = inforMedicoProductos;
    }

    public InforMedicoTratamiento addInforMedicoProducto(InforMedicoTratamiento inforMedicoProducto) {
        getInforMedicoProductos().add(inforMedicoProducto);
        inforMedicoProducto.setProducto(this);
        return inforMedicoProducto;
    }

    public InforMedicoTratamiento removeInforMedicoProducto(InforMedicoTratamiento inforMedicoProducto) {
        getInforMedicoProductos().remove(inforMedicoProducto);
        inforMedicoProducto.setProducto(null);
        return inforMedicoProducto;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public List<ProductoNoCubierto> getProductoNoCubiertos() {
        return this.productoNoCubiertos;
    }

    public void setProductoNoCubiertos(List<ProductoNoCubierto> productoNoCubiertos) {
        this.productoNoCubiertos = productoNoCubiertos;
    }

    public ProductoNoCubierto addInforMedicoProducto(ProductoNoCubierto productoNoCubierto) {
        getProductoNoCubiertos().add(productoNoCubierto);
        productoNoCubierto.setProducto(this);
        return productoNoCubierto;
    }

    public ProductoNoCubierto removeInforMedicoProducto(ProductoNoCubierto productoNoCubierto) {
        getProductoNoCubiertos().remove(productoNoCubierto);
        productoNoCubierto.setProducto(null);
        return productoNoCubierto;
    }

    public List<DocumProductoDet> getDocumentosProductoDet() {
        return documentosProductoDet;
    }

    public void setDocumentosProductoDet(List<DocumProductoDet> documentosProductoDet) {
        this.documentosProductoDet = documentosProductoDet;
    }

    public List<InventarioTotal> getInventario() {
        return inventario;
    }

    public void setInventario(List<InventarioTotal> inventario) {
        this.inventario = inventario;
    }

    public Date getFechaFinExoneracion() {
        return fechaFinExoneracion;
    }

    public void setFechaFinExoneracion(Date fechaFinExoneracion) {
        this.fechaFinExoneracion = fechaFinExoneracion;
    }

    public Boolean getEsOtros() {
        return esOtros;
    }

    public void setEsOtros(Boolean esOtros) {
        this.esOtros = esOtros;
    }

    public Boolean getEsInsumo() {
        return esInsumo;
    }

    public void setEsInsumo(Boolean esInsumo) {
        this.esInsumo = esInsumo;
    }

    public Integer getPrioridadVenta() {
        return prioridadVenta;
    }

    public void setPrioridadVenta(Integer prioridadVenta) {
        this.prioridadVenta = prioridadVenta;
    }

}
