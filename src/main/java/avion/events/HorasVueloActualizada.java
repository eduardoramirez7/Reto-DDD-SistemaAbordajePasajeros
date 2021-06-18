package avion.events;

import avion.values.HorasVuelo;
import avion.values.PilotoId;
import co.com.sofka.domain.generic.DomainEvent;

public class HorasVueloActualizada extends DomainEvent {

    private final PilotoId pilotoId;
    private final HorasVuelo horasVuelo;


    public HorasVueloActualizada(PilotoId pilotoId, HorasVuelo horasVuelo) {
        super("sofka.avion.horasvueloactualizada");
        this.pilotoId = pilotoId;
        this.horasVuelo = horasVuelo;
    }

    public PilotoId getPilotoId() {
        return pilotoId;
    }

    public HorasVuelo getHorasVuelo() {
        return horasVuelo;
    }
}
