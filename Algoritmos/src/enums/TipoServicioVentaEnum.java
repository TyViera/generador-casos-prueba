package enums;

public enum TipoServicioVentaEnum {

    CONVENIO("V", "01"),
    COASEGURO("C", "02"),
    PARTICULAR("P", "03"),
    FELIZ_CARD("F", "04"),
    NORMAL("N", "00"),
    DEDUCIBLE("D", "05");

    private final String value;
    private final String subCuenta;

    private TipoServicioVentaEnum(String value, String subCuenta) {
        this.value = value;
        this.subCuenta = subCuenta;
    }

    public String getValue() {
        return value;
    }

//    public String getCodigo() {
//        return codigo;
//    }
    public String getSubCuenta() {
        return subCuenta;
    }

}
