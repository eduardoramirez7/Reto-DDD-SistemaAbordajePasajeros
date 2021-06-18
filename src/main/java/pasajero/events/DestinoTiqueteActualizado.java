package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.Destino;
import pasajero.values.TiqueteId;

public class DestinoTiqueteActualizado extends DomainEvent {

    private final TiqueteId tiqueteId;
    private final Destino destino;

    public DestinoTiqueteActualizado(TiqueteId tiqueteId, Destino destino) {
        super("sofka.pasajero.destinotiqueteactualizado");
        this.tiqueteId = tiqueteId;
        this.destino = destino;
    }

    public TiqueteId getTiqueteId() {
        return tiqueteId;
    }

    public Destino getDestino() {
        return destino;
    }
}
