package chekin.events;

import chekin.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class InformacionVueloAsignado extends DomainEvent {

    private final InformacionVueloId informacionVueloId;
    private final Vuelo vuelo;
    private final Hora hora;
    private final Destino destino;
    private final Estado estado;
    private final Puerta puerta;

    public InformacionVueloAsignado(InformacionVueloId informacionVueloId, Vuelo vuelo, Hora hora, Destino destino, Estado estado, Puerta puerta) {
        super("sofka.checkin.informacionvueloasignado");
        this.informacionVueloId = informacionVueloId;
        this.vuelo = vuelo;
        this.hora = hora;
        this.destino = destino;
        this.estado = estado;
        this.puerta = puerta;
    }

    public InformacionVueloId getInformacionVueloId() {
        return informacionVueloId;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Hora getHora() {
        return hora;
    }

    public Destino getDestino() {
        return destino;
    }

    public Estado getEstado() {
        return estado;
    }

    public Puerta getPuerta() {
        return puerta;
    }
}
