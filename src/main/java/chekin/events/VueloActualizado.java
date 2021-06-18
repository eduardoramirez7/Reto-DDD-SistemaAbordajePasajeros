package chekin.events;

import chekin.values.InformacionVueloId;
import chekin.values.Vuelo;
import co.com.sofka.domain.generic.DomainEvent;

public class VueloActualizado extends DomainEvent {

    private final InformacionVueloId informacionVueloId;
    private final Vuelo vuelo;

    public VueloActualizado(InformacionVueloId informacionVueloId, Vuelo vuelo) {
        super("sofka.checkin.vueloactualizado");
        this.informacionVueloId = informacionVueloId;
        this.vuelo = vuelo;
    }

    public InformacionVueloId getInformacionVueloId() {
        return informacionVueloId;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }
}
