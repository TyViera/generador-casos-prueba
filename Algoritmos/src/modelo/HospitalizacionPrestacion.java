/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@Table(name = "hospprestacion")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class HospitalizacionPrestacion extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "tipohospitalizacion", nullable = false)
    private String tipoHospitalizacion;

    @Column(name = "fechaingresohospitalario", nullable = false)
    private Timestamp fechaIngresoHospitalario;

    @Column(name = "fechaegresohospitalario", nullable = false)
    private Timestamp fechaEgresoHospitalario;

    @Column(name = "tipoegresohospitalario", nullable = false)
    private String tipoEgresoHospitalario;

    @Column(name = "diasestadia", nullable = false)
    private Integer diasEstadia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idadmision")
    private Admision admision;

    public HospitalizacionPrestacion() {
    }

    public String getTipoHospitalizacion() {
        return tipoHospitalizacion;
    }

    public void setTipoHospitalizacion(String tipoHospitalizacion) {
        this.tipoHospitalizacion = tipoHospitalizacion;
    }

    public Timestamp getFechaIngresoHospitalario() {
        return fechaIngresoHospitalario;
    }

    public void setFechaIngresoHospitalario(Timestamp fechaIngresoHospitalario) {
        this.fechaIngresoHospitalario = fechaIngresoHospitalario;
    }

    public Timestamp getFechaEgresoHospitalario() {
        return fechaEgresoHospitalario;
    }

    public void setFechaEgresoHospitalario(Timestamp fechaEgresoHospitalario) {
        this.fechaEgresoHospitalario = fechaEgresoHospitalario;
    }

    public String getTipoEgresoHospitalario() {
        return tipoEgresoHospitalario;
    }

    public void setTipoEgresoHospitalario(String tipoEgresoHospitalario) {
        this.tipoEgresoHospitalario = tipoEgresoHospitalario;
    }

    public Integer getDiasEstadia() {
        return diasEstadia;
    }

    public void setDiasEstadia(Integer diasEstadia) {
        this.diasEstadia = diasEstadia;
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }

}
