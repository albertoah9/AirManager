import java.time.LocalDate;
import java.time.LocalDateTime;


public class Vuelo {
    public enum EstadoVuelo {
        ESPERANDO_PISTA, ESPERANDO_ATERRIZAJE, EN_PREPARACION, APARCADO, EN_HANGAR, EMBARCANDO, ESPERADNO_DESPEGUE, DESPEGADO, RETRASADO, EN_HORA
    }

    public enum TipoVuelo {
        SALIDA, LLEGADA
    }

    public enum ClaseVuelo {
        MERCANCIAS, PASAJEROS
    }

    private int id;
    private LocalDate fechaSalida;
    private LocalDateTime horaSalida;
    private LocalDate fechaLLegada;
    private LocalDateTime horaLlegada;
    private Terminal terminal;
    private Avion avion;
    private Pista pista;
    private PuertaEmbarque puertaEmbarque;
    private EstadoVuelo estado;
    private Aeropuerto aeropuerto;
    private TipoVuelo tipoVuelo;
    private ClaseVuelo claseVuelo;
    private Aerolinea aerolinea;

    public Vuelo(int id, LocalDate fechaSalida, LocalDateTime horaSalida, LocalDate fechaLLegada, LocalDateTime horaLlegada, Terminal terminal, Avion avion, Pista pista, PuertaEmbarque puertaEmbarque, EstadoVuelo estado, Aeropuerto aeropuerto, TipoVuelo tipoVuelo, ClaseVuelo claseVuelo, Aerolinea aerolinea) {
        this.id = id;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.fechaLLegada = fechaLLegada;
        this.horaLlegada = horaLlegada;
        this.terminal = terminal;
        this.avion = avion;
        this.pista = pista;
        this.puertaEmbarque = puertaEmbarque;
        this.estado = estado;
        this.aeropuerto = aeropuerto;
        this.tipoVuelo = tipoVuelo;
        this.claseVuelo = claseVuelo;
        this.aerolinea = aerolinea;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }
    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalDate getFechaLLegada() {
        return fechaLLegada;
    }
    public void setFechaLLegada(LocalDate fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
    }

    public LocalDateTime getHoraLlegada() {
        return horaLlegada;
    }
    public void setHoraLlegada(LocalDateTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Terminal getTerminal() {
        return terminal;
    }
    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    public Avion getAvion() {
        return avion;
    }
    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pista getPista() {
        return pista;
    }
    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public PuertaEmbarque getPuertaEmbarque() {
        return puertaEmbarque;
    }

    public void setPuertaEmbarque(PuertaEmbarque puertaEmbarque) {
        this.puertaEmbarque = puertaEmbarque;
    }

    public EstadoVuelo getEstado() {
        return estado;
    }
    public void setEstado(EstadoVuelo estado) {
        this.estado = estado;
    }

    public Aeropuerto getAeropuerto() {
        return aeropuerto;
    }
    public void setAeropuerto(Aeropuerto aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public TipoVuelo getTipoVuelo() {
        return tipoVuelo;
    }
    public void setTipoVuelo(TipoVuelo tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public ClaseVuelo getClaseVuelo() {
        return claseVuelo;
    }
    public void setClaseVuelo(ClaseVuelo claseVuelo) {
        this.claseVuelo = claseVuelo;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }
    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

}


