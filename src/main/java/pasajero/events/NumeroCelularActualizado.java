package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.NumeroCelular;

public class NumeroCelularActualizado extends DomainEvent {

    private final NumeroCelular numeroCelular;

    public NumeroCelularActualizado(NumeroCelular numeroCelular) {
        super("sofka.pasajero.numerocelularactualizado");
        this.numeroCelular = numeroCelular;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
