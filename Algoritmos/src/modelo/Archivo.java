package modelo;

import java.io.File;
import util.AuditoriaBean;
import util.SistemaClinicoUtil;

/**
 * The persistent class for the archivo database table.
 *
 */
public class Archivo extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private String ruta;

    public Archivo() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        String extension = SistemaClinicoUtil.obtenerExtensionDeNombreDeArchivo(this.getNombre());
        return this.ruta + File.separator + this.getId() + extension;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

}
