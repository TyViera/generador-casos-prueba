
import enums.NombreEntidadEnum;
import enums.TipoPersonaVentaEnum;
import enums.TipoServicioVentaEnum;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import modelo.Admision;
import modelo.Almacen;
import modelo.DocumExamenesDet;
import modelo.DocumProductoDet;
import modelo.DocumServicioDet;
import modelo.DocumentoCabecera;
import modelo.PagoContraGarantia;
import modelo.PagoEfectivo;
import modelo.PagoTarjeta;
import modelo.PreFacturaAseguradora;
import modelo.Producto;
import util.Constantes;
import util.DocumentoNoCreadoException;
import util.RespuestaControlador;
import util.SistemaClinicoException;
import util.SistemaClinicoUtil;

public class DocumentoCabeceraServicio {

    public RespuestaControlador liquidacionEmergencia(Boolean liquidado, BigDecimal porcentajeIgv, Long admisionId) {
        return liquidacionEmergencia(liquidado, porcentajeIgv, obtenerLista(admisionId));
    }

    public PreFacturaAseguradora obtenerPrefactura(Long admisionId, Long id0) {
        PreFacturaAseguradora preFacturaAseguradora;
        preFacturaAseguradora = new PreFacturaAseguradora();
        preFacturaAseguradora.setBruto(SistemaClinicoUtil.obtenerBigDecimal(1000.00));
        preFacturaAseguradora.setCoaseguro(SistemaClinicoUtil.obtenerBigDecimal(100.00));
        preFacturaAseguradora.setDeducible(SistemaClinicoUtil.obtenerBigDecimal(100.00));
        preFacturaAseguradora.setDescuento(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        preFacturaAseguradora.setNeto(
                preFacturaAseguradora.getBruto()
                        .subtract(preFacturaAseguradora.getCoaseguro())
                        .subtract(preFacturaAseguradora.getDeducible())
                        .subtract(preFacturaAseguradora.getDescuento())
        );
        return preFacturaAseguradora;
    }

    public void liquidarAdmisionEmergencia(Long id, Boolean TRUE) {
    }

    public List<DocumentoCabecera> obtenerLista(Long admisionId) {
        List<DocumentoCabecera> lista;
        DocumentoCabecera cab;
        int cantidadMaximaCab, iCab;

        iCab = 0;
        cantidadMaximaCab = SistemaClinicoUtil.obtenerBigDecimal(10.00).intValue();
        lista = new ArrayList<>();
        do {
            Admision admision = new Admision();
            admision.setId(admisionId);

            cab = new DocumentoCabecera();
            cab.setAdmision(admision);
            crearDetalleDocCab(cab, admisionId);
            lista.add(cab);

            iCab++;
        } while (iCab < cantidadMaximaCab);
        return lista;
    }

    public DocumExamenesDet obtenerDocumExamenesDet(Long id) {
        DocumExamenesDet det;
        det = new DocumExamenesDet();
        det.setCantidad(SistemaClinicoUtil.obtenerBigDecimal(10.00));
        det.setPiezasTratadas(SistemaClinicoUtil.obtenerBigDecimal(10.00).intValue());
        det.setPrecioUnitario(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        det.setPrecioUnitarioOperacion(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        det.setValorDescuento(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        det.setValorDescuentoOperacion(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        det.setValorIGV(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        det.setValorIGVOperacion(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        det.setValorTotal(SistemaClinicoUtil.obtenerBigDecimal(3000.00));
        det.setValorTotalOperacion(SistemaClinicoUtil.obtenerBigDecimal(3000.00));
        det.setValorVenta(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        det.setValorVentaOperacion(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        return det;
    }

    public DocumProductoDet obtenerDocumProductoDet(Long id) {
        DocumProductoDet det;
        det = new DocumProductoDet();
        det.setCantidad(SistemaClinicoUtil.obtenerBigDecimal(10.00));
        det.setCantDevuelta(SistemaClinicoUtil.obtenerBigDecimal(10.00));
        det.setCostoPromedio(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        det.setCostoUnitario(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        det.setValorDscto(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        det.setValorExonerado(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        det.setValorIgv(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        det.setValorInfecto(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        det.setValorVenta(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        det.setValortotal(SistemaClinicoUtil.obtenerBigDecimal(3000.00));
        return det;
    }

    public DocumServicioDet obtenerDocumServicioDet(Long id) {
        DocumServicioDet det;
        det = new DocumServicioDet();
        det.setValorCoaseguro(SistemaClinicoUtil.obtenerBigDecimal(100.00));
        det.setValorCoaseguroOperacion(SistemaClinicoUtil.obtenerBigDecimal(100.00));
        det.setValorDeducible(SistemaClinicoUtil.obtenerBigDecimal(100.00));
        det.setValorDeducibleOperacion(SistemaClinicoUtil.obtenerBigDecimal(100.00));
        det.setValorDescuento(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        det.setValorDescuentoOperacion(SistemaClinicoUtil.obtenerBigDecimal(300.00));
        det.setValorTotal(SistemaClinicoUtil.obtenerBigDecimal(1000.00));
        det.setValorTotalOperacion(SistemaClinicoUtil.obtenerBigDecimal(1000.00));
        det.setValorNeto(
                det.getValorTotal()
                        .subtract(det.getValorCoaseguro())
                        .subtract(det.getValorDeducible())
                        .subtract(det.getValorDescuento())
        );
        det.setValorNetoOperacion(
                det.getValorTotalOperacion()
                        .subtract(det.getValorCoaseguroOperacion())
                        .subtract(det.getValorDeducibleOperacion())
                        .subtract(det.getValorDescuentoOperacion())
        );
        return det;
    }

    public void comprobarTotalesDeDocumento(Long admisionId, Boolean esOdontologia, Boolean esAsegurado, BigDecimal coaseguro, Boolean compararProductos, Boolean compararServicios, Boolean compararExamenes, Boolean compararPagos, Boolean saltarCalculoCoaseguro) throws SistemaClinicoException {
        DocumentoCabecera cabecera;
        cabecera = new DocumentoCabecera();
        cabecera.setSerie("");
        cabecera.setNumero(SistemaClinicoUtil.obtenerBigDecimal(10000.00).longValue());
        cabecera.setTipoServicio(obtenerTipoServicio());
        cabecera.setValorTotal(SistemaClinicoUtil.obtenerBigDecimal(10000.00));
        crearDetalleDocCab(cabecera, admisionId);
        crearDetallePagosDocCab(cabecera);
        comprobarTotalesDeDocumento(cabecera, esOdontologia, esAsegurado, coaseguro, compararProductos, compararServicios, compararExamenes, compararPagos, saltarCalculoCoaseguro);
    }

    private void comprobarTotalesDeDocumento(DocumentoCabecera documentoCabecera, Boolean esOdontologia, Boolean esAsegurado, BigDecimal coaseguro, Boolean compararProductos, Boolean compararServicios, Boolean compararExamenes, Boolean compararPagos, Boolean saltarCalculoCoaseguro) throws SistemaClinicoException {
        BigDecimal totalPagos, totalCabecera, totalDetalle, aux;
        String dNombre;

        dNombre = "";
        if (SistemaClinicoUtil.esCadenaValida(documentoCabecera.getSerie()) && SistemaClinicoUtil.numeroEsValidoParaBusquedas(documentoCabecera.getNumero())) {
            dNombre = documentoCabecera.getSerie() + "-" + documentoCabecera.getNumero();
        }

        if (!saltarCalculoCoaseguro && esAsegurado) {
            totalCabecera = SistemaClinicoUtil.redondearBigDecimal(coaseguro, Constantes.NUMERO_DECIMALES_MONEDA);
        } else {
            totalCabecera = documentoCabecera.getValorTotal();
        }
        totalPagos = BigDecimal.ZERO;
        if (!SistemaClinicoUtil.listaEstaVacia(documentoCabecera.getPagosEfectivo())) {
            for (PagoEfectivo pagoEfectivo : documentoCabecera.getPagosEfectivo()) {
                if (SistemaClinicoUtil.esNoNuloYVerdadero(pagoEfectivo.getEstado()) || !SistemaClinicoUtil.esNoNuloYVerdadero(pagoEfectivo.getEliminar())) {
                    //si no esta eliminado
                    totalPagos = totalPagos.add(pagoEfectivo.getImporte());
                }
            }
        }
        if (!SistemaClinicoUtil.listaEstaVacia(documentoCabecera.getPagosContraGarantia())) {
            for (PagoContraGarantia pagoContraGarantia : documentoCabecera.getPagosContraGarantia()) {
                if (SistemaClinicoUtil.esNoNuloYVerdadero(pagoContraGarantia.getEstado()) || !SistemaClinicoUtil.esNoNuloYVerdadero(pagoContraGarantia.getEliminar())) {
                    //si no esta eliminado
                    totalPagos = totalPagos.add(pagoContraGarantia.getImporte());
                }
            }
        }
        if (!SistemaClinicoUtil.listaEstaVacia(documentoCabecera.getPagosTarjeta())) {
            for (PagoTarjeta pagoTarjeta : documentoCabecera.getPagosTarjeta()) {
                if (SistemaClinicoUtil.esNoNuloYVerdadero(pagoTarjeta.getEstado()) || !SistemaClinicoUtil.esNoNuloYVerdadero(pagoTarjeta.getEliminar())) {
                    //si no esta eliminado
                    totalPagos = totalPagos.add(pagoTarjeta.getImporte());
                }
            }
        }
        if (compararPagos && !SistemaClinicoUtil.compararBigDecimal(totalPagos, totalCabecera)) {
            throw new SistemaClinicoException("El total del documento (" + totalCabecera + ")" + dNombre + " no coincide con los pagos registrados (" + totalPagos + ").");
        }

        totalCabecera = documentoCabecera.getValorTotal();
        if (compararServicios && !saltarCalculoCoaseguro && esAsegurado) {
            coaseguro = documentoCabecera.getValorTotal().multiply(coaseguro);
            totalCabecera = SistemaClinicoUtil.redondearBigDecimal(coaseguro, Constantes.NUMERO_DECIMALES_MONEDA);
        }
        totalDetalle = BigDecimal.ZERO;
        if (compararProductos && !SistemaClinicoUtil.listaEstaVacia(documentoCabecera.getDocumentosProductoDet())) {
            for (DocumProductoDet productoDetalle : documentoCabecera.getDocumentosProductoDet()) {
                if (SistemaClinicoUtil.esNoNuloYVerdadero(productoDetalle.getEstado()) || !SistemaClinicoUtil.esNoNuloYVerdadero(productoDetalle.getEliminar())) {
                    aux = productoDetalle.getValortotal().multiply(productoDetalle.getCantidad());
                    aux = SistemaClinicoUtil.redondearBigDecimal(aux, Constantes.NUMERO_DECIMALES_MONEDA);
                    totalDetalle = totalDetalle.add(aux);
                }
            }
        }
        if (compararServicios && !SistemaClinicoUtil.listaEstaVacia(documentoCabecera.getDocumentosServicioDet())) {
//            esEmergencia = admisionServicio.esAdmisionEmergencia(admision);
            for (DocumServicioDet servicioDetalle : documentoCabecera.getDocumentosServicioDet()) {
                if (SistemaClinicoUtil.esNoNuloYVerdadero(servicioDetalle.getEstado()) || !SistemaClinicoUtil.esNoNuloYVerdadero(servicioDetalle.getEliminar())) {
                    if (documentoCabecera.getTipoServicio().equals(TipoServicioVentaEnum.DEDUCIBLE.getValue()) && esOdontologia) {
                        aux = servicioDetalle.getValorDeducible().add(servicioDetalle.getValorCoaseguro());
                    } else if (documentoCabecera.getTipoServicio().equals(TipoServicioVentaEnum.DEDUCIBLE.getValue())) {
                        aux = servicioDetalle.getValorDeducible();
                    } else if (documentoCabecera.getTipoServicio().equals(TipoServicioVentaEnum.COASEGURO.getValue())) {
                        aux = servicioDetalle.getValorCoaseguro();
                    } else if (documentoCabecera.getTipoPersona().equals(TipoPersonaVentaEnum.CONVENIO.getValue())) {
                        aux = servicioDetalle.getValorNeto();
                    } else if (documentoCabecera.getTipoServicio().equals(TipoServicioVentaEnum.NORMAL.getValue())) {
                        aux = servicioDetalle.getValorTotal();
                    } else {
                        aux = BigDecimal.ZERO;
                    }
                    totalDetalle = totalDetalle.add(aux);
                }
            }
        }
        if (compararExamenes && !SistemaClinicoUtil.listaEstaVacia(documentoCabecera.getDocumentosExamenesDet())) {
            for (DocumExamenesDet examenDetalle : documentoCabecera.getDocumentosExamenesDet()) {
                if (SistemaClinicoUtil.esNoNuloYVerdadero(examenDetalle.getEstado()) || !SistemaClinicoUtil.esNoNuloYVerdadero(examenDetalle.getEliminar())) {
                    aux = examenDetalle.getValorTotal().multiply(examenDetalle.getCantidad());
                    aux = SistemaClinicoUtil.redondearBigDecimal(aux, Constantes.NUMERO_DECIMALES_MONEDA);
                    totalDetalle = totalDetalle.add(aux);
                }
            }
        }
        if (!SistemaClinicoUtil.compararBigDecimal(totalDetalle, totalCabecera)) {
            throw new SistemaClinicoException("El total del documento (" + totalCabecera + ")" + dNombre + " no coincide con los totales del detalle (" + totalDetalle + ").");
        }
    }

    private RespuestaControlador liquidacionEmergencia(Boolean liquidado, BigDecimal porcentajeIgv, List<DocumentoCabecera> listaConsumos) {
        RespuestaControlador respuesta;
        try {
//            Boolean liquidado;
            BigDecimal igv, oneAddIgv, aux;
            Admision admision;

            if (SistemaClinicoUtil.listaEstaVacia(listaConsumos)) {
                throw new DocumentoNoCreadoException("Debe seleccionar por lo menos un servicio.");
            }
            admision = listaConsumos.get(0).getAdmision();
            if (admision == null) {
                throw new DocumentoNoCreadoException("Debe seleccionar una admisión.");
            }

//            liquidado = admisionEstaLiquidadaEmergencia(admision.getId());
            if (liquidado) {
                throw new DocumentoNoCreadoException("La admisión ya ha sido liquidada anteriormente.");
            }

//            porcentajeIgv = obtenerValorDeIGV();
            if (porcentajeIgv != null) {
                igv = porcentajeIgv.divide(Constantes.CIEN);
                oneAddIgv = BigDecimal.ONE.add(igv);
            } else {
                throw new DocumentoNoCreadoException("No se encontró el igv");
            }

            //comenzar proceso
            for (DocumentoCabecera hojaConsumo : listaConsumos) {
                //1.- productos---- devolver stocks
                devolverStocksProductos(hojaConsumo);
                //2.- para servicios, examenes y productos quitar filas marcadas para eliminar 
                quitarDetallesAEliminar(hojaConsumo);
                //3.- recalcular montos de hojas de consumo/servicio o eliminar hojas de consumo/servicio con monto 0
                recalcularMontosConsumo(hojaConsumo, oneAddIgv);
                //4.- recalcular prefacturas en base a hojas de consumo/servicio
                recalcularPrefactura(admision, hojaConsumo);
            }
            //5.- marcar admision como liquidada
            liquidarAdmisionEmergencia(admision.getId(), Boolean.TRUE);
            respuesta = RespuestaControlador.obtenerRespuestaDeExito(NombreEntidadEnum.LIQUIDACION_HOSPITALIZACION.getValue());
        } catch (DocumentoNoCreadoException dnee) {
            respuesta = RespuestaControlador.obtenerRespuestaDeError(dnee.getMessage());
        } catch (Exception e) {
            respuesta = RespuestaControlador.obtenerRespuestaDeError("ERROR");
        }
        return respuesta;
    }

    private void recalcularPrefactura(Admision admision, DocumentoCabecera hojaConsumo) {
        BigDecimal aux;
        PreFacturaAseguradora prefactura = obtenerPrefactura(admision.getId(), hojaConsumo.getId());
        if (prefactura != null) {
            if (hojaConsumo.getEliminar()) {
                prefactura.setEstado(Boolean.FALSE);
            } else {
                BigDecimal sumaCoaseguro, sumaDeducible, sumaBruto, sumaDescuentos, porcentajeCoaseguro;
                sumaDeducible = BigDecimal.ZERO;
                sumaBruto = BigDecimal.ZERO;
                sumaDescuentos = BigDecimal.ZERO;
                for (DocumExamenesDet examenDetalle : hojaConsumo.getDocumentosExamenesDet()) {
                    DocumExamenesDet detalleEnBase;
                    if (examenDetalle.getEliminar()) {
                        detalleEnBase = obtenerDocumExamenesDet(examenDetalle.getId());
                        sumaBruto = sumaBruto.add(detalleEnBase.getValorTotal().multiply(examenDetalle.getCantidad()));
                        sumaDescuentos = sumaDescuentos.add(detalleEnBase.getValorDescuento().multiply(examenDetalle.getCantidad()));
                    }
                }
                for (DocumProductoDet productoDetalle : hojaConsumo.getDocumentosProductoDet()) {
                    DocumProductoDet detalleEnBase;
                    if (productoDetalle.getEliminar()) {
                        detalleEnBase = obtenerDocumProductoDet(productoDetalle.getId());
                        sumaBruto = sumaBruto.add(detalleEnBase.getValortotal().multiply(productoDetalle.getCantidad()));
                        sumaDescuentos = sumaDescuentos.add(detalleEnBase.getValorDscto().multiply(productoDetalle.getCantidad()));
                    }
                }
                //hasta aqui calcular coaseguro
                porcentajeCoaseguro = admision.getCoAseguro().divide(Constantes.CIEN, Constantes.NUMERO_DECIMALES_MONEDA, RoundingMode.HALF_UP);
                sumaCoaseguro = sumaBruto.multiply(porcentajeCoaseguro);

                for (DocumServicioDet servicioDetalle : hojaConsumo.getDocumentosServicioDet()) {
                    DocumServicioDet detalleEnBase;
                    if (servicioDetalle.getEliminar()) {
                        detalleEnBase = obtenerDocumServicioDet(servicioDetalle.getId());
                        sumaBruto = sumaBruto.add(detalleEnBase.getValorTotal());
                        sumaDeducible = sumaDeducible.add(detalleEnBase.getValorDeducible());
                        sumaCoaseguro = sumaCoaseguro.add(detalleEnBase.getValorCoaseguro());
                        sumaDescuentos = sumaDescuentos.add(detalleEnBase.getValorDescuento());
                    }
                }

                //recalcular montos
                aux = prefactura.getBruto().subtract(sumaBruto);
                prefactura.setBruto(aux);

                aux = prefactura.getDeducible().subtract(sumaDeducible);
                prefactura.setDeducible(aux);

                aux = prefactura.getCoaseguro().subtract(sumaCoaseguro);
                prefactura.setCoaseguro(aux);

                aux = prefactura.getDescuento().subtract(sumaDescuentos);
                prefactura.setDescuento(aux);

                aux = prefactura.getBruto();
                aux = aux.subtract(prefactura.getDeducible());
                aux = aux.subtract(prefactura.getCoaseguro());
                aux = aux.subtract(prefactura.getDescuento());
                prefactura.setNeto(aux);
            }
        }
    }

    private void recalcularMontosConsumo(DocumentoCabecera hojaConsumo, BigDecimal oneAddIgv) {
        BigDecimal aux;
        BigDecimal sumaValorTotal, sumaValorInafecto, sumaValorExonerado, sumaValorDescuentos;
        Integer n, numeroDetalles;
        sumaValorTotal = BigDecimal.ZERO;
        sumaValorInafecto = BigDecimal.ZERO;
        sumaValorExonerado = BigDecimal.ZERO;
        sumaValorDescuentos = BigDecimal.ZERO;
        n = 0;
        numeroDetalles = hojaConsumo.getDocumentosExamenesDet().size();
        numeroDetalles = numeroDetalles + hojaConsumo.getDocumentosProductoDet().size();
        numeroDetalles = numeroDetalles + hojaConsumo.getDocumentosServicioDet().size();
        for (DocumExamenesDet examenDetalle : hojaConsumo.getDocumentosExamenesDet()) {
            if (examenDetalle.getEliminar()) {
                sumaValorTotal = sumaValorTotal.add(examenDetalle.getValorTotal().multiply(examenDetalle.getCantidad()));
                sumaValorDescuentos = sumaValorDescuentos.add(examenDetalle.getValorDescuento().multiply(examenDetalle.getCantidad()));
                n++;
            }
        }
        for (DocumProductoDet productoDetalle : hojaConsumo.getDocumentosProductoDet()) {
            if (productoDetalle.getEliminar()) {
                sumaValorTotal = sumaValorTotal.add(productoDetalle.getValortotal().multiply(productoDetalle.getCantidad()));
                if (productoDetalle.getValorInfecto() != null) {
                    sumaValorInafecto = sumaValorInafecto.add(productoDetalle.getValorInfecto().multiply(productoDetalle.getCantidad()));
                }
                if (productoDetalle.getValorExonerado() != null) {
                    sumaValorExonerado = sumaValorExonerado.add(productoDetalle.getValorExonerado().multiply(productoDetalle.getCantidad()));
                }
                sumaValorDescuentos = sumaValorDescuentos.add(productoDetalle.getValorDscto().multiply(productoDetalle.getCantidad()));
                n++;
            }
        }
        for (DocumServicioDet servicioDetalle : hojaConsumo.getDocumentosServicioDet()) {
            if (servicioDetalle.getEliminar()) {
                sumaValorTotal = sumaValorTotal.add(servicioDetalle.getValorTotal());
                n++;
            }
        }
        if (Objects.equals(n, numeroDetalles)) {
            //eliminar hoja
            hojaConsumo.setEstado(Boolean.FALSE);
        } else {
            aux = hojaConsumo.getValorTotal().subtract(sumaValorTotal);
            hojaConsumo.setValorTotal(aux);

            aux = aux.divide(oneAddIgv, Constantes.NUMERO_DECIMALES_MONEDA, RoundingMode.HALF_UP);
            hojaConsumo.setValorVenta(aux);

            aux = hojaConsumo.getValorTotal().subtract(aux);
            hojaConsumo.setValorIgv(aux);

            aux = hojaConsumo.getValorExonerado().subtract(sumaValorExonerado);
            hojaConsumo.setValorExonerado(aux);

            aux = hojaConsumo.getValorInafecto().subtract(sumaValorInafecto);
            hojaConsumo.setValorInafecto(aux);

            aux = hojaConsumo.getValorDescuento().subtract(sumaValorDescuentos);
            hojaConsumo.setValorDescuento(aux);
        }
    }

    private void quitarDetallesAEliminar(DocumentoCabecera hojaConsumo) {
        for (DocumProductoDet detalleProducto : hojaConsumo.getDocumentosProductoDet()) {
            String hql = "UPDATE DocumProductoDet SET estado=:estado, cantidad=:cantidad WHERE id=:id";
            detalleProducto.setEstado(!detalleProducto.getEliminar());
            detalleProducto.setCantidad(detalleProducto.getCantidad().subtract(detalleProducto.getCantDevuelta()));

        }
        for (DocumExamenesDet detalleExamen : hojaConsumo.getDocumentosExamenesDet()) {
            if (detalleExamen.getEliminar()) {
                String hql = "UPDATE DocumExamenesDet SET estado=:estado WHERE id=:id";
                detalleExamen.setEstado(Boolean.FALSE);
            }
        }
        for (DocumServicioDet servicioDetalle : hojaConsumo.getDocumentosServicioDet()) {
            if (servicioDetalle.getEliminar()) {
                String hql = "UPDATE DocumServicioDet SET estado=:estado WHERE id=:id";
                servicioDetalle.setEstado(Boolean.FALSE);
            }
        }

    }

    private void devolverStocksProductos(DocumentoCabecera hojaConsumo) {
        hojaConsumo.getDocumentosProductoDet().forEach((detalleProducto) -> {
            BigDecimal cantidadDevolver;
            cantidadDevolver = detalleProducto.getCantDevuelta();
            if (cantidadDevolver.compareTo(BigDecimal.ZERO) > 0) {
                meterProductoDeInventario(detalleProducto.getProducto(), hojaConsumo.getAlmacen(), cantidadDevolver);
                meterProductoDeInventario(detalleProducto.getProducto(), hojaConsumo.getAlmacen(), cantidadDevolver);
            }
        });
    }

    private void meterProductoDeInventario(Producto producto, Almacen almacen, BigDecimal cantidadDevolver) {
    }

    private void crearDetalleDocCab(DocumentoCabecera cab, Long admisionId) {
        List<DocumProductoDet> listaProductos;
        List<DocumExamenesDet> listaExamenes;
        List<DocumServicioDet> listaServicios;
        int cantidadMaximaDetPro, cantidadMaximaDetTar, cantidadMaximaDetSer;
        int iPro, iTar, iSer;

        iPro = iTar = iSer = 0;

        cantidadMaximaDetPro = SistemaClinicoUtil.obtenerBigDecimal(20.00).intValue();
        listaProductos = new ArrayList<>();
        do {
            listaProductos.add(obtenerDocumProductoDet(admisionId));
            iPro++;
        } while (iPro < cantidadMaximaDetPro);
        cab.setDocumentosProductoDet(listaProductos);

        cantidadMaximaDetTar = SistemaClinicoUtil.obtenerBigDecimal(20.00).intValue();
        listaExamenes = new ArrayList<>();
        do {
            listaExamenes.add(obtenerDocumExamenesDet(admisionId));
            iTar++;
        } while (iTar < cantidadMaximaDetTar);
        cab.setDocumentosExamenesDet(listaExamenes);

        cantidadMaximaDetSer = SistemaClinicoUtil.obtenerBigDecimal(20.00).intValue();
        listaServicios = new ArrayList<>();
        do {
            listaServicios.add(obtenerDocumServicioDet(admisionId));
            iSer++;
        } while (iSer < cantidadMaximaDetSer);
        cab.setDocumentosServicioDet(listaServicios);
    }

    private void crearDetallePagosDocCab(DocumentoCabecera cab) {
        List<PagoEfectivo> listaPagosEfectivo;
        List<PagoTarjeta> listaTarjetas;
        List<PagoContraGarantia> listaGarantias;
        PagoEfectivo pef;
        PagoTarjeta ptj;
        PagoContraGarantia pcg;
        int cantidadMaximaPEF, cantidadMaximaPTJ, cantidadMaximaPCG;
        int iPro, iTar, iSer;

        iPro = iTar = iSer = 0;

        cantidadMaximaPEF = SistemaClinicoUtil.obtenerBigDecimal(20.00).intValue();
        listaPagosEfectivo = new ArrayList<>();
        do {
            pef = new PagoEfectivo();
            pef.setImporte(SistemaClinicoUtil.obtenerBigDecimal(2000.00));
            listaPagosEfectivo.add(pef);
            iPro++;
        } while (iPro < cantidadMaximaPEF);
        cab.setPagosEfectivo(listaPagosEfectivo);

        cantidadMaximaPTJ = SistemaClinicoUtil.obtenerBigDecimal(20.00).intValue();
        listaTarjetas = new ArrayList<>();
        do {
            ptj = new PagoTarjeta();
            ptj.setImporte(SistemaClinicoUtil.obtenerBigDecimal(2000.00));
            listaTarjetas.add(ptj);
            iTar++;
        } while (iTar < cantidadMaximaPTJ);
        cab.setPagosTarjeta(listaTarjetas);

        cantidadMaximaPCG = SistemaClinicoUtil.obtenerBigDecimal(20.00).intValue();
        listaGarantias = new ArrayList<>();
        do {
            pcg = new PagoContraGarantia();
            pcg.setImporte(SistemaClinicoUtil.obtenerBigDecimal(2000.00));
            listaGarantias.add(pcg);
            iSer++;
        } while (iSer < cantidadMaximaPCG);
        cab.setPagosContraGarantia(listaGarantias);
    }

    private String obtenerTipoServicio() {
        double val = Math.random();
        double inc = 0.30;
        double max = 0;
        max = max + inc;
        if (val < max) {
            return TipoServicioVentaEnum.COASEGURO.getValue();
        }
        max = max + inc;
        if (val < max) {
            return TipoServicioVentaEnum.DEDUCIBLE.getValue();
        }
        return TipoServicioVentaEnum.NORMAL.getValue();

    }

}
