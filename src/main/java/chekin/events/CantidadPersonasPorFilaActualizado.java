package chekin.events;

import chekin.values.CantidadPersonasPorFila;
import chekin.values.CheckInId;
import co.com.sofka.domain.generic.DomainEvent;

public class CantidadPersonasPorFilaActualizado extends DomainEvent {

    private final CheckInId checkInId;
    private final CantidadPersonasPorFila cantidadPersonasPorFila;

    public CantidadPersonasPorFilaActualizado(CheckInId checkInId, CantidadPersonasPorFila cantidadPersonasPorFila) {
        super("sofka.checkin.cantidadpersonas porfilaactualizado");
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
