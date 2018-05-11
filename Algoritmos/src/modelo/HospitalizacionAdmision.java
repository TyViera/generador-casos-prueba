package modelo;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "hospadmision")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class HospitalizacionAdmision extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "numcama")
    private String numeroCama;

    @Column(name = "diaoperacion")
    private Timestamp diaOperacion;

    @Column(name = "tipoprocedencia")
    private String tipoProcedencia;

    @Column(name = "lugarprocedencia")
    private String lugarProcedencia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idadmision")
    private Admision admision;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcuarto")
    private HospCuarto cuarto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpersresponsable")
    private Persona personaResponsable;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idmedico")
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
