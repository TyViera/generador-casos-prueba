package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import com.grupocaritafeliz.sistemaclinico.util.Detalle;

/**
 * The persistent class for the empresa database table.
 *
 */
@Entity
@Table(name = "hospcuarto")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class HospCuarto extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(nullable = false, length = 6)
    private String numero;
    
    @Detalle
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idsegus")
    private Tarifario tarifario;
    
    @Detalle
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtarifaparticular")
    private TarifaParticular tarifaParticular;

    public HospCuarto() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Tarifario getTarifario() {
        return tarifario;
    }

    public void setTarifario(Tarifario tarifario) {
        this.tarifario = tarifario;
    }

    public TarifaParticular getTarifaParticular() {
        return tarifaParticular;
    }

    public void setTarifaParticular(TarifaParticular tarifaParticular) {
        this.tarifaParticular = tarifaParticular;
    }
}
