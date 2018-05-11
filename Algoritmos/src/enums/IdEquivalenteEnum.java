package enums;

public enum IdEquivalenteEnum {
	
	OPERACION_VENTA_EFECTIVO(-1L),
	OPERACION_VENTA_CREDITO(-2L),
	TIPO_DOC_MOV_FACTURA(-1L),
	TIPO_DOC_MOV_BOLETA(-2L),
	SERVICIO_OTROS(-1L),
	TIPO_SEGURO_PARTICULAR(1L),
	TIPO_SEGURO_ASEGURADO(2L),
	TIPO_SEGURO_TODOS(3L);

	private Long idEquivalente;

	private IdEquivalenteEnum(Long idEqui) {
		this.idEquivalente= idEqui;
	}

	public Long getIdEquivalente() {
		return idEquivalente;
	}

	public void setIdEquivalente(Long idEquivalente) {
		this.idEquivalente = idEquivalente;
	}
}
