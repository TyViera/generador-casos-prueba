package modelo;

import java.sql.Timestamp;
import util.AuditoriaBean;

public class FichaAtencionIntegral extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String grupo;

    private Timestamp fechaEntrega;

    private Persona persona;

    public FichaAtencionIntegral() {
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Timestamp getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Timestamp fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
