/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

/**
 *
 * @author nazav
 */
public class AuditoriaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Boolean estado;

    private Timestamp fecha;

    private String ip;

    private String ipmod;

    private String pc;

    private String pcmod;

    private String nick;

    private String nickMod;

    private String observacionmod;

    private Timestamp fechaMod;

    private Boolean eliminar = Boolean.FALSE;

    protected void copy(final AuditoriaBean source) {
        this.nick = source.nick;
        this.fecha = source.fecha;
        this.nickMod = source.nickMod;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Timestamp getFechaMod() {
        return fechaMod;
    }

    public void setFechaMod(Timestamp fechaMod) {
        this.fechaMod = fechaMod;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIpmod() {
        return ipmod;
    }

    public void setIpmod(String ipmod) {
        this.ipmod = ipmod;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public String getPcmod() {
        return pcmod;
    }

    public void setPcmod(String pcmod) {
        this.pcmod = pcmod;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNickMod() {
        return nickMod;
    }

    public void setNickMod(String nickMod) {
        this.nickMod = nickMod;
    }

    public String getObservacionmod() {
        return observacionmod;
    }

    public void setObservacionmod(String observacionmod) {
        this.observacionmod = observacionmod;
    }

    public Boolean getEliminar() {
        return eliminar;
    }

    public void setEliminar(Boolean eliminar) {
        this.eliminar = eliminar;
    }

    public boolean esNuevo() {
        return this.id == null && this.nick == null && this.fecha == null;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AuditoriaBean other = (AuditoriaBean) obj;
        return Objects.equals(this.id, other.id);
    }

}
