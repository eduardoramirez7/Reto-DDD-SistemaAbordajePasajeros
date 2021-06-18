package chekin.commands;

import chekin.values.CheckInId;
import chekin.values.Hora;
import chekin.values.InformacionVueloId;
import co.com.sofka.domain.generic.Command;

public class ActualizarHora implements Command {

    private final CheckInId checkInId;
    private final InformacionVueloId informacionVueloId;
    private final Hora hora;

    public ActualizarHora(CheckInId checkInId, InformacionVueloId informacionVueloId, Hora hora) {
        this.checkInId = checkInId;
        this.informacionVueloId = informacionVueloId;
        this.hora = hora;
    }

    public CheckInId getCheckInId() {
        return checkInId;
    }

    public InformacionVueloId getInformacionVueloId() {
        return informacionVueloId;
    }

    public Hora getHora() {
        return hora;
    }
}
