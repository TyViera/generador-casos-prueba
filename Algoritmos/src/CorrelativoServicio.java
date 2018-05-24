
import modelo.Correlativo;
import util.SistemaClinicoUtil;

public class CorrelativoServicio {

    public Integer siguienteNroCorrelativo(String nombre, String anio) {
        Integer numero = null;
        String anioAnterior;
//        try {
        Correlativo correlativo;
        correlativo = obtenerPorNombreYAnio(nombre, anio);
        if (correlativo == null) {
            //BUSCAR EL DEL AÑO PASADO
            anioAnterior = String.valueOf(Integer.valueOf(anio) - 1);
            correlativo = obtenerPorNombreYAnio(nombre, anioAnterior);
        }
        if (correlativo == null) {
            correlativo = new Correlativo();
            correlativo.setNombre(nombre);
            correlativo.setAnio(anio);
            correlativo.setNumero(0);
        }
        numero = correlativo.siguienteNumero();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return numero;
    }

    public Correlativo obtenerPorNombreYAnio(String nombre, String anio) {
        Correlativo correlativo;
        double d = Math.random();
        correlativo = null;
        if (d < 0.5) {
            correlativo = new Correlativo();
            correlativo.setAnio(anio);
            correlativo.setNombre(nombre);
            correlativo.setNumero(SistemaClinicoUtil.obtenerBigDecimal(10000000.00).intValue());
        }
        return correlativo;
    }

}
