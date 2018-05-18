
import dto.CitaDTO;
import enums.EstadoCitaEnum;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import modelo.Cita;
import modelo.Medico;
import modelo.Persona;
import modelo.ProgramaHorario;
import util.Constantes;
import util.RespuestaControlador;
import util.SistemaClinicoUtil;

public class CitaServicio {

    private final SimpleDateFormat format;

    public CitaServicio() {
        format = new SimpleDateFormat("hh.mm a");
    }

    public RespuestaControlador obtenerCitasDeDia(Long medicoId, Long personaId, Long dia) {
        List<CitaDTO> lista;
        List<ProgramaHorario> listaTurnos;
        CitaDTO obj;
        List<Cita> listaCitas;
        Long inicio, fin, inicioDia, tiempoAtencioMedico, aux, auxHora, correcion;
        Medico medico;
        List<Integer> indices;
        Cita cita;

        Date iniDate, finDate;
        String horarioDeTurno, turnoNombre;
        RespuestaControlador respuestaControlador;
        Timestamp inicioDiaTimestamp;
        int turnoNum;

        //entidades auxiliares
        respuestaControlador = new RespuestaControlador();
        lista = new ArrayList<>();

        //obtenemos el medico consultado
        medico = obtenerMedico(medicoId);
        if (medico.getTiempoAtencion() != null) {
            tiempoAtencioMedico = medico.getTiempoAtencion() * 60L * 1000L;//tiempo en milis

            //obtenemos los turnos del dia
            listaTurnos = obtenerTurnosDeDia(medicoId, dia, medico.getTiempoAtencion());
            inicioDiaTimestamp = SistemaClinicoUtil.obtenerInicioDia(new Timestamp(dia));
            inicioDia = inicioDiaTimestamp.getTime();
            turnoNum = 1;
            for (ProgramaHorario programaHorario : listaTurnos) {
                //traemos todas las citas en este turno
                inicio = SistemaClinicoUtil.addTimeToTimestamp(inicioDiaTimestamp, programaHorario.getHoraIni()).getTime();
                correcion = (inicioDia + programaHorario.getHoraIni().getTime()) - inicio;
                fin = SistemaClinicoUtil.addTimeToTimestamp(inicioDiaTimestamp, programaHorario.getHorafin()).getTime();
                listaCitas = obtenerCitasEnHorario(medicoId, personaId, inicio, fin, Boolean.FALSE, medico.getTiempoAtencion());
                //partimos cada turno en horarios para las citas
                //fusionamos citas con horarios
                aux = inicio;
                turnoNombre = "";
                while ((aux + tiempoAtencioMedico) <= fin) {
                    auxHora = aux - inicioDia + correcion;
                    iniDate = new Date(auxHora);
                    finDate = new Date(auxHora + tiempoAtencioMedico);
                    horarioDeTurno = "De " + format.format(iniDate) + " a " + format.format(finDate);

                    cita = null;

                    indices = buscarCitaEnListPorHoraInicio(auxHora - correcion, listaCitas);
                    if (!SistemaClinicoUtil.listaEstaVacia(indices)) {
                        for (Integer indice : indices) {
                            obj = new CitaDTO();
                            if (indice >= 0) {
                                //si hay una cita reservada, poner la cita
                                cita = listaCitas.get(indice);
                                obj.setId(cita.getId());
                                obj.setPersona(cita.getPersona().getNombreCompleto());
                                obj.setSeparado(Boolean.TRUE);
                                obj.setEstado(obtenerEstadoCita(cita));
                                obj.setMedico(cita.getMedico().getNombreCompleto());
                                obj.setMedicoId(cita.getMedico().getId());
                            }
                            obj.setHora(horarioDeTurno);
                            obj.setHoraInicio(new Timestamp(aux));
                            if (turnoNombre.isEmpty()) {
                                turnoNombre = SistemaClinicoUtil.obtenerNumeroOrdinal(turnoNum) + " turno";
                                obj.setTurno(turnoNombre);
                            }
                            lista.add(obj);
                        }
                    } else {
                        obj = new CitaDTO();
                        obj.setHora(horarioDeTurno);
                        obj.setHoraInicio(new Timestamp(aux));
                        if (turnoNombre.isEmpty()) {
                            turnoNombre = SistemaClinicoUtil.obtenerNumeroOrdinal(turnoNum) + " turno";
                            obj.setTurno(turnoNombre);
                        }
                        lista.add(obj);
                    }
                    if (cita != null && cita.getEstadoCita().equals(EstadoCitaEnum.CANCELADA.getCodigo())) {//si la cita estuvo cancelada
                        obj = new CitaDTO();
                        obj.setHora(horarioDeTurno);
                        obj.setHoraInicio(new Timestamp(aux));
                        lista.add(obj);
                    }
                    aux = aux + tiempoAtencioMedico;
                }
                turnoNum++;
            }
            respuestaControlador.setEstado(Constantes.RESPUESTA_CONTROLADOR.ESTADO_EXITO);
            respuestaControlador.setMensaje("");
        } else {
            respuestaControlador.setEstado(Constantes.RESPUESTA_CONTROLADOR.ESTADO_ERROR);
            respuestaControlador.setMensaje("Aun no se ha definido el tiempo de atencion del medico");
        }

        respuestaControlador.setExtraInfo(lista);

//        return lista;
        return respuestaControlador;
    }

