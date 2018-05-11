package modelo;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "piezadental")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class PiezaDental extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "codigotrama", nullable = false)
    private String codigoTrama;

    @Column(name = "numeropieza", nullable = false)
    private Integer numeroPieza;

    @Column(name = "tipopieza", nullable = false)
    private String tipoPieza;
    
    public PiezaDental() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoTrama() {
        return codigoTrama;
    }

    public void setCodigoTrama(String codigoTrama) {
        this.codigoTrama = codigoTrama;
    }

    public Integer getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(Integer numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getTipoPieza() {
        return tipoPieza;
    }

    public void setTipoPieza(String tipoPieza) {
        this.tipoPieza = tipoPieza;
    }

}
