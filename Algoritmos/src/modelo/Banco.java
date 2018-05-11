package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import java.util.List;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
@Table(name = "banco")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Banco extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "abreviatura", nullable = false)
    private String abreviatura;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @JsonIgnoreProperties("banco")
    @OneToMany(mappedBy = "banco", fetch = FetchType.LAZY)
    private List<PagoTarjeta> pagosTarjeta;

    public Banco() {
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

    public List<PagoTarjeta> getPagosTarjeta() {
        return pagosTarjeta;
    }

    public void setPagosTarjeta(List<PagoTarjeta> pagosTarjeta) {
        this.pagosTarjeta = pagosTarjeta;
    }

}
