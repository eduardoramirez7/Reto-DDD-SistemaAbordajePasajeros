package avion.commands;

import avion.values.AsientoId;
import avion.values.AvionId;
import avion.values.Fila;
import co.com.sofka.domain.generic.Command;

public class ActualizarFila implements Command {

    private final AvionId avionId;
    private final AsientoId asientoId;
    private final Fila fila;

    public ActualizarFila(AvionId avionId, AsientoId asientoId, Fila fila) {
        this.avionId = avionId;
        this.asientoId = asientoId;
        this.fila = fila;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public AsientoId getAsientoId() {
        return asientoId;
    }

    public Fila getFila() {
        return fila;
    }
}
