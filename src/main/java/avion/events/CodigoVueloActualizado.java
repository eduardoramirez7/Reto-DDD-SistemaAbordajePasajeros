package avion.events;

import avion.values.CodigoVuelo;
import co.com.sofka.domain.generic.DomainEvent;

public class CodigoVueloActualizado extends DomainEvent {

    private final CodigoVuelo codigoVuelo;

    public CodigoVueloActualizado(CodigoVuelo codigoVuelo) {
        super("sofka.avion.codigovueloactualizado");
        this.codigoVuelo = codigoVuelo;
    }

    public CodigoVuelo getCodigoVuelo() {
        return codigoVuelo;
    }
}
