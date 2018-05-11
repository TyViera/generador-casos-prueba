package modelo;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "labanalisisetiqueta")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class LabAnalisisEtiqueta extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String etiqueta;
    private String descripcion;

    public LabAnalisisEtiqueta() {
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
