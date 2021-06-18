package chekin.commands;

import chekin.values.CheckInId;
import chekin.values.Estado;
import chekin.values.InformacionVueloId;
import co.com.sofka.domain.generic.Command;

public class ActualizarEstado implements Command {

    private final CheckInId checkInId;
    private final InformacionVueloId informacionVueloId;
    private final Estado estado;

    public ActualizarEstado(CheckInId checkInId, InformacionVueloId informacionVueloId, Estado estado) {
        this.checkInId = checkInId;
        this.informacionVueloId = informacionVueloId;
        this.estado = estado;
    }

    public CheckInId getCheckInId() {
        return checkInId;
    }

    public InformacionVueloId getInformacionVueloId() {
        return informacionVueloId;
    }

    public Estado getEstado() {
        return estado;
    }
}
