package enums;

import java.math.BigDecimal;

public enum TipoCambioEmun {
	
	SOLES(BigDecimal.ONE);

	private BigDecimal value;

	private TipoCambioEmun(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
}
