package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.values.NombrePasajero;
import pasajero.values.PasajeroId;

public class ActualizarNombrePasajero implements Command {

    private final PasajeroId pasajeroId;
    private final NombrePasajero nombrePasajero;

    public ActualizarNombrePasajero(PasajeroId pasajeroId, NombrePasajero nombrePasajero) {
        this.pasajeroId = pasajeroId;
        this.nombrePasajero = nombrePasajero;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }

    public NombrePasajero getNombrePasajero() {
        return nombrePasajero;
    }
}
