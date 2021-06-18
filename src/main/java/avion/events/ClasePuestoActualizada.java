package avion.events;

import avion.values.AsientoId;
import avion.values.ClasePuesto;
import co.com.sofka.domain.generic.DomainEvent;

public class ClasePuestoActualizada extends DomainEvent {

    private final AsientoId asientoId;
    private final ClasePuesto clasePuesto;

    public ClasePuestoActualizada(AsientoId asientoId, ClasePuesto clasePuesto) {
        super("sofka.avion.clasepuestoactualizada");
        this.asientoId = asientoId;
        this.clasePuesto = clasePuesto;
    }

    public AsientoId getAsientoId() {
        return asientoId;
    }

    public ClasePuesto getClasePuesto() {
        return clasePuesto;
    }
}
