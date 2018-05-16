package modelo;

import java.util.List;
import util.AuditoriaBean;

public class ParrafoInforme extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String descripcion;

    private Integer orden;

    private String tipo;

    private Boolean multilinea;

    private List<InforMedicoDetalle> inforMedicoDetalles;

    private TituloInforme tituloInforme;

    private List<PlantillaParrafoInforme> plantillaParrafoInformes;

    public ParrafoInforme() {
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getOrden() {
        return this.orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<InforMedicoDetalle> getInforMedicoDetalles() {
        return this.inforMedicoDetalles;
    }

    public void setInforMedicoDetalles(List<InforMedicoDetalle> inforMedicoDetalles) {
        this.inforMedicoDetalles = inforMedicoDetalles;
    }

    public InforMedicoDetalle addInforMedicoDetalle(InforMedicoDetalle inforMedicoDetalle) {
        getInforMedicoDetalles().add(inforMedicoDetalle);
        inforMedicoDetalle.setParrafoInforme(this);

        return inforMedicoDetalle;
    }

    public InforMedicoDetalle removeInforMedicoDetalle(InforMedicoDetalle inforMedicoDetalle) {
        getInforMedicoDetalles().remove(inforMedicoDetalle);
        inforMedicoDetalle.setParrafoInforme(null);

        return inforMedicoDetalle;
    }

    public TituloInforme getTituloInforme() {
        return this.tituloInforme;
    }

    public void setTituloInforme(TituloInforme tituloInforme) {
        this.tituloInforme = tituloInforme;
    }

    public List<PlantillaParrafoInforme> getPlantillaParrafoInformes() {
        return this.plantillaParrafoInformes;
    }

    public void setPlantillaParrafoInformes(List<PlantillaParrafoInforme> plantillaParrafoInformes) {
        this.plantillaParrafoInformes = plantillaParrafoInformes;
    }

    public PlantillaParrafoInforme addPlantillaParrafoInforme(PlantillaParrafoInforme plantillaParrafoInforme) {
        getPlantillaParrafoInformes().add(plantillaParrafoInforme);
        plantillaParrafoInforme.setParrafoInforme(this);

        return plantillaParrafoInforme;
    }

    public PlantillaParrafoInforme removePlantillaParrafoInforme(PlantillaParrafoInforme plantillaParrafoInforme) {
        getPlantillaParrafoInformes().remove(plantillaParrafoInforme);
        plantillaParrafoInforme.setParrafoInforme(null);

        return plantillaParrafoInforme;
    }

    public Boolean getMultilinea() {
        return multilinea;
    }

    public void setMultilinea(Boolean multilinea) {
        this.multilinea = multilinea;
    }

}
