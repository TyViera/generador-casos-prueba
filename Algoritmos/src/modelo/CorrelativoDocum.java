package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;

@Entity
@Table(name = "correlativodocum")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class CorrelativoDocum extends AuditoriaBean {

	private static final long serialVersionUID = 1L;

	@Column(name = "serie")
	private String serie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idtipodocumovim")
	private TipoDocumentoMov tipoDocumentoMov;

	@Column(name = "numero")
	private Long numero;

	public CorrelativoDocum() {
	}

	public Long getNumero() {
		return this.numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Long siguienteNumero() {
		this.numero = this.numero + 1;
		return this.numero;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public TipoDocumentoMov getTipoDocumentoMov() {
		return tipoDocumentoMov;
	}

	public void setTipoDocumentoMov(TipoDocumentoMov tipoDocumentoMov) {
		this.tipoDocumentoMov = tipoDocumentoMov;
	}

}