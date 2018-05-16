package modelo;

import java.math.BigDecimal;
import java.util.List;
import util.AuditoriaBean;

public class Tarifario extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String codigo;

    private String nombre;

    private Character tipo;

    private BigDecimal puntos;

    private Boolean modificable;

    private Boolean aplicaLaparoscopia;

    private BigDecimal puntajeMinimo;

    private Boolean aplicaPuntajeMinimo;

    private Cobertura cobertura;

    private Servicio servicio;

    private ServicioContable servicioContable;

    private List<InforMedicoExamen> inforMedicoExamenes;

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
