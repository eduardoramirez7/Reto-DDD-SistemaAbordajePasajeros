package avion.commands;

import avion.values.AvionId;
import co.com.sofka.domain.generic.Command;
import pasajero.values.Email;
import pasajero.values.NombrePasajero;
import pasajero.values.NumeroCelular;
import pasajero.values.PasajeroId;

public class AsignarPasajero implements Command {

    private final AvionId avionId;
    private final PasajeroId pasajeroId;
    private final NombrePasajero nombrePasajero;
    private final Email email;
    private final NumeroCelular numeroCelular;

    public AsignarPasajero(AvionId avionId, PasajeroId pasajeroId, NombrePasajero nombrePasajero, Email email, NumeroCelular numeroCelular) {
        this.avionId = avionId;
        this.pasajeroId = pasajeroId;
        this.nombrePasajero = nombrePasajero;
        this.email = email;
        this.numeroCelular = numeroCelular;
    }

    public AvionId getAvionId() {
        return avionId;
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
