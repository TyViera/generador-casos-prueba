package enums;

public enum MonedaEnum {

	SOLES("S"),
	DOLARES("D"),
	EUROS("E");

	private String valor;

	private MonedaEnum(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
