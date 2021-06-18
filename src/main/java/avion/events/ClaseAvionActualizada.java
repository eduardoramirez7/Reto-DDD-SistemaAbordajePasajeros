package avion.events;

import avion.values.ClaseAvion;
import co.com.sofka.domain.generic.DomainEvent;

public class ClaseAvionActualizada extends DomainEvent {

    private final ClaseAvion claseAvion;

    public ClaseAvionActualizada(ClaseAvion claseAvion) {
        super("sofka.avion.claseavionactualizada");
        this.claseAvion = claseAvion;
    }

    public ClaseAvion getClaseAvion() {
        return claseAvion;
    }
}
