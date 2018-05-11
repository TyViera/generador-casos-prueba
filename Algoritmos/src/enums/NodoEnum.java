package enums;

public enum NodoEnum {
	
	TIPO_NODO_PERMISO('P'),
	TIPO_NODO_MENU('M'),
	TIPO_NODO_BARRA('B');
	
	private Character valor;

	private NodoEnum(Character valor) {
		this.valor = valor;
	}

	public Character getValor() {
		return valor;
	}

	public void setValor(Character valor) {
		this.valor = valor;
	}

}
