/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author nazav
 */
public class ProductoServicio {

    public ProductoVentaDTO obtenerProductoParaVenta(Long productoId, Long personaId, Long inforMedicoTratamientoId, Long almacenId,
            Boolean atenderComoParticular, BigDecimal cantidadDeVenta, Boolean admisionGratuita, Long idActualizacion, Long polizaId, Long admisionId) throws SistemaClinicoException {
        ProductoVentaDTO resultado;
        DocumProductoDet productoDet;
        Producto producto;
        Criterio filtro;
        Boolean aux, afectoIgv, descuentoYaCalculado, igvExonerado;
        InforMedicoTratamiento imt;
        Long aseguradoraId;
        ProductoPrecioEspecial precioEspecial;
        PromocionDetalle pd;
        BigDecimal stockProducto, descuento, igv, oneAddIgv, auxBigD;
        Long idServicio, hoy, manana, auxTime;
        Parametro parametro;
        String mensajeErrorProducto, tipoPersona;

        try {
            resultado = new ProductoVentaDTO();

            descuentoYaCalculado = Boolean.FALSE;

            resultado.setTipoNoCubierto(productoNoCubiertoServicio.obtenerTipo(productoId, polizaId));

            if (almacenId != null && almacenId >= 0) {
                stockProducto = inventarioTotalServicio.obtenerStockDeProducto(productoId, almacenId);
            } else {
                stockProducto = inventarioTotalServicio.obtenerStockDeProducto(productoId);
            }
            resultado.setStock(stockProducto);

            productoDet = new DocumProductoDet();
            productoDet.setId(idActualizacion);
            producto = productoRepositorio.obtenerInclusoEliminado(productoId);
            if (producto.getPresentacion() != null) {
                producto.getPresentacion().getId();
            }
            productoDet.setProducto(producto);
            productoDet.setCostoPromedio(producto.getCostoPromedio());
            afectoIgv = producto.getAfectoIgv();
            igvExonerado = Boolean.FALSE;
            if (producto.getFechaFinExoneracion() != null) {
                auxTime = producto.getFechaFinExoneracion().getTime();
                hoy = SistemaClinicoUtil.obtenerFechaActual().getTime();
                manana = SistemaClinicoUtil.agregarDias(SistemaClinicoUtil.obtenerFechaActual(), 1).getTime();
                igvExonerado = (hoy <= auxTime && auxTime < manana);
            }

            productoDet.setIdInformedicoTratamiento(inforMedicoTratamientoId);
            imt = inforMedicoTratamientoRepositorio.obtener(inforMedicoTratamientoId);
            resultado.setIdDeInformeMedicoTratamiento(inforMedicoTratamientoId);
            if (imt != null && cantidadDeVenta.compareTo(BigDecimal.ZERO) <= 0) {
                productoDet.setCantidad(imt.getCantidad());
            } else {
                productoDet.setCantidad(cantidadDeVenta);
            }

            parametro = parametroServicio.obtenerParametroPorNombre(ParametroEnum.ID_SERVICIO_FARMACIA.getValue());
            idServicio = Long.valueOf(parametro.getValor().trim());
            igv = parametroServicio.obtenerValorDeIGV();
            igv = igv.divide(Constantes.CIEN, Constantes.NUMERO_DECIMALES_MONEDA, RoundingMode.HALF_UP);
            oneAddIgv = igv.add(BigDecimal.ONE);

            tipoPersona = null;
            if (SistemaClinicoUtil.numeroEsValidoParaBusquedas(admisionId)) {
                tipoPersona = admisionServicio.obtenerTipoDeAdmision(admisionId);
            }
            if (!SistemaClinicoUtil.esCadenaValida(tipoPersona)) {
                tipoPersona = "";
            }
//            aux = !atenderComoParticular && personaServicio.esAsegurado(personaId);
            aux = !atenderComoParticular && TipoSeguroEnum.ASEGURADO.getValue().equals(tipoPersona);

            if (aux) {
                //SI ES ASEGURADA HAY QUE VER SI HAY DESCUENTO ESPECIAL PARA EL PRODUCTO
                aseguradoraId = null;
                if (imt != null && imt.getInformedico().getAdmisionMedico().getAdmision().getPoliza() != null) {
                    aseguradoraId = imt.getInformedico().getAdmisionMedico().getAdmision().getPoliza().getAseguradora().getId();
                } else if (polizaId != null) {
                    filtro = Criterio.forClass(Poliza.class);
                    filtro.add(Restrictions.eq("estado", Boolean.TRUE));
                    filtro.add(Restrictions.eq("id", polizaId));
                    aseguradoraId = (Long) productoRepositorio.obtenerPorProyeccion(filtro, Property.forName("aseguradora.id"));
                }
                if (SistemaClinicoUtil.numeroEsValidoParaBusquedas(aseguradoraId)) {
                    precioEspecial = productoPrecioEspecialServicio.obtenerProductoPrecioEspecialParaVenta(productoId, aseguradoraId);

                    filtro = Criterio.forClass(Aseguradora.class);
                    filtro.add(Restrictions.eq("estado", Boolean.TRUE));
                    filtro.add(Restrictions.eq("id", aseguradoraId));
                    descuento = (BigDecimal) productoRepositorio.obtenerPorProyeccion(filtro, Property.forName("dsctoFarmacia"));

                } else if (idActualizacion != null && idActualizacion > 0) {
                    filtro = Criterio.forClass(DocumProductoDet.class);
                    filtro.add(Restrictions.eq("estado", Boolean.TRUE));
                    filtro.add(Restrictions.eq("id", idActualizacion));
                    descuentoYaCalculado = Boolean.TRUE;
                    descuento = (BigDecimal) productoRepositorio.obtenerPorProyeccion(filtro, Property.forName("valorDscto"));
                    precioEspecial = null;
                } else {
                    precioEspecial = null;
                    descuento = BigDecimal.ZERO;
                }

                if (precioEspecial != null) {
                    //HAY PRECIO ESPECIAL
                    productoDet.setCostoUnitario(precioEspecial.getPrecio());
                    mensajeErrorProducto = "Hay un precio especial que no tiene precio";
                } else {
                    //SINO EL PRECIO KAIROS
                    productoDet.setCostoUnitario(producto.getPrecioKairos());
                    mensajeErrorProducto = "El producto: " + producto.getNombre() + " no tiene precio kairos";
                }
                if (productoDet.getCostoUnitario() == null || SistemaClinicoUtil.compararBigDecimal(productoDet.getCostoUnitario(), BigDecimal.ZERO)) {
                    throw new SistemaClinicoException(mensajeErrorProducto);
                }
            } else {
                productoDet.setCostoUnitario(producto.getPrecioVenta());
                aux = personaServicio.tieneTarjetaDescuento(personaId);
                if (aux) {
                    filtro = Criterio.forClass(PromocionDetalle.class);
                    filtro.add(Restrictions.eq("estado", Boolean.TRUE));
                    filtro.add(Restrictions.eq("servicio.id", idServicio));
                    filtro.addOrder(Order.desc("porcentaje"));
                    pd = promocionDetalleRepositorio.obtenerPorCriteria(filtro);
                    if (pd != null) {
                        descuento = pd.getPorcentaje();
                    } else {
                        // NO HABIA UN DESCUENTO
                        descuento = BigDecimal.ZERO;
                    }
                } else {
                    descuento = BigDecimal.ZERO;
                }
            }
            if (!descuentoYaCalculado) {
                descuento = descuento.divide(Constantes.CIEN, Constantes.NUMERO_DECIMALES_MONEDA, RoundingMode.HALF_UP);
                auxBigD = productoDet.getCostoUnitario().multiply(descuento);
            } else {
                auxBigD = descuento;
            }

            auxBigD = SistemaClinicoUtil.redondearBigDecimal(auxBigD, Constantes.NUMERO_DECIMALES_MONEDA);
            productoDet.setValorDscto(auxBigD);

            auxBigD = productoDet.getCostoUnitario();
            auxBigD = auxBigD.subtract(productoDet.getValorDscto());
            auxBigD = SistemaClinicoUtil.redondearBigDecimal(auxBigD, Constantes.NUMERO_DECIMALES_MONEDA);
            productoDet.setValortotal(auxBigD);
            if (igvExonerado || !afectoIgv) {
                productoDet.setValorVenta(BigDecimal.ZERO);
                productoDet.setValorIgv(BigDecimal.ZERO);
//                productoDet.setValorExonerado(BigDecimal.ZERO);
                productoDet.setValorInfecto(BigDecimal.ZERO);
//                if (igvExonerado) {
                productoDet.setValorExonerado(productoDet.getValortotal());
//                }
//                if (!afectoIgv) {
//                productoDet.setValorInfecto(productoDet.getValortotal());
//                }
            } else {
//                if (afectoIgv) {
                productoDet.setValorExonerado(BigDecimal.ZERO);
                auxBigD = productoDet.getValortotal().divide(oneAddIgv, Constantes.NUMERO_DECIMALES_MONEDA, RoundingMode.HALF_UP);
                auxBigD = SistemaClinicoUtil.redondearBigDecimal(auxBigD, Constantes.NUMERO_DECIMALES_MONEDA);
                productoDet.setValorVenta(auxBigD);
//                } else {
//                auxBigD = productoDet.getValortotal();
//                auxBigD = SistemaClinicoUtil.redondearBigDecimal(auxBigD, Constantes.NUMERO_DECIMALES_MONEDA);
//                productoDet.setValorExonerado(auxBigD);
//                productoDet.setValorVenta(BigDecimal.ZERO);
//                }
                auxBigD = productoDet.getValortotal().subtract(productoDet.getValorVenta());
                productoDet.setValorIgv(SistemaClinicoUtil.redondearBigDecimal(auxBigD, Constantes.NUMERO_DECIMALES_MONEDA));
            }

            resultado.setProductoDet(productoDet);
        } catch (NumberFormatException | NullPointerException ex) {
            resultado = null;
            ex.printStackTrace();
        }
        return resultado;
    }

}
