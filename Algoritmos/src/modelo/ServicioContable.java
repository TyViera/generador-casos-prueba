package modelo;

import java.util.List;
import util.AuditoriaBean;

public class ServicioContable extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private String cuentaContable;

    private List<TarifaParticular> tarifaParticulares;

    private List<Tarifario> tarifarios;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuentaContable() {
        return cuentaContable;
    }

    public void setCuentaContable(String cuentaContable) {
        this.cuentaContable = cuentaContable;
    }

    public List<TarifaParticular> getTarifaParticulares() {
        return tarifaParticulares;
    }

    public void setTarifaParticulares(List<TarifaParticular> tarifaParticulares) {
        this.tarifaParticulares = tarifaParticulares;
    }

    public List<Tarifario> getTarifarios() {
        return tarifarios;
    }

    public void setTarifarios(List<Tarifario> tarifarios) {
        this.tarifarios = tarifarios;
    }

}
