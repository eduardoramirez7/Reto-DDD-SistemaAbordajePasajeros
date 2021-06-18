package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.EquipajeId;
import pasajero.values.Peso;

public class PesoActualizado extends DomainEvent {

    private final EquipajeId equipajeId;
    private final Peso peso;

    public PesoActualizado(EquipajeId equipajeId, Peso peso) {
        super("sofka.pasajero.pesoactualizado");
        this.equipajeId = equipajeId;
        this.peso = peso;
    }

    public EquipajeId getEquipajeId() {
        return equipajeId;
    }

    public Peso getPeso() {
        return peso;
    }
}
