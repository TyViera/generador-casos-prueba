package modelo;

import util.AuditoriaBean;

public class Correlativo extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String anio;

    private String nombre;

    private Integer numero;

    public Correlativo() {
    }

    public String getAnio() {
        return this.anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer siguienteNumero() {
        this.numero++;
        return this.numero;
    }

}
