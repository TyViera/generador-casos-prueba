package modelo;

import util.AuditoriaBean;

public class SegusNoCubierto extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Aseguradora aseguradora;

    private Tarifario tarifaNoCubierta;

    private String tipo;

    public SegusNoCubierto() {
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }

    public Tarifario getTarifaNoCubierta() {
        return tarifaNoCubierta;
    }

    public void setTarifaNoCubierta(Tarifario tarifaNoCubierta) {
        this.tarifaNoCubierta = tarifaNoCubierta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
