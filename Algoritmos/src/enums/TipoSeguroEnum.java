package enums;

public enum TipoSeguroEnum {

    PARTICULAR("Particular"),
    ASEGURADO("Asegurado"),
    TARJETA_DCTO("Con tarjeta de descuento"),
    TARIFA_SOCIAL("Con tarifa social");

    private final String value;

    private TipoSeguroEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
