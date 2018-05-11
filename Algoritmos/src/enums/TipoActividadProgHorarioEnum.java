package enums;

public enum TipoActividadProgHorarioEnum {

    CONSULTA_AMBULATORIA("C"),
    EMERGENCIA(""),
    TOPICO(""),
    HOSPITALIZACION("");
    
    private String value;

    private TipoActividadProgHorarioEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
