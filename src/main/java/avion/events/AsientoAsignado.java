package avion.events;

import avion.values.AsientoId;
import avion.values.ClasePuesto;
import avion.values.Fila;
import avion.values.Letra;
import co.com.sofka.domain.generic.DomainEvent;

public class AsientoAsignado extends DomainEvent {

    private final AsientoId asientoId;
    private final Fila fila;
    private final Letra letra;
    private final ClasePuesto clasePuesto;

    public AsientoAsignado(AsientoId asientoId, Fila fila, Letra letra, ClasePuesto clasePuesto) {
        super("sofka.avion.asientoasignado");
        this.asientoId = asientoId;
        this.fila = fila;
        this.letra = letra;
        this.clasePuesto = clasePuesto;
    }

    public AsientoId getAsientoId() {
        return asientoId;
    }

    public Fila getFila() {
        return fila;
    }

    public Letra getLetra() {
        return letra;
    }

    public ClasePuesto getClasePuesto() {
        return clasePuesto;
    }
}
