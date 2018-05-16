/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Timestamp;
import util.AuditoriaBean;

public class HospitalizacionPrestacion extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String tipoHospitalizacion;

    private Timestamp fechaIngresoHospitalario;

    private Timestamp fechaEgresoHospitalario;

    private String tipoEgresoHospitalario;

    private Integer diasEstadia;

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
