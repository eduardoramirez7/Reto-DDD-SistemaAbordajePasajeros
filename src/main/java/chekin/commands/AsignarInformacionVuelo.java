package chekin.commands;

import chekin.values.*;
import co.com.sofka.domain.generic.Command;

public class AsignarInformacionVuelo implements Command {

    private final CheckInId checkInId;
    private final InformacionVueloId informacionVueloId;
    private final Vuelo vuelo;
    private final Hora hora;
    private final Destino destino;
    private final Estado estado;
    private final Puerta puerta;

    public AsignarInformacionVuelo(CheckInId checkInId, InformacionVueloId informacionVueloId, Vuelo vuelo, Hora hora, Destino destino, Estado estado, Puerta puerta) {
        this.checkInId = checkInId;
        this.informacionVueloId = informacionVueloId;
        this.vuelo = vuelo;
        this.hora = hora;
        this.destino = destino;
        this.estado = estado;
        this.puerta = puerta;
    }

    public CheckInId getCheckInId() {
        return checkInId;
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
