package modelo;

import java.math.BigDecimal;
import java.util.List;
import util.AuditoriaBean;

public class TarifaParticular extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private String cuentaContable;

    private BigDecimal precio;

    private BigDecimal precioEmergencia;

    private Boolean modificable;

    private Boolean facturaCarita;

    private Servicio servicio;

    private ServicioContable servicioContable;

    private List<InforMedicoExamen> inforMedicoExamenes;

    private List<TipoTarjetaDescuentoServicio> descuentos;

    private List<DocumExamenesDet> documExamenesDets;

    private BigDecimal descuento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getPrecioEmergencia() {
        return precioEmergencia;
    }

    public void setPrecioEmergencia(BigDecimal precioEmergencia) {
        this.precioEmergencia = precioEmergencia;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public List<InforMedicoExamen> getInforMedicoExamenes() {
        return inforMedicoExamenes;
    }

    public void setInforMedicoExamenes(List<InforMedicoExamen> inforMedicoExamenes) {
        this.inforMedicoExamenes = inforMedicoExamenes;
    }

    public InforMedicoExamen addInforMedicoProducto(InforMedicoExamen inforMedicoExamen) {
        getInforMedicoExamenes().add(inforMedicoExamen);
        inforMedicoExamen.setExamenParticular(this);
        return inforMedicoExamen;
    }

    public InforMedicoExamen removeInforMedicoProducto(InforMedicoExamen inforMedicoExamen) {
        getInforMedicoExamenes().remove(inforMedicoExamen);
        inforMedicoExamen.setExamenParticular(null);
        return inforMedicoExamen;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public Boolean getModificable() {
        return modificable;
    }

    public void setModificable(Boolean modificable) {
        this.modificable = modificable;
    }

    public ServicioContable getServicioContable() {
        return servicioContable;
    }

    public void setServicioContable(ServicioContable servicioContable) {
        this.servicioContable = servicioContable;
    }

    public String getCuentaContable() {
        return cuentaContable;
    }

    public void setCuentaContable(String cuentaContable) {
        this.cuentaContable = cuentaContable;
    }

    public Boolean getFacturaCarita() {
        return facturaCarita;
    }

    public void setFacturaCarita(Boolean facturaCarita) {
        this.facturaCarita = facturaCarita;
    }

    public List<TipoTarjetaDescuentoServicio> getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(List<TipoTarjetaDescuentoServicio> descuentos) {
        this.descuentos = descuentos;
    }

    public List<DocumExamenesDet> getDocumExamenesDets() {
        return documExamenesDets;
    }

    public void setDocumExamenesDets(List<DocumExamenesDet> documExamenesDets) {
        this.documExamenesDets = documExamenesDets;
    }

}
