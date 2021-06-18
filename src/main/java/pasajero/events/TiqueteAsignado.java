package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.*;

public class TiqueteAsignado extends DomainEvent {

    private final TiqueteId entityId;
    private final Asiento asiento;
    private final Origen origen;
    private final Destino destino;
    private final HoraVuelo horaVuelo;

    public TiqueteAsignado(TiqueteId entityId, Asiento asiento, Origen origen, Destino destino, HoraVuelo horaVuelo) {
        super("sofka.pasajero.tiqueteescogido");
        this.entityId = entityId;
        this.asiento = asiento;
        this.origen = origen;
        this.destino = destino;
        this.horaVuelo = horaVuelo;
    }

    public TiqueteId getTiqueteId() {
        return entityId;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public Origen getOrigen() {
        return origen;
    }

    public Destino getDestino() {
        return destino;
    }

    public HoraVuelo getHoraVuelo() {
        return horaVuelo;
    }
}
