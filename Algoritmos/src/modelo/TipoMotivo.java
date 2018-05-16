package modelo;

import java.util.List;
import util.AuditoriaBean;

public class TipoMotivo extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private List<Motivo> motivos;

    public TipoMotivo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
