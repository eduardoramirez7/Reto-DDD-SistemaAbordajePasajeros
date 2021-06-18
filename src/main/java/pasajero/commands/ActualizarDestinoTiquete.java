package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.values.Destino;
import pasajero.values.PasajeroId;
import pasajero.values.TiqueteId;

public class ActualizarDestinoTiquete implements Command {

    private final PasajeroId pasajeroId;
    private final TiqueteId tiqueteId;
    private final Destino destino;


    public ActualizarDestinoTiquete(PasajeroId pasajeroId, TiqueteId tiqueteId, Destino destino) {
        this.pasajeroId = pasajeroId;
        this.tiqueteId = tiqueteId;
        this.destino = destino;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }

    public TiqueteId getTiqueteId() {
        return tiqueteId;
    }

    public Destino getDestino() {
        return destino;
    }
}
