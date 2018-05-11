package enums;

public enum NombreReporteEnum {
	
	COMPROBANTE_BOLETA_FACTURA_ELECTRONICA("com_boleta_factura_elect"),
	COMPROBANTE_NOTA_CREDITO_DEBITO_ELECTRONICA("com_nota_credito_debito_elect"),
	COMPROBANTE_FACTURA_CONVENIO("factura_convenio");

	private String value;

	private NombreReporteEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
