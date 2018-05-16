package modelo;

import java.util.Date;
import java.math.BigDecimal;
import util.AuditoriaBean;

public class TarifaSocial extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private BigDecimal honorario;

    private Date fecini;

    private Date fecfin;

    private String motivo;

    private Medico medico;

    private Persona persona;

    public TarifaSocial() {
    }

    public BigDecimal getHonorario() {
        return honorario;
    }

    public void setHonorario(BigDecimal honorario) {
        this.honorario = honorario;
    }

    public Date getFecini() {
        return fecini;
    }

    public void setFecini(Date fecini) {
        this.fecini = fecini;
    }

    public Date getFecfin() {
        return fecfin;
    }

    public void setFecfin(Date fecfin) {
        this.fecfin = fecfin;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
