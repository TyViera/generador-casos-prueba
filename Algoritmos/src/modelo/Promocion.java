/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import java.util.List;
import util.AuditoriaBean;

public class Promocion extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private Date fechaInicio;

    private Date fechaFin;

    private List<PromocionDetalle> detalle;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<PromocionDetalle> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<PromocionDetalle> detalle) {
        this.detalle = detalle;
    }

}
