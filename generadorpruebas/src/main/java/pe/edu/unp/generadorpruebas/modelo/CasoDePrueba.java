package pe.edu.unp.generadorpruebas.modelo;

import pe.edu.unp.generadorpruebas.util.Constantes;

public class CasoDePrueba implements Comparable<CasoDePrueba> {

    private Integer id;
    private Integer diversidad;
    private Integer calidad;

    public CasoDePrueba() {
    }

    public CasoDePrueba(Integer id) {
        this.id = id;
    }

    public CasoDePrueba(Integer id, Integer diversidad) {
        this.id = id;
        this.diversidad = diversidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDiversidad() {
        return diversidad;
    }

    public void setDiversidad(Integer diversidad) {
        this.diversidad = diversidad;
        this.calidad = Constantes.VALOR_MAX_DIVERSIDAD - this.diversidad;
    }

    public Integer getCalidad() {
        return calidad;
    }

    public void setCalidad(Integer calidad) {
        this.calidad = calidad;
        this.diversidad = Constantes.VALOR_MAX_DIVERSIDAD - this.calidad;
    }

    @Override
    public int compareTo(CasoDePrueba o) {
        return Integer.compare(this.diversidad, o.diversidad);
    }
}
