package enums;

public enum TipoHoraAtencionEnum {

    INICIO("I"),
    FIN("F");

    private final String value;

    private TipoHoraAtencionEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}