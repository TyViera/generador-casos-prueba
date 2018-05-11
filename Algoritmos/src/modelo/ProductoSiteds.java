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
@Table(name = "productositeds")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class ProductoSiteds extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String codigo;

    private String nombre;

    private String abreviatura;

    @Column(name = "listacodigos")
    private String listaCodigos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idaseguradora")
    private Aseguradora aseguradora;

    public ProductoSiteds() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }

    public String getListaCodigos() {
        return listaCodigos;
    }

    public void setListaCodigos(String listaCodigos) {
        this.listaCodigos = listaCodigos;
    }

}
