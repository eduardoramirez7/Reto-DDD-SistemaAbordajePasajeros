package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.values.NumeroCelular;
import pasajero.values.PasajeroId;

public class ActualizarNumeroCelular implements Command {

    private final PasajeroId pasajeroId;
    private final NumeroCelular numeroCelular;


    public ActualizarNumeroCelular(PasajeroId pasajeroId, NumeroCelular numeroCelular) {
        this.pasajeroId = pasajeroId;
        this.numeroCelular = numeroCelular;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
