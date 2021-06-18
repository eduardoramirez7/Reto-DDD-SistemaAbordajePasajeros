package chekin.events;

import chekin.values.Estado;
import chekin.values.InformacionVueloId;
import co.com.sofka.domain.generic.DomainEvent;

public class EstadoActualizado extends DomainEvent {

    private final InformacionVueloId informacionVueloId;
    private final Estado estado;

    public EstadoActualizado(InformacionVueloId informacionVueloId, Estado estado) {
        super("sofka.checkin.estadoactualizado");
        this.informacionVueloId = informacionVueloId;
        this.estado = estado;
    }

    public InformacionVueloId getInformacionVueloId() {
        return informacionVueloId;
    }

    public Estado getEstado() {
        return estado;
    }
}
