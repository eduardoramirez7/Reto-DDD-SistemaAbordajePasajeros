package avion.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.Email;
import pasajero.values.NombrePasajero;
import pasajero.values.NumeroCelular;
import pasajero.values.PasajeroId;

public class PasajeroAsignado extends DomainEvent {

    private final PasajeroId pasajeroId;
    private final NombrePasajero nombrePasajero;
    private final Email email;
    private final NumeroCelular numeroCelular;

    public PasajeroAsignado(PasajeroId pasajeroId, NombrePasajero nombrePasajero, Email email, NumeroCelular numeroCelular) {
        super("sofka.avion.pasajerocreado");
        this.pasajeroId = pasajeroId;
        this.nombrePasajero = nombrePasajero;
        this.email = email;
        this.numeroCelular = numeroCelular;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
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
