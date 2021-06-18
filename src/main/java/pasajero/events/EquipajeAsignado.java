package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.EquipajeId;
import pasajero.values.Peso;
import pasajero.values.Talla;

public class EquipajeAsignado extends DomainEvent {

    private final EquipajeId equipajeId;
    private final Peso peso;
    private final Talla talla;

    public EquipajeAsignado(EquipajeId equipajeId, Peso peso, Talla talla) {
        super("sofka.pasajeros.equipajeescogido");
        this.equipajeId = equipajeId;
        this.peso = peso;
        this.talla = talla;
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
