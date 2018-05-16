package modelo;

import java.util.Date;
import util.AuditoriaBean;

public class Feriado extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Date fechaFeriado;

    public Feriado() {

    }

    public Date getFechaFeriado() {
        return fechaFeriado;
    }

}
