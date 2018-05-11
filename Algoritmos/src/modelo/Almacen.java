package modelo;

import java.util.List;
import util.AuditoriaBean;

public class Almacen extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String abreviatura;

    private String nombre;

    private List<UsuarioAlmacen> almacenesUsuario;

    private List<DocumTransferencia> documTransferenciasOrigen;

    private List<DocumTransferencia> documTransferenciasDestino;

    public Almacen() {
    }

    public String getAbreviatura() {
        return this.abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<DocumTransferencia> getDocumTransferenciasOrigen() {
        return documTransferenciasOrigen;
    }

    public void setDocumTransferenciasOrigen(List<DocumTransferencia> documTransferenciasOrigen) {
        this.documTransferenciasOrigen = documTransferenciasOrigen;
    }

    public List<DocumTransferencia> getDocumTransferenciasDestino() {
        return documTransferenciasDestino;
    }

    public void setDocumTransferenciasDestino(List<DocumTransferencia> documTransferenciasDestino) {
        this.documTransferenciasDestino = documTransferenciasDestino;
    }

    public List<UsuarioAlmacen> getAlmacenesUsuario() {
        return almacenesUsuario;
    }

    public void setAlmacenesUsuario(List<UsuarioAlmacen> almacenesUsuario) {
        this.almacenesUsuario = almacenesUsuario;
    }

}
