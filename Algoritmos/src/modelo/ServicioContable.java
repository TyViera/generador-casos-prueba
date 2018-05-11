package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import javax.persistence.FetchType;

@Entity
@Table(name = "serviciocontable")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class ServicioContable extends AuditoriaBean {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "ctacontable")
    private String cuentaContable;

    @JsonIgnoreProperties("servicioContable")
    @OneToMany(mappedBy = "servicioContable")
    private List<TarifaParticular> tarifaParticulares;

    @JsonIgnoreProperties("servicioContable")
    @OneToMany(mappedBy = "servicioContable", fetch = FetchType.LAZY)
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
