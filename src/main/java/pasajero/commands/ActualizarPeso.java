package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.values.EquipajeId;
import pasajero.values.PasajeroId;
import pasajero.values.Peso;

public class ActualizarPeso implements Command {

    private final PasajeroId pasajeroId;
    private final EquipajeId equipajeId;
    private final Peso peso;

    public ActualizarPeso(PasajeroId pasajeroId, EquipajeId equipajeId, Peso peso) {
        this.pasajeroId = pasajeroId;
        this.equipajeId = equipajeId;
        this.peso = peso;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }

    public EquipajeId getEquipajeId() {
        return equipajeId;
    }

    public Peso getPeso() {
        return peso;
    }
}
