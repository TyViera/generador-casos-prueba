package enums;

public enum DatosEmpresarialesEnum {
	RUC("20483432951"), 
	CODIGO_IPRESS("091068C"),
	CODIGO_IAFAS("13605");

	private final String value;

	private DatosEmpresarialesEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}