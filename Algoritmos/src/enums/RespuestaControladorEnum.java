package enums;

public enum RespuestaControladorEnum {

	ESTADO_ERROR("error"),
	ESTADO_EXITO("exito");
	
	private String value;
	
	private RespuestaControladorEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
