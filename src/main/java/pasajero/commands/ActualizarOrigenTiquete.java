package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.values.Origen;
import pasajero.values.PasajeroId;
import pasajero.values.TiqueteId;

public class ActualizarOrigenTiquete implements Command {

    private final PasajeroId pasajeroId;
    private final TiqueteId tiqueteId;
    private final Origen origen;

    public ActualizarOrigenTiquete(PasajeroId pasajeroId, TiqueteId tiqueteId, Origen origen) {
        this.pasajeroId = pasajeroId;
        this.tiqueteId = tiqueteId;
        this.origen = origen;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }

    public TiqueteId getTiqueteId() {
        return tiqueteId;
    }

    public Origen getOrigen() {
        return origen;
    }
}
