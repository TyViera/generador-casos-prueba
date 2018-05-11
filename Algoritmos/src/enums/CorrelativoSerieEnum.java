package enums;

public enum CorrelativoSerieEnum {
	
	DEFAULT("0001");
	
	private String valor;

	private CorrelativoSerieEnum(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
