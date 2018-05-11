package modelo;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
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
@Table(name = "segusnocubierto")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class SegusNoCubierto extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idaseguradora", nullable = false)
    private Aseguradora aseguradora;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idsegus", nullable = false)
    private Tarifario tarifaNoCubierta;

    @Column(name = "tipo")
    private String tipo;

    public SegusNoCubierto() {
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }

    public Tarifario getTarifaNoCubierta() {
        return tarifaNoCubierta;
    }

    public void setTarifaNoCubierta(Tarifario tarifaNoCubierta) {
        this.tarifaNoCubierta = tarifaNoCubierta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
