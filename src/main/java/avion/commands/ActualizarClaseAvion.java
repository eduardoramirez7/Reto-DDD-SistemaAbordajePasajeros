package avion.commands;

import avion.values.AvionId;
import avion.values.ClaseAvion;
import co.com.sofka.domain.generic.Command;

public class ActualizarClaseAvion implements Command {

    private AvionId avionId;
    private ClaseAvion claseAvion;

    public ActualizarClaseAvion(AvionId avionId, ClaseAvion claseAvion) {
        this.avionId = avionId;
        this.claseAvion = claseAvion;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public ClaseAvion getClaseAvion() {
        return claseAvion;
    }
}
