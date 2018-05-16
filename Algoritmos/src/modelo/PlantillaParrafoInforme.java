package modelo;

import util.AuditoriaBean;

public class PlantillaParrafoInforme extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String contenido;

    private ParrafoInforme parrafoInforme;

    public PlantillaParrafoInforme() {
    }

    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public ParrafoInforme getParrafoInforme() {
        return this.parrafoInforme;
    }

    public void setParrafoInforme(ParrafoInforme parrafoInforme) {
        this.parrafoInforme = parrafoInforme;
    }

}
