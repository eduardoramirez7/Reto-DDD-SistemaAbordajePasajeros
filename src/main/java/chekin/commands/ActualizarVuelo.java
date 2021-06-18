package chekin.commands;

import chekin.values.CheckInId;
import chekin.values.InformacionVueloId;
import chekin.values.Vuelo;
import co.com.sofka.domain.generic.Command;

public class ActualizarVuelo implements Command {

    private final CheckInId checkInId;
    private final InformacionVueloId informacionVueloId;
    private final Vuelo vuelo;

    public ActualizarVuelo(CheckInId checkInId, InformacionVueloId informacionVueloId, Vuelo vuelo) {
        this.checkInId = checkInId;
        this.informacionVueloId = informacionVueloId;
        this.vuelo = vuelo;
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
}
