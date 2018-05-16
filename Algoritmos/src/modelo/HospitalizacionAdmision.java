package modelo;

import java.sql.Timestamp;
import util.AuditoriaBean;

public class HospitalizacionAdmision extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String numeroCama;

    private Timestamp diaOperacion;

    private String tipoProcedencia;

    private String lugarProcedencia;

    private Admision admision;

    private HospCuarto cuarto;

    private Persona personaResponsable;

    private Medico medico;

    public HospitalizacionAdmision() {
    }

    public String getNumeroCama() {
        return numeroCama;
    }

    public void setNumeroCama(String numeroCama) {
        this.numeroCama = numeroCama;
    }

    public Timestamp getDiaOperacion() {
        return diaOperacion;
    }

    public void setDiaOperacion(Timestamp diaOperacion) {
        this.diaOperacion = diaOperacion;
    }

    public String getTipoProcedencia() {
        return tipoProcedencia;
    }

    public void setTipoProcedencia(String tipoProcedencia) {
        this.tipoProcedencia = tipoProcedencia;
    }

    public String getLugarProcedencia() {
        return lugarProcedencia;
    }

    public void setLugarProcedencia(String lugarProcedencia) {
        this.lugarProcedencia = lugarProcedencia;
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }

    public HospCuarto getCuarto() {
        return cuarto;
    }

    public void setCuarto(HospCuarto cuarto) {
        this.cuarto = cuarto;
    }

    public Persona getPersonaResponsable() {
        return personaResponsable;
    }

    public void setPersonaResponsable(Persona personaResponsable) {
        this.personaResponsable = personaResponsable;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}
