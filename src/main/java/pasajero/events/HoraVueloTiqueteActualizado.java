package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.HoraVuelo;
import pasajero.values.TiqueteId;

public class HoraVueloTiqueteActualizado extends DomainEvent {

    private final TiqueteId tiqueteId;
    private final HoraVuelo horaVuelo;

    public HoraVueloTiqueteActualizado(TiqueteId tiqueteId, HoraVuelo horaVuelo) {
        super("sofka.pasajero.horavuelotiqueteactualizado");
        this.tiqueteId = tiqueteId;
        this.horaVuelo = horaVuelo;
    }

    public TiqueteId getTiqueteId() {
        return tiqueteId;
    }

    public HoraVuelo getHoraVuelo() {
        return horaVuelo;
    }
}
