package enums;


public enum ProgramaHorarioEnum {
	
	PARAMETRO_PROGRAMA_NUEVO("programaNuevo"),
	PARAMETRO_PROGRAMA_ELIMINADO("programaEliminado");
	
	private String value;

	private ProgramaHorarioEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
