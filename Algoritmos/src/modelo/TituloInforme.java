package modelo;

import java.util.List;
import util.AuditoriaBean;

public class TituloInforme extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String descripcion;

    private Integer orden;

    private List<ParrafoInforme> parrafoInformes;

    private TipoInforme tipoInforme;

    public TituloInforme() {
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

    public List<ParrafoInforme> getParrafoInformes() {
        return this.parrafoInformes;
    }

    public void setParrafoInformes(List<ParrafoInforme> parrafoInformes) {
        this.parrafoInformes = parrafoInformes;
    }

    public ParrafoInforme addParrafoInforme(ParrafoInforme parrafoInforme) {
        getParrafoInformes().add(parrafoInforme);
        parrafoInforme.setTituloInforme(this);

        return parrafoInforme;
    }

    public ParrafoInforme removeParrafoInforme(ParrafoInforme parrafoInforme) {
        getParrafoInformes().remove(parrafoInforme);
        parrafoInforme.setTituloInforme(null);

        return parrafoInforme;
    }

    public TipoInforme getTipoInforme() {
        return this.tipoInforme;
    }

    public void setTipoInforme(TipoInforme tipoInforme) {
        this.tipoInforme = tipoInforme;
    }

    @Override
    public String toString() {
        return "TituloInforme [id=" + getId() + "descripcion=" + descripcion + ", orden=" + orden
                + ", tipoInforme=" + tipoInforme + "]";
    }

}