    public String obtenerEstadoCita(String estadoCita) {
        String t;
        t = "";
        if (estadoCita.equals(EstadoCitaEnum.SEPARADA.getCodigo())) {
            t = EstadoCitaEnum.SEPARADA.getValor();
        } else if (estadoCita.equals(EstadoCitaEnum.CANCELADA.getCodigo())) {
            t = EstadoCitaEnum.CANCELADA.getValor();
        } else if (estadoCita.equals(EstadoCitaEnum.CONFIRMADA.getCodigo())) {
            t = EstadoCitaEnum.CONFIRMADA.getValor();
        } else if (estadoCita.equals(EstadoCitaEnum.EN_ATENCION.getCodigo())) {
            t = EstadoCitaEnum.EN_ATENCION.getValor();
        } else if (estadoCita.equals(EstadoCitaEnum.ATENDIDO.getCodigo())) {
            t = EstadoCitaEnum.ATENDIDO.getValor();
        }
        return t;
    }

    public List<Cita> obtenerCitasEnHorario(Long medicoId, Long personaId, Long desde, Long hasta, Boolean incluirPersona, Integer tiempoAtencion) {
        int maximoCitas = SistemaClinicoUtil.obtenerBigDecimal(5.00).intValue();
        List<Cita> lista;
        Long milisTiempoAtencion;
        Cita cita;
        int i = 0;
        lista = new ArrayList<>();
        milisTiempoAtencion = tiempoAtencion * 60 * 1000L;
        maximoCitas = Math.min(maximoCitas, (int) ((hasta - desde) / milisTiempoAtencion));
        while (i < maximoCitas) {
            Medico medico = new Medico();
            medico.setId(medicoId);
            medico.setNombreCompleto("MEDICO" + (i + 1));

            Persona persona = new Persona();
            persona.setId(personaId);
            persona.setNombreCompleto("PERSONA " + (i + 1));

            cita = new Cita();
            cita.setId(SistemaClinicoUtil.obtenerBigDecimal(50000.00).longValue());
            cita.setEstadoCita(obtenerEstadoCitaNew());
            cita.setFechaCita(new Timestamp(desde + (milisTiempoAtencion * i)));
            cita.setMedico(medico);
            cita.setOrigen("P");
            cita.setPersona(persona);
            lista.add(cita);

            i++;
        }
        return lista;
    }

    public String obtenerEstadoCitaNew() {
        Double val = Math.random();
        double inc = 0.20;
        double max = 0;
        max = max + inc;
        if (val < max) {
            return EstadoCitaEnum.ATENDIDO.getValor();
        }
        max = max + inc;
        if (val < max) {
            return EstadoCitaEnum.CANCELADA.getValor();
        }
        max = max + inc;
        if (val < max) {
            return EstadoCitaEnum.CONFIRMADA.getValor();
        }
        max = max + inc;
        if (val < max) {
            return EstadoCitaEnum.EN_ATENCION.getValor();
        }
        return EstadoCitaEnum.SEPARADA.getValor();
    }

    public Medico obtenerMedico(Long medicoId) {
        Medico medico = new Medico();
        medico.setId(medicoId);
        medico.setTiempoAtencion(SistemaClinicoUtil.obtenerBigDecimal(20.00).intValue());
        return medico;
    }

    public List<ProgramaHorario> obtenerTurnosDeDia(Long medicoId, Long dia, Integer tiempoAtencion) {
        int cantidadMaxima = SistemaClinicoUtil.obtenerBigDecimal(5.00).intValue();
        List<ProgramaHorario> lista;
        Long milisTiempoAtencion, horaInicio;
        ProgramaHorario programa;
        int i = 0;
        lista = new ArrayList<>();
        milisTiempoAtencion = tiempoAtencion * 60 * 1000L;
        horaInicio = 0L;
        do {
            Medico medico = new Medico();
            medico.setId(medicoId);
            medico.setNombreCompleto("MEDICO" + (i + 1));

            programa = new ProgramaHorario();
            programa.setActividad("C");
            programa.setAnio(i);
            programa.setFecProg(new Date(dia));
            programa.setHoraIni(new Time(horaInicio));
            horaInicio = horaInicio + (milisTiempoAtencion * SistemaClinicoUtil.obtenerBigDecimal(5.00).longValue());
            programa.setHorafin(new Time(horaInicio));
            programa.setMedico(medico);
            lista.add(programa);

            i++;
        } while (i < cantidadMaxima);
        return lista;
    }

    private List<Integer> buscarCitaEnListPorHoraInicio(Long aux, List<Cita> listaCitas) {
        List<Integer> lista;
        Long hora;
        Timestamp dia;
        Cita cita;
        lista = new ArrayList<>();
        for (int i = 0; i < listaCitas.size(); i++) {
            cita = listaCitas.get(i);
            dia = SistemaClinicoUtil.obtenerInicioDia(cita.getFechaCita());
            hora = cita.getFechaCita().getTime() - dia.getTime();
            if (Objects.equals(hora, aux)) {
                lista.add(i);
            }
        }
        return lista;
    }

    private String obtenerEstadoCita(Cita cita) {
        String t;
        t = "";
        if (cita != null) {
            t = obtenerEstadoCita(cita.getEstadoCita());
        }
        return t;
    }

}
