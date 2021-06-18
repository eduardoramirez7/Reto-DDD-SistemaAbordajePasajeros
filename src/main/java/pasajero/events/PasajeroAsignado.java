package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.Email;
import pasajero.values.NombrePasajero;
import pasajero.values.NumeroCelular;

public class PasajeroAsignado extends DomainEvent {

    private final NombrePasajero nombrePasajero;
    private final Email email;
    private final NumeroCelular numeroCelular;

    public PasajeroAsignado(NombrePasajero nombrePasajero, Email email, NumeroCelular numeroCelular) {
        super("sofka.pasajero.pasajerocreado");
        this.nombrePasajero = nombrePasajero;
        this.email = email;
        this.numeroCelular = numeroCelular;
    }

    public NombrePasajero getNombrePasajero() {
        return nombrePasajero;
    }

    public Email getEmail() {
        return email;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
