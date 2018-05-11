package modelo;

//package com.grupocaritafeliz.sistemaclinico.entidad;
//
//import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
//import java.math.BigDecimal;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import org.hibernate.annotations.DynamicInsert;
//import org.hibernate.annotations.DynamicUpdate;
//import org.hibernate.annotations.SelectBeforeUpdate;
//
//@Entity
//@Table(name = "topemedico")
//@DynamicUpdate(value = true)
//@DynamicInsert(value = true)
//@SelectBeforeUpdate
//public class TopeMedico extends AuditoriaBean {
//
//    private static final long serialVersionUID = 1L;
//
//    private Integer anio;
//
//    private Integer mes;
//
//    private BigDecimal tope;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "idmedico")
//    private Medico medico;
//
//    public TopeMedico() {
//    }
//
//    public Medico getMedico() {
//        return medico;
//    }
//
//    public void setMedico(Medico medico) {
//        this.medico = medico;
//    }
//
//    public Integer getAnio() {
//        return anio;
//    }
//
//    public void setAnio(Integer anio) {
//        this.anio = anio;
//    }
//
//    public Integer getMes() {
//        return mes;
//    }
//
//    public void setMes(Integer mes) {
//        this.mes = mes;
//    }
//
//    public BigDecimal getTope() {
//        return tope;
//    }
//
//    public void setTope(BigDecimal tope) {
//        this.tope = tope;
//    }
//
//}
