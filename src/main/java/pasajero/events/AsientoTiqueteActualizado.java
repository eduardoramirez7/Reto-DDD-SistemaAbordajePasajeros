package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.Asiento;
import pasajero.values.TiqueteId;


public class AsientoTiqueteActualizado extends DomainEvent {

    private final TiqueteId tiqueteId;
    private final Asiento asiento;

    public AsientoTiqueteActualizado(TiqueteId tiqueteId, Asiento asiento) {
        super("sofka.pasajero.asientotiqueteactualizado");
        this.tiqueteId = tiqueteId;
        this.asiento = asiento;
    }

    public TiqueteId getTiqueteId() {
        return tiqueteId;
    }

    public Asiento getAsiento() {
        return asiento;
    }
}
