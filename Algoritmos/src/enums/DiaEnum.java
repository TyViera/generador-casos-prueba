package enums;

public enum DiaEnum {

	LUNES("Lunes", 1),
	MARTES("Martes", 2),
	MIERCOLES("Miercoles", 3),
	JUEVES("Jueves", 4),
	VIERNES("Viernes", 5),
	SABADO("Sabado", 6),
	DOMINGO("Domingo", 7);

	private final String nombre;
	private final Integer valor;

	private DiaEnum(String nombre, Integer valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getValor() {
		return valor;
	}

}
