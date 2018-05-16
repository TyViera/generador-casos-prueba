package modelo;

import java.util.List;
import util.AuditoriaBean;

public class TipoPaciente extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String abreviatura;

    private String nombre;

    private List<Admision> admisions;

    public TipoPaciente() {
    }

    public String getAbreviatura() {
        return this.abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Admision> getAdmisions() {
        return this.admisions;
    }

    public void setAdmisions(List<Admision> admisions) {
        this.admisions = admisions;
    }

    public Admision addAdmisions(Admision admision) {
        getAdmisions().add(admision);
        admision.setTipoPaciente(this);
        return admision;
    }

    public Admision removeAtencion(Admision admision) {
        getAdmisions().remove(admision);
        admision.setTipoPaciente(null);
        return admision;
    }

}
