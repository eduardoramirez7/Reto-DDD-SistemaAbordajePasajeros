package chekin.events;

import chekin.values.Destino;
import chekin.values.InformacionVueloId;
import co.com.sofka.domain.generic.DomainEvent;

public class DestinoActualizado extends DomainEvent {

    private final InformacionVueloId informacionVueloId;
    private final Destino destino;

    public DestinoActualizado(InformacionVueloId informacionVueloId, Destino destino) {
        super("sofka.checkin.destinoactualizado");
        this.informacionVueloId = informacionVueloId;
        this.destino = destino;
    }

    public InformacionVueloId getInformacionVueloId() {
        return informacionVueloId;
    }

    public Destino getDestino() {
        return destino;
    }
}
