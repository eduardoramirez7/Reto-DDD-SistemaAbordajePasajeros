package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.values.EquipajeId;
import pasajero.values.PasajeroId;
import pasajero.values.Peso;
import pasajero.values.Talla;

public class AsignarEquipaje implements Command {

    private final PasajeroId pasajeroId;
    private final EquipajeId equipajeId;
    private final Peso peso;
    private final Talla talla;

    public AsignarEquipaje(PasajeroId pasajeroId, EquipajeId equipajeId, Peso peso, Talla talla) {
        this.pasajeroId = pasajeroId;
        this.equipajeId = equipajeId;
        this.peso = peso;
        this.talla = talla;
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

    public Talla getTalla() {
        return talla;
    }
}
