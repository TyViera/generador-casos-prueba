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

/**
 * The persistent class for the tarifario database table.
 *
 */
@Entity
@Table(name = "tarifario")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Tarifario extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "tipo")
    private Character tipo;

    @Column(name = "puntos", precision = 9, scale = 2)
    private BigDecimal puntos;

    @Column(name = "modificable")
    private Boolean modificable;

    @Column(name = "aplicalaparoscopia")
    private Boolean aplicaLaparoscopia;

    @Column(name = "puntajeminimo")
    private BigDecimal puntajeMinimo;

    @Column(name = "aplicapuntajeminimo")
    private Boolean aplicaPuntajeMinimo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcobertura")
    private Cobertura cobertura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idservicio")
    private Servicio servicio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idserviciocontable")
    private ServicioContable servicioContable;

    @JsonIgnoreProperties("examenSeguro")
    @OneToMany(mappedBy = "examenSeguro", fetch = FetchType.LAZY)
    private List<InforMedicoExamen> inforMedicoExamenes;

    @JsonIgnoreProperties("examenSeguro")
    @OneToMany(mappedBy = "examenSeguro", fetch = FetchType.LAZY)
    private List<DocumExamenesDet> documExamenesDets;

    public Tarifario() {
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPuntos() {
        return this.puntos;
    }

    public void setPuntos(BigDecimal puntos) {
        this.puntos = puntos;
    }

    public Cobertura getCobertura() {
        return this.cobertura;
    }

    public void setCobertura(Cobertura cobertura) {
        this.cobertura = cobertura;
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
        inforMedicoExamen.setExamenSeguro(this);
        return inforMedicoExamen;
    }

    public InforMedicoExamen removeInforMedicoProducto(InforMedicoExamen inforMedicoExamen) {
        getInforMedicoExamenes().remove(inforMedicoExamen);
        inforMedicoExamen.setExamenSeguro(null);
        return inforMedicoExamen;
    }

    public List<DocumExamenesDet> getDocumExamenesDets() {
        return documExamenesDets;
    }

    public void setDocumExamenesDets(List<DocumExamenesDet> documExamenesDets) {
        this.documExamenesDets = documExamenesDets;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
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

    public Boolean getAplicaLaparoscopia() {
        return aplicaLaparoscopia;
    }

    public void setAplicaLaparoscopia(Boolean aplicaLaparoscopia) {
        this.aplicaLaparoscopia = aplicaLaparoscopia;
    }

    public BigDecimal getPuntajeMinimo() {
        return puntajeMinimo;
    }

    public void setPuntajeMinimo(BigDecimal puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
    }

    public Boolean getAplicaPuntajeMinimo() {
        return aplicaPuntajeMinimo;
    }

    public void setAplicaPuntajeMinimo(Boolean aplicaPuntajeMinimo) {
        this.aplicaPuntajeMinimo = aplicaPuntajeMinimo;
    }

}
