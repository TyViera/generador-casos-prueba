package modelo;

import java.math.BigDecimal;
import java.util.List;
import util.AuditoriaBean;

public class InforMedico extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String anio;

    private Integer numero;

    private Medico medico;

    private Persona persona;

    private TipoInforme tipoInforme;

    private List<InforMedicoDetalle> informedicodetalles;

    private List<InforMedicoDiagnostico> inforMedicoDiagnosticos;

    private List<InforMedicoExamen> inforMedicoExamenes;

    private List<InforMedicoTratamiento> inforMedicoTratamientos;

    private AdmisionMedico admisionMedico;

    private List<InforMedicoTopico> inforMedicoTopicos;

    private List<InforMedicoTratamientoAdicional> inforMedicoTratamientosAdicional;

    private List<InformedicoTratamientoPiezaDental> informedicoTratamientoPiezasDentales;

    private List<InforMedicoAnotacion> inforMedicoAnotaciones;

    private List<InforMedicoEvolucion> inforMedicoEvoluciones;

    private List<InforMedicoIndicacion> inforMedicoIndicaciones;

    private BigDecimal peso;

    private BigDecimal talla;

    private BigDecimal temperatura;

    private Integer presSistolica;

    private Integer presDiastolica;

    private Integer frecCardiaca;

    private Integer frecRespiratoria;

    public InforMedico() {
    }

    public String getAnio() {
        return this.anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public TipoInforme getTipoInforme() {
        return this.tipoInforme;
    }

    public void setTipoInforme(TipoInforme tipoInforme) {
        this.tipoInforme = tipoInforme;
    }

    public List<InforMedicoDetalle> getInformedicodetalles() {
        return this.informedicodetalles;
    }

    public void setInformedicodetalles(List<InforMedicoDetalle> informedicodetalles) {
        this.informedicodetalles = informedicodetalles;
    }

    public InforMedicoDetalle addInformedicodetalle(InforMedicoDetalle informedicodetalle) {
        getInformedicodetalles().add(informedicodetalle);
        informedicodetalle.setInformedico(this);
        return informedicodetalle;
    }

    public InforMedicoDetalle removeInformedicodetalle(InforMedicoDetalle informedicodetalle) {
        getInformedicodetalles().remove(informedicodetalle);
        informedicodetalle.setInformedico(null);
        return informedicodetalle;
    }

    public List<InforMedicoDiagnostico> getInforMedicoDiagnosticos() {
        return this.inforMedicoDiagnosticos;
    }

    public void setInforMedicoDiagnosticos(List<InforMedicoDiagnostico> inforMedicoDiagnosticos) {
        this.inforMedicoDiagnosticos = inforMedicoDiagnosticos;
    }

    public InforMedicoDiagnostico addInforMedicoDiagnostico(InforMedicoDiagnostico inforMedicoDiagnostico) {
        getInforMedicoDiagnosticos().add(inforMedicoDiagnostico);
        inforMedicoDiagnostico.setInformedico(this);
        return inforMedicoDiagnostico;
    }

    public InforMedicoDiagnostico removeInforMedicoDiagnostico(InforMedicoDiagnostico inforMedicoDiagnostico) {
        getInforMedicoDiagnosticos().remove(inforMedicoDiagnostico);
        inforMedicoDiagnostico.setInformedico(null);
        return inforMedicoDiagnostico;
    }

    public AdmisionMedico getAdmisionMedico() {
        return admisionMedico;
    }

    public void setAdmisionMedico(AdmisionMedico admisionMedico) {
        this.admisionMedico = admisionMedico;
    }

    public List<InforMedicoExamen> getInforMedicoExamenes() {
        return this.inforMedicoExamenes;
    }

    public void setInforMedicoExamenes(List<InforMedicoExamen> inforMedicoExamenes) {
        this.inforMedicoExamenes = inforMedicoExamenes;
    }

    public InforMedicoExamen addInforMedicoExamen(InforMedicoExamen inforMedicoExamen) {
        getInforMedicoExamenes().add(inforMedicoExamen);
        inforMedicoExamen.setInformedico(this);
        return inforMedicoExamen;
    }

    public InforMedicoExamen removeInforMedicoExamen(InforMedicoExamen inforMedicoExamen) {
        getInforMedicoExamenes().remove(inforMedicoExamen);
        inforMedicoExamen.setInformedico(null);
        return inforMedicoExamen;
    }

    public List<InforMedicoTratamiento> getInforMedicoTratamientos() {
        return this.inforMedicoTratamientos;
    }

    public void setInforMedicoTratamientos(List<InforMedicoTratamiento> inforMedicoTratamientos) {
        this.inforMedicoTratamientos = inforMedicoTratamientos;
    }

    public InforMedicoTratamiento addInforMedicoProducto(InforMedicoTratamiento inforMedicoProducto) {
        getInforMedicoTratamientos().add(inforMedicoProducto);
        inforMedicoProducto.setInformedico(this);
        return inforMedicoProducto;
    }

    public InforMedicoTratamiento removeInforMedicoDiagnostico(InforMedicoTratamiento inforMedicoProducto) {
        getInforMedicoTratamientos().remove(inforMedicoProducto);
        inforMedicoProducto.setInformedico(null);
        return inforMedicoProducto;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getTalla() {
        return talla;
    }

    public void setTalla(BigDecimal talla) {
        this.talla = talla;
    }

    public BigDecimal getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(BigDecimal temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getPresSistolica() {
        return presSistolica;
    }

    public void setPresSistolica(Integer presSistolica) {
        this.presSistolica = presSistolica;
    }

    public Integer getPresDiastolica() {
        return presDiastolica;
    }

    public void setPresDiastolica(Integer presDiastolica) {
        this.presDiastolica = presDiastolica;
    }

    public Integer getFrecCardiaca() {
        return frecCardiaca;
    }

    public void setFrecCardiaca(Integer frecCardiaca) {
        this.frecCardiaca = frecCardiaca;
    }

    public Integer getFrecRespiratoria() {
        return frecRespiratoria;
    }

    public void setFrecRespiratoria(Integer frecRespiratoria) {
        this.frecRespiratoria = frecRespiratoria;
    }

    public List<InforMedicoTopico> getInforMedicoTopicos() {
        return inforMedicoTopicos;
    }

    public void setInforMedicoTopicos(List<InforMedicoTopico> inforMedicoTopicos) {
        this.inforMedicoTopicos = inforMedicoTopicos;
    }

    public List<InforMedicoTratamientoAdicional> getInforMedicoTratamientosAdicional() {
        return inforMedicoTratamientosAdicional;
    }

    public void setInforMedicoTratamientosAdicional(List<InforMedicoTratamientoAdicional> inforMedicoTratamientosAdicional) {
        this.inforMedicoTratamientosAdicional = inforMedicoTratamientosAdicional;
    }

    public List<InformedicoTratamientoPiezaDental> getInformedicoTratamientoPiezasDentales() {
        return informedicoTratamientoPiezasDentales;
    }

    public void setInformedicoTratamientoPiezasDentales(List<InformedicoTratamientoPiezaDental> informedicoTratamientoPiezasDentales) {
        this.informedicoTratamientoPiezasDentales = informedicoTratamientoPiezasDentales;
    }

    public List<InforMedicoAnotacion> getInforMedicoAnotaciones() {
        return inforMedicoAnotaciones;
    }

    public void setInforMedicoAnotaciones(List<InforMedicoAnotacion> inforMedicoAnotaciones) {
        this.inforMedicoAnotaciones = inforMedicoAnotaciones;
    }

    public List<InforMedicoEvolucion> getInforMedicoEvoluciones() {
        return inforMedicoEvoluciones;
    }

    public void setInforMedicoEvoluciones(List<InforMedicoEvolucion> inforMedicoEvoluciones) {
        this.inforMedicoEvoluciones = inforMedicoEvoluciones;
    }

    public List<InforMedicoIndicacion> getInforMedicoIndicaciones() {
        return inforMedicoIndicaciones;
    }

    public void setInforMedicoIndicaciones(List<InforMedicoIndicacion> inforMedicoIndicaciones) {
        this.inforMedicoIndicaciones = inforMedicoIndicaciones;
    }

}
