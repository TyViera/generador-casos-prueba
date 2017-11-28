package pe.edu.unp.generadorpruebas.modelo;

import pe.edu.unp.generadorpruebas.util.Constantes;

public class CasoDePrueba implements Comparable<CasoDePrueba> {

    private Integer id;
    private Double diversidad;//em base a cantidad de valores repetidos del caso de priea(parametros)
    private Double calidad;//100 - diversidad
    private CaminoEjecucion caminoEjecucion;

    public CasoDePrueba() {
    }

    public CasoDePrueba(CasoDePrueba casoPrueba) {
        this.id = casoPrueba.id;
        this.diversidad = casoPrueba.diversidad;
        this.calidad = casoPrueba.calidad;
        this.caminoEjecucion = new CaminoEjecucion(casoPrueba.caminoEjecucion);
    }

    public CasoDePrueba(Integer id) {
        this.id = id;
    }

    public CasoDePrueba(Integer id, Double diversidad) {
        this.id = id;
        this.diversidad = diversidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getDiversidad() {
        return diversidad;
    }

    public void setDiversidad(Double diversidad) {
        this.diversidad = diversidad;
        this.calidad = Constantes.VALOR_MAX_DIVERSIDAD - this.diversidad;
    }

    public Double getCalidad() {
        return calidad;
    }

    public void setCalidad(Double calidad) {
        this.calidad = calidad;
        this.diversidad = Constantes.VALOR_MAX_DIVERSIDAD - this.calidad;
    }

    public CaminoEjecucion getCaminoEjecucion() {
        return caminoEjecucion;
    }

    public void setCaminoEjecucion(CaminoEjecucion caminoEjecucion) {
        this.caminoEjecucion = caminoEjecucion;
    }

    @Override
    public int compareTo(CasoDePrueba o) {
        return Double.compare(this.diversidad, o.diversidad);
    }

    @Override
    public String toString() {
        return "CasoDePrueba{" + "id=" + id + ", diversidad=" + diversidad + ", calidad=" + calidad + ", caminoEjecucion=" + caminoEjecucion + '}';
    }

}
