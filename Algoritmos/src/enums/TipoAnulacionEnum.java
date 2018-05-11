package enums;

public enum TipoAnulacionEnum {
	
	ANULACION_NORMAL('N'),
	ANULACION_ADMIN('A');

	private Character value;

	private TipoAnulacionEnum(Character value) {
		this.value = value;
	}

	public Character getValue() {
		return value;
	}

	public void setValue(Character value) {
		this.value = value;
	}
}
