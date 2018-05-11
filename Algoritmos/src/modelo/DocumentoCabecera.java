package modelo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;

@Entity
@Table(name = "documentocab")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class DocumentoCabecera extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtipodocum")
    private TipoDocumentoMov tipoDocumentoMov;

    @Column(name = "serie", nullable = false)
    private String serie;

    @Column(name = "moneda", nullable = false, length = 1)
    private String moneda;

    @Column(name = "numero", nullable = false)
    private Long numero;

    @Column(name = "fechaemision", nullable = false)
    private Timestamp fechaEmision;

    @Column(name = "fechaing", nullable = true)
    private Timestamp fechaIngreso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpersona")
    private Persona persona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idalmacen")
    private Almacen almacen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idadmision")
    private Admision admision;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idoperacion")
    private Operacion operacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idusuario")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idmotivo")
    private Motivo motivo;

    @Column(name = "valorventa")
    private BigDecimal valorVenta;

    @Column(name = "valorexonerado", nullable = false)
    private BigDecimal valorExonerado;

    @Column(name = "valordscto", nullable = false)
    private BigDecimal valorDescuento;

    @Column(name = "valorigv", nullable = false)
    private BigDecimal valorIgv;

    @Column(name = "valortotal", nullable = false)
    private BigDecimal valorTotal;

    @Column(name = "valorinafecto")
    private BigDecimal valorInafecto;

    @Column(name = "preciototal", nullable = false)
    private BigDecimal precioTotal;

    @Column(name = "porcdscto", nullable = false)
    private BigDecimal porcentajeDescuento;

    @Column(name = "tipocambio", nullable = false)
    private BigDecimal tipoCambio;

    @Column(name = "tipoitem", nullable = false)
    private String tipoItem;

    @Column(name = "tiposervicio", nullable = false)
    private String tipoServicio;

    @Column(name = "tipopersona")
    private String tipoPersona;

    @Column(name = "anulado", nullable = false)
    private Boolean anulado;

    @Column(name = "incluyeigv")
    private Boolean incluyeIGV;

    @Column(name = "porcentigv")
    private BigDecimal porcentajeIGV;

    @Column(name = "observacion")
    private String observacion;

    @Column(name = "motivosunat")
    private String motivoSunat;

    @Column(name = "proveedor")
    private String proveedor;

    @JsonIgnoreProperties("documentoCabecera")
    @OneToMany(mappedBy = "documentoCabecera", fetch = FetchType.LAZY)
    private List<DocumServicioDet> documentosServicioDet;

    @JsonIgnoreProperties("documentoCabecera")
    @OneToMany(mappedBy = "documentoCabecera", fetch = FetchType.LAZY)
    private List<DocumExamenesDet> documentosExamenesDet;

    @JsonIgnoreProperties("documentoCabecera")
    @OneToMany(mappedBy = "documentoCabecera", fetch = FetchType.LAZY)
    private List<DocumProductoDet> documentosProductoDet;

    @JsonIgnoreProperties("documentoCabecera")
    @OneToMany(mappedBy = "documentoCabecera", fetch = FetchType.LAZY)
    private List<PagoEfectivo> pagosEfectivo;

    @JsonIgnoreProperties("documentoCabecera")
    @OneToMany(mappedBy = "documentoCabecera", fetch = FetchType.LAZY)
    private List<PagoTarjeta> pagosTarjeta;

    @JsonIgnoreProperties("documentoCabecera")
    @OneToMany(mappedBy = "documentoCabecera", fetch = FetchType.LAZY)
    private List<PagoContraGarantia> pagosContraGarantia;

    //COMPROBANTE
    //SI EL DOCUMENTO ES UN COMPROBANTE, ESTO DEBERIA ESTAR VACIO
    @JsonIgnoreProperties("documentoCabecera")
    @OneToMany(mappedBy = "documentoCabecera", fetch = FetchType.LAZY)
    private List<DocumentoCabeceraRef> documentoCabeceraRefs;

    //HOJAS DE CONSUMO
    //SI EL DOCUMENTO NO ES UN COMPROBANTE, ESTO DEBERIA ESTAR VACIO
    @JsonIgnoreProperties("documentoCabeceraReferencia")
    @OneToMany(mappedBy = "documentoCabeceraReferencia", fetch = FetchType.LAZY)
    private List<DocumentoCabeceraRef> documentoCabeceraReferencias;

    @JsonIgnoreProperties("documentoCabecera")
    @OneToMany(mappedBy = "documentoCabecera", fetch = FetchType.LAZY)
    private List<PreFacturaAseguradora> preFacturasAseguradora;

    @JsonIgnoreProperties("documentoCabecera")
    @OneToMany(mappedBy = "documentoCabecera", fetch = FetchType.LAZY)
    private List<DocumTransferencia> documTransferencias;

    @JsonIgnoreProperties("documentoCabecera")
    @OneToMany(mappedBy = "documentoCabecera", fetch = FetchType.LAZY)
    private List<LoteFactura> lotesFactura;

    @JsonIgnoreProperties("documentoCabecera")
    @OneToMany(mappedBy = "documentoCabecera", fetch = FetchType.LAZY)
    private List<DocumentoMedico> documentosMedicos;

    @JsonIgnoreProperties("documentoCabecera")
    @OneToMany(mappedBy = "documentoCabecera", fetch = FetchType.LAZY)
    private List<DocumentoSunat> documentosSunat;

    @Transient
    private List<InforMedicoExamen> examenes;

    @Transient
    private List<InforMedicoTopico> topicos;

    @Transient
    private Long idRelacionado;

    @Transient
    private String medico;

    public DocumentoCabecera() {
        valorInafecto = BigDecimal.ZERO;
    }

    public TipoDocumentoMov getTipoDocumentoMov() {
        return tipoDocumentoMov;
    }

    public void setTipoDocumentoMov(TipoDocumentoMov tipoDocumentoMov) {
        this.tipoDocumentoMov = tipoDocumentoMov;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Timestamp getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Timestamp fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public BigDecimal getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(BigDecimal valorVenta) {
        this.valorVenta = valorVenta;
    }

    public BigDecimal getValorExonerado() {
        return valorExonerado;
    }

    public void setValorExonerado(BigDecimal valorExonerado) {
        this.valorExonerado = valorExonerado;
    }

    public BigDecimal getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(BigDecimal valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public BigDecimal getValorIgv() {
        return valorIgv;
    }

    public void setValorIgv(BigDecimal valorIgv) {
        this.valorIgv = valorIgv;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public Boolean getAnulado() {
        return anulado;
    }

    public void setAnulado(Boolean anulado) {
        this.anulado = anulado;
    }

    public List<DocumServicioDet> getDocumentosServicioDet() {
        return documentosServicioDet;
    }

    public void setDocumentosServicioDet(List<DocumServicioDet> documentosServicioDet) {
        this.documentosServicioDet = documentosServicioDet;
    }

    public List<DocumProductoDet> getDocumentosProductoDet() {
        return documentosProductoDet;
    }

    public void setDocumentosProductoDet(List<DocumProductoDet> documentosProductoDet) {
        this.documentosProductoDet = documentosProductoDet;
    }

    public List<PagoEfectivo> getPagosEfectivo() {
        return pagosEfectivo;
    }

    public void setPagosEfectivo(List<PagoEfectivo> pagosEfectivo) {
        this.pagosEfectivo = pagosEfectivo;
    }

    public List<PagoTarjeta> getPagosTarjeta() {
        return pagosTarjeta;
    }

    public void setPagosTarjeta(List<PagoTarjeta> pagosTarjeta) {
        this.pagosTarjeta = pagosTarjeta;
    }

    public List<DocumentoCabeceraRef> getDocumentoCabeceraRefs() {
        return documentoCabeceraRefs;
    }

    public void setDocumentoCabeceraRefs(List<DocumentoCabeceraRef> documentoCabeceraRefs) {
        this.documentoCabeceraRefs = documentoCabeceraRefs;
    }

    public List<DocumentoCabeceraRef> getDocumentoCabeceraReferencias() {
        return documentoCabeceraReferencias;
    }

    public void setDocumentoCabeceraReferencias(List<DocumentoCabeceraRef> documentoCabeceraReferencias) {
        this.documentoCabeceraReferencias = documentoCabeceraReferencias;
    }

    public List<PreFacturaAseguradora> getPreFacturasAseguradora() {
        return preFacturasAseguradora;
    }

    public void setPreFacturasAseguradora(List<PreFacturaAseguradora> preFacturasAseguradora) {
        this.preFacturasAseguradora = preFacturasAseguradora;
    }

    public List<DocumExamenesDet> getDocumentosExamenesDet() {
        return documentosExamenesDet;
    }

    public void setDocumentosExamenesDet(
            List<DocumExamenesDet> documentosExamenesDet) {
        this.documentosExamenesDet = documentosExamenesDet;
    }

    public Operacion getOperacion() {
        return operacion;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    public BigDecimal getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(BigDecimal porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public BigDecimal getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(BigDecimal precioTotal) {
        this.precioTotal = precioTotal;
    }

    public List<InforMedicoExamen> getExamenes() {
        return examenes;
    }

    public void setExamenes(List<InforMedicoExamen> examenes) {
        this.examenes = examenes;
    }

    public List<DocumTransferencia> getDocumTransferencias() {
        return documTransferencias;
    }

    public void setDocumTransferencias(List<DocumTransferencia> documTransferencias) {
        this.documTransferencias = documTransferencias;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(BigDecimal tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public Motivo getMotivo() {
        return motivo;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }

    public List<InforMedicoTopico> getTopicos() {
        return topicos;
    }

    public void setTopicos(List<InforMedicoTopico> topicos) {
        this.topicos = topicos;
    }

    public BigDecimal getValorInafecto() {
        return valorInafecto;
    }

    public void setValorInafecto(BigDecimal valorInafecto) {
        this.valorInafecto = valorInafecto;
    }

    public Timestamp getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Timestamp fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public List<LoteFactura> getLotesFactura() {
        return lotesFactura;
    }

    public void setLotesFactura(List<LoteFactura> lotesFactura) {
        this.lotesFactura = lotesFactura;
    }

    public Long getIdRelacionado() {
        return idRelacionado;
    }

    public void setIdRelacionado(Long idRelacionado) {
        this.idRelacionado = idRelacionado;
    }

    public Boolean getIncluyeIGV() {
        return incluyeIGV;
    }

    public void setIncluyeIGV(Boolean incluyeIGV) {
        this.incluyeIGV = incluyeIGV;
    }

    public BigDecimal getPorcentajeIGV() {
        return porcentajeIGV;
    }

    public void setPorcentajeIGV(BigDecimal porcentajeIGV) {
        this.porcentajeIGV = porcentajeIGV;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getMotivoSunat() {
        return motivoSunat;
    }

    public void setMotivoSunat(String motivoSunat) {
        this.motivoSunat = motivoSunat;
    }

    public List<DocumentoMedico> getDocumentosMedicos() {
        return documentosMedicos;
    }

    public void setDocumentosMedicos(List<DocumentoMedico> documentosMedicos) {
        this.documentosMedicos = documentosMedicos;
    }

    public List<DocumentoSunat> getDocumentosSunat() {
        return documentosSunat;
    }

    public void setDocumentosSunat(List<DocumentoSunat> documentosSunat) {
        this.documentosSunat = documentosSunat;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public List<PagoContraGarantia> getPagosContraGarantia() {
        return pagosContraGarantia;
    }

    public void setPagosContraGarantia(List<PagoContraGarantia> pagosContraGarantia) {
        this.pagosContraGarantia = pagosContraGarantia;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

}
