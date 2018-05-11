/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import com.grupocaritafeliz.sistemaclinico.util.Detalle;

/**
 *
 * @author CARLOS
 */
@Entity
@Table(name = "promocion")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Promocion extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "fecini", nullable = false)
    private Date fechaInicio;

    @Column(name = "fecfin", nullable = false)
    private Date fechaFin;
    
    @Detalle
	@JsonIgnoreProperties("promocion")
	@OneToMany(mappedBy="promocion",fetch=FetchType.LAZY)
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
