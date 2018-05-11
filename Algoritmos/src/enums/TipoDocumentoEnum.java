package enums;

public enum TipoDocumentoEnum {

    BOLETA("BOLETA","03"),
    FACTURA("FACTURA","01"),
    NOTA_CREDITO("NOTA_CREDITO","07"),
    NOTA_DEBITO("NOTA_DEBITO","08"),
    
//    FACTURA_CABECERA("FACTURA_CABECERA"),
//    FACTURA_DETALLE("FACTURA_DETALLE"),
//    BOLERA_DE_VENTA_CABECERA("BOLETA_DE_VENTA_CABECERA"),
//    BOLERA_DE_VENTA_DETALLE("BOLETA_DE_VENTA_DETALLE"),
//    NOTA_CREDITO_CABECERA("NOTA_CREDITO_CABECERA"),
//    NOTA_CREDITO_DETALLE("NOTA_CREDITO_DETALLE"),
//    NOTA_DEBITO_CABECERA("NOTA_DEBITO_CABECERA"),
//    NOTA_DEBITO_DETALLE("NOTA_DEBITO_DETALLE"),
    DOCUMENTO_ANULADO("DOCUMENTO_ANULADO",null);
    
    private final String value;
    private final String codigoSunat;

    private TipoDocumentoEnum(String value,String codigoSunat) {
        this.value = value;
        this.codigoSunat = codigoSunat;
    }

    public String getValue() {
        return value;
    }
    
    public String getCodigoSunat() {
        return codigoSunat;
    }

}
