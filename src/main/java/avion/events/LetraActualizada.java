package avion.events;

import avion.values.AsientoId;
import avion.values.Letra;
import co.com.sofka.domain.generic.DomainEvent;

public class LetraActualizada extends DomainEvent {

    private final AsientoId asientoId;
    private final Letra letra;

    public LetraActualizada(AsientoId asientoId, Letra letra) {
        super("sofka.avion.letraactualizada");
        this.asientoId = asientoId;
        this.letra = letra;
    }

    public AsientoId getAsientoId() {
        return asientoId;
    }

    public Letra getLetra() {
        return letra;
    }
}
