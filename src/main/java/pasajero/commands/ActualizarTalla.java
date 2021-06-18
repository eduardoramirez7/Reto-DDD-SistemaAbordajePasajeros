package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.values.EquipajeId;
import pasajero.values.PasajeroId;
import pasajero.values.Talla;

public class ActualizarTalla implements Command {

    private final PasajeroId pasajeroId;
    private final EquipajeId equipajeId;
    private final Talla talla;

    public ActualizarTalla(PasajeroId pasajeroId, EquipajeId equipajeId, Talla talla) {
        this.pasajeroId = pasajeroId;
        this.equipajeId = equipajeId;
        this.talla = talla;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }

    public EquipajeId getEquipajeId() {
        return equipajeId;
    }

    public Talla getTalla() {
        return talla;
    }
}
