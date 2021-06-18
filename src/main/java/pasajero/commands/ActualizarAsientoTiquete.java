package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.values.Asiento;
import pasajero.values.PasajeroId;
import pasajero.values.TiqueteId;

public class ActualizarAsientoTiquete implements Command {

    private final PasajeroId pasajeroId;
    private final TiqueteId tiqueteId;
    private final Asiento asiento;


    public ActualizarAsientoTiquete(PasajeroId pasajeroId, TiqueteId tiqueteId, Asiento asiento) {
        this.pasajeroId = pasajeroId;
        this.tiqueteId = tiqueteId;
        this.asiento = asiento;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }

    public TiqueteId getTiqueteId() {
        return tiqueteId;
    }

    public Asiento getAsiento() {
        return asiento;
    }
}
