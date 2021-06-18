package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.values.Email;
import pasajero.values.PasajeroId;

public class ActualizarEmail implements Command {

    private final PasajeroId pasajeroId;
    private final Email email;

    public ActualizarEmail(PasajeroId pasajeroId, Email email) {
        this.pasajeroId = pasajeroId;
        this.email = email;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }

    public Email getEmail() {
        return email;
    }
}
