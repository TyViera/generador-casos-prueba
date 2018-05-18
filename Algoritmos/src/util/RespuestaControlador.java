package util;

public class RespuestaControlador implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String estado;

    private String mensaje;

    private Object extraInfo;

    public String getEstado() {
        return estado;
    }

    public RespuestaControlador(String estado, String mensaje) {
        this.estado = estado;
        this.mensaje = mensaje;
    }

    public RespuestaControlador(String estado, Object extraInfo) {
        this.estado = estado;
        this.extraInfo = extraInfo;
    }

    public static RespuestaControlador obtenerRespuestaDeError(String mensaje) {
        return new RespuestaControlador(Constantes.RESPUESTA_CONTROLADOR.ESTADO_ERROR, mensaje);
    }

    public static RespuestaControlador obtenerRespuestaDeExito(String mensaje) {
        return new RespuestaControlador(Constantes.RESPUESTA_CONTROLADOR.ESTADO_EXITO, mensaje);
    }

    public static Boolean esRespuestaDeError(RespuestaControlador respuestaControlador) {
        return respuestaControlador == null || respuestaControlador.getEstado().equals(Constantes.RESPUESTA_CONTROLADOR.ESTADO_ERROR);
    }

    public static Boolean esRespuestaDeExito(RespuestaControlador respuestaControlador) {
        return respuestaControlador != null && respuestaControlador.getEstado().equals(Constantes.RESPUESTA_CONTROLADOR.ESTADO_EXITO);
    }

    public static RespuestaControlador obtenerRespuestaExitoConExtraInfo(Object extraInfo) {
        return new RespuestaControlador(Constantes.RESPUESTA_CONTROLADOR.ESTADO_EXITO, extraInfo);
    }

    public RespuestaControlador() {
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Object getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(Object extraInfo) {
        this.extraInfo = extraInfo;
    }

}
