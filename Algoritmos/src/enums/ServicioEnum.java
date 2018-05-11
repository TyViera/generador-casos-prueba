package enums;

public enum ServicioEnum {

    CONSULTA_AMBULATORIA( new Long(1) , "7041101"),
    EMERGENCIA(new Long(2) , "000000"),
    HOSPITALIZACION(new Long(3) , "000000"),
    LABORATORIO(new Long(4) , "7041102"),
    IMAGENEOLOGIA(new Long(5) , "000000"),
    TOPICO(new Long(6) ,"000000"),
    FAMACIA(new Long(8) , "000000"),
    PROCEDIMIENTO(new Long(9) , "000000");

    private final Long codigo;
    private final String cuenta;

    private ServicioEnum(Long codigo, String cuenta) {
        this.codigo = codigo;
        this.cuenta = cuenta;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getCuenta() {
        return cuenta;
    }

}
