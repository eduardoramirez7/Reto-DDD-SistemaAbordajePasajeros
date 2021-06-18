package chekin.events;

import chekin.values.InformacionVueloId;
import chekin.values.Puerta;
import co.com.sofka.domain.generic.DomainEvent;

public class PuertaActualizada extends DomainEvent {

    private final InformacionVueloId informacionVueloId;
    private final Puerta puerta;

    public PuertaActualizada(InformacionVueloId informacionVueloId, Puerta puerta) {
        super("sofka.checkin.puertaactualizada");
        this.informacionVueloId = informacionVueloId;
        this.puerta = puerta;
    }

    public InformacionVueloId getInformacionVueloId() {
        return informacionVueloId;
    }

    public Puerta getPuerta() {
        return puerta;
    }
}
