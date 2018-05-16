package modelo;

import util.AuditoriaBean;

public class HospCuarto extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String numero;

    private Tarifario tarifario;

    private TarifaParticular tarifaParticular;

    public HospCuarto() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Tarifario getTarifario() {
        return tarifario;
    }

    public void setTarifario(Tarifario tarifario) {
        this.tarifario = tarifario;
    }

    public TarifaParticular getTarifaParticular() {
        return tarifaParticular;
    }

    public void setTarifaParticular(TarifaParticular tarifaParticular) {
        this.tarifaParticular = tarifaParticular;
    }
}
