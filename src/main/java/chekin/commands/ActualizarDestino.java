package chekin.commands;

import chekin.values.CheckInId;
import chekin.values.Destino;
import chekin.values.InformacionVueloId;
import co.com.sofka.domain.generic.Command;

public class ActualizarDestino implements Command{

    private final CheckInId checkInId;
    private final InformacionVueloId informacionVueloId;
    private final Destino destino;


    public ActualizarDestino(CheckInId checkInId, InformacionVueloId informacionVueloId, Destino destino) {
        this.checkInId = checkInId;
        this.informacionVueloId = informacionVueloId;
        this.destino = destino;
    }

    public CheckInId getCheckInId() {
        return checkInId;
    }

    public InformacionVueloId getInformacionVueloId() {
        return informacionVueloId;
    }

    public Destino getDestino() {
        return destino;
    }
}
