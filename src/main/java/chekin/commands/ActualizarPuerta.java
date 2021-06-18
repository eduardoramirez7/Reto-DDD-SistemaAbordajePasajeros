package chekin.commands;

import chekin.values.CheckInId;
import chekin.values.InformacionVueloId;
import chekin.values.Puerta;
import co.com.sofka.domain.generic.Command;

public class ActualizarPuerta implements Command {

    private final CheckInId checkInId;
    private final InformacionVueloId informacionVueloId;
    private final Puerta puerta;

    public ActualizarPuerta(CheckInId checkInId, InformacionVueloId informacionVueloId, Puerta puerta) {
        this.checkInId = checkInId;
        this.informacionVueloId = informacionVueloId;
        this.puerta = puerta;
    }

    public CheckInId getCheckInId() {
        return checkInId;
    }

    public InformacionVueloId getInformacionVueloId() {
        return informacionVueloId;
    }

    public Puerta getPuerta() {
        return puerta;
    }
}
