package avion.commands;

import avion.values.AsientoId;
import avion.values.AvionId;
import avion.values.ClasePuesto;
import co.com.sofka.domain.generic.Command;

public class ActualizarClasePuesto implements Command {

    private final AvionId avionId;
    private final AsientoId asientoId;
    private final ClasePuesto clasePuesto;

    public ActualizarClasePuesto(AvionId avionId, AsientoId asientoId, ClasePuesto clasePuesto) {
        this.avionId = avionId;
        this.asientoId = asientoId;
        this.clasePuesto = clasePuesto;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public AsientoId getAsientoId() {
        return asientoId;
    }

    public ClasePuesto getClasePuesto() {
        return clasePuesto;
    }
}
