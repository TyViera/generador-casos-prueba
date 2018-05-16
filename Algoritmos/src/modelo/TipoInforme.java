package modelo;

import java.util.List;
import util.AuditoriaBean;

public class TipoInforme extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private List<InforMedico> informedicos;

    private List<TituloInforme> tituloInformes;

    private String titulo;

    public TipoInforme() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<InforMedico> getInformedicos() {
        return this.informedicos;
    }

    public void setInformedicos(List<InforMedico> informedicos) {
        this.informedicos = informedicos;
    }

    public InforMedico addInformedico(InforMedico informedico) {
        getInformedicos().add(informedico);
        informedico.setTipoInforme(this);

        return informedico;
    }

    public InforMedico removeInformedico(InforMedico informedico) {
        getInformedicos().remove(informedico);
        informedico.setTipoInforme(null);

        return informedico;
    }

    public List<TituloInforme> getTituloInformes() {
        return this.tituloInformes;
    }

    public void setTituloInformes(List<TituloInforme> tituloInformes) {
        this.tituloInformes = tituloInformes;
    }

    public TituloInforme addTituloInforme(TituloInforme tituloInforme) {
        getTituloInformes().add(tituloInforme);
        tituloInforme.setTipoInforme(this);

        return tituloInforme;
    }

    public TituloInforme removeTituloInforme(TituloInforme tituloInforme) {
        getTituloInformes().remove(tituloInforme);
        tituloInforme.setTipoInforme(null);

        return tituloInforme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "TipoInforme [id=" + getId() + "nombre=" + nombre + ", titulo=" + titulo + "]";
    }

}
