package chekin.commands;

import chekin.values.CantidadPersonasPorFila;
import chekin.values.CheckInId;
import co.com.sofka.domain.generic.Command;

public class CrearCheckIn implements Command {

    private final CheckInId checkInId;
    private final CantidadPersonasPorFila cantidadPersonasPorFila;

    public CrearCheckIn(CheckInId checkInId, CantidadPersonasPorFila cantidadPersonasPorFila) {
        this.checkInId = checkInId;
        this.cantidadPersonasPorFila = cantidadPersonasPorFila;
    }

    public CheckInId getCheckInId() {
        return checkInId;
    }

    public CantidadPersonasPorFila getCantidadPersonasPorFila() {
        return cantidadPersonasPorFila;
    }
}
