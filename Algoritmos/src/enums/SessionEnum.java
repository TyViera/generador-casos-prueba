package enums;

public enum SessionEnum {
	
	USUARIO("SESION_USUARIO"),
	IP("SESION_IP"),
	PC("SESION_PC");
	
	private String value;

	private SessionEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
