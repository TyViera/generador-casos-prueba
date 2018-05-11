package enums;

public enum TipoOperacionEnum {
	
	ENTRADA("E"),
    SALIDA("S");
    private final String value;

    private TipoOperacionEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
