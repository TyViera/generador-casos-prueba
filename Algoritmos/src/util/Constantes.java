/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.math.BigDecimal;

/**
 *
 * @author nazav
 */
public class Constantes {

    public static final Integer NUMERO_ENTEROS_SERIES_DOCUMENTOS = 4;
    public static final Integer NUMERO_ENTEROS_NUMEROS_DOCUMENTOS = 8;
    public static final Integer NUMERO_DECIMALES_MONEDA = 2;
    public static final String CONSULTA_AMBULATORIA = "CONSULTA AMBULATORIA";
//    public static final String CONSULTA_ODONTOLOGICA = "CONSULTA ODONTOLOGICA";
    public static final String CONTROL = "CONTROL";
    public static final String CORTESIA = "CORTESIA";
//    public static final String HOJA_CONSUMO = "HOJA DE CONSUMO";
//    public static final String HOJA_SERVICIO = "HOJA DE SERVICIO";
    public static final Long ID_TIPO_INFORME_HISTORIA_CLINICA = 2L;
    public static final String HOJA_DE_ATENCION_MEDICA_PEDIATRICA = "HOJA DE ATENCION MEDICA PEDIATRICA";
    public static final String MOTIVO_ANULACION = "ANULACION";
    public static final String MOTIVO_DEVOLUCIONES = "DEVOLUCIONES";
    public static final BigDecimal CIEN = SistemaClinicoUtil.redondearBigDecimal(new BigDecimal(100.00), NUMERO_DECIMALES_MONEDA);
    public static final BigDecimal MENOSUNO = SistemaClinicoUtil.redondearBigDecimal(new BigDecimal(-1.00), NUMERO_DECIMALES_MONEDA);
    public static final String CODIGO_MONEDA_SOL = "PEN";
    public static final String CODIGO_UNIDAD = "EA";

    public static final Integer MAX_NUM_INTENT_ESCR_ARCHIVO = 5;
    public static final Integer MAX_INTENTOS_TRAER_NUMERO_HISTORIA = 10;
    public static final String CODIGO_IGV_AFECTO = "10";
    public static final String CODIGO_IGV_EXONERADO = "20";
    public static final String CODIGO_IGV_INAFECTO = "30";

    public static final Character ESPACIO = ' ';
    public static final Character GUION = '-';
    public static final String EXTENSION_PDF = ".pdf";
    public static final String EXTENSION_ZIP = ".zip";
    public static final String EXTENSION_XML = ".xml";
    public static final String CARPETA_SEPARADOR = "/";
    public static final int BUFFER_SIZE = 1024;
//    public static final String TIPO_NOTA_CREDITO_ANULACION = "01";
//    public static final String TIPO_NOTA_CREDITO_DEVOLUCION = "06";

    public static abstract class RESPUESTA_CONTROLADOR {

        public final static String ESTADO_ERROR = "error";
        public final static String ESTADO_EXITO = "exito";
        public final static String MENSAJE_ERROR_AUTENTICACION = "credenciales incorrectas";
        public final static String MENSAJE_ERROR_AUTENTICACION_REQUERIDA = "Es necesario volver a iniciar sesión en el sistema.";
        public final static String MENSAJE_ERROR_VALIDAR_USUARIO = "Ocurrio un error al validar usuario";
        public final static String MENSAJE_EXITO_AUTENTICACION = "Usuario autenticado correctamente";
        public final static String MENSAJE_DUPLICADO = "Ya existe otro {0} con el mismo {1}";
        public final static String MENSAJE_CREAR_EXITO = "{0} creado exitosamente";
        public final static String MENSAJE_NO_ENCONTRE_ID = "Id de {0} no encontrado";
        public final static String MENSAJE_ACTUALIZAR_EXITO = "{0} actualizado exitosamente";
        public final static String MENSAJE_ELIMINAR_EXITO = "{0} eliminado exitosamente";
        public final static String MENSAJE_ELIMINAR_ERROR_HIJOS = "{0} tiene una o mas {1} asociados y no se puede eliminar";
    }

}
