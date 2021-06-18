package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.Origen;
import pasajero.values.TiqueteId;

public class OrigenTiqueteActualizado extends DomainEvent {

    private final TiqueteId tiqueteId;
    private final Origen origen;

    public OrigenTiqueteActualizado(TiqueteId tiqueteId, Origen origen) {
        super("sofka.pasajero.origentiqueteactualizado");
        this.tiqueteId = tiqueteId;
        this.origen = origen;
    }

    public TiqueteId getTiqueteId() {
        return tiqueteId;
    }

    public Origen getOrigen() {
        return origen;
    }
}
