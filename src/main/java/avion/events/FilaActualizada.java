package avion.events;

import avion.values.AsientoId;
import avion.values.Fila;
import co.com.sofka.domain.generic.DomainEvent;

public class FilaActualizada extends DomainEvent {

    private final AsientoId asientoId;
    private final Fila fila;

    public FilaActualizada(AsientoId asientoId, Fila fila) {
        super("sofka.avion.filaactualizada");
        this.asientoId = asientoId;
        this.fila = fila;
    }

    public AsientoId getAsientoId() {
        return asientoId;
    }

    public Fila getFila() {
        return fila;
    }
}
