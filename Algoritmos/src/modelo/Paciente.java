package modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import com.grupocaritafeliz.sistemaclinico.util.Detalle;

@Entity
@Table(name = "paciente")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Paciente extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Detalle
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpersona")
    private Persona persona;

    @Column(name = "email")
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecnac")
    private Date fecNac;

    @Column(name = "sexo")
    private Character sexo;

    @Column(name = "tipoSangre")
    private String tipoSangre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idarchivo")
    private Archivo foto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idparentesco", nullable = false)
    private Parentesco parentesco;
    
    @Detalle
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpadre")
    private Persona padre;
    
    @Detalle
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idmadre")
    private Persona madre;

    public Paciente() {
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecNac() {
        return this.fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public Character getSexo() {
        return this.sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getTipoSangre() {
        return this.tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Parentesco getParentesco() {
        return this.parentesco;
    }

    public void setParentesco(Parentesco parentesco) {
        this.parentesco = parentesco;
    }

    public Archivo getFoto() {
        return foto;
    }

    public void setFoto(Archivo foto) {
        this.foto = foto;
    }

	public Persona getPadre() {
		return padre;
	}

	public void setPadre(Persona padre) {
		this.padre = padre;
	}

	public Persona getMadre() {
		return madre;
	}

	public void setMadre(Persona madre) {
		this.madre = madre;
	}
 
}
