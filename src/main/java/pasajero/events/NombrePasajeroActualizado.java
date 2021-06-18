package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.NombrePasajero;

public class NombrePasajeroActualizado extends DomainEvent {

    private final NombrePasajero nombrePasajero;

    public NombrePasajeroActualizado(NombrePasajero nombrePasajero) {
        super("sofka.pasajero.nombrepasajeroactualizado");
        this.nombrePasajero = nombrePasajero;
    }

    public NombrePasajero getNombrePasajero() {
        return nombrePasajero;
    }
}
