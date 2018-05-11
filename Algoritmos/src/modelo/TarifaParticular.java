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
import javax.persistence.Transient;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;

@Entity
@Table(name = "tarifaparticular")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class TarifaParticular extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "ctacontable")
    private String cuentaContable;

    @Column(name = "precio", precision = 10, scale = 2)
    private BigDecimal precio;

    @Column(name = "precioemergencia", precision = 10, scale = 2)
    private BigDecimal precioEmergencia;

    @Column(name = "modificable")
    private Boolean modificable;

    @Column(name = "facturacarita")
    private Boolean facturaCarita;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idservicio")
    private Servicio servicio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idserviciocontable")
    private ServicioContable servicioContable;

    @JsonIgnoreProperties("examenParticular")
    @OneToMany(mappedBy = "examenParticular", fetch = FetchType.LAZY)
    private List<InforMedicoExamen> inforMedicoExamenes;

    @JsonIgnoreProperties("tarifaParticular")
    @OneToMany(mappedBy = "tarifaParticular", fetch = FetchType.LAZY)
    private List<TipoTarjetaDescuentoServicio> descuentos;

    @JsonIgnoreProperties("examenParticular")
    @OneToMany(mappedBy = "examenParticular", fetch = FetchType.LAZY)
    private List<DocumExamenesDet> documExamenesDets;

    @Transient
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
