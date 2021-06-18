package chekin.events;

import chekin.values.CantidadPersonasPorFila;
import co.com.sofka.domain.generic.DomainEvent;

public class CheckInCreado extends DomainEvent {

    private final CantidadPersonasPorFila cantidadPersonasPorFila;

    public CheckInCreado(CantidadPersonasPorFila cantidadPersonasPorFila) {
        super("sofka.checkin.checkincreado");
        this.cantidadPersonasPorFila = cantidadPersonasPorFila;
    }

    public CantidadPersonasPorFila getCantidadPersonasPorFila() {
        return cantidadPersonasPorFila;
    }
}
