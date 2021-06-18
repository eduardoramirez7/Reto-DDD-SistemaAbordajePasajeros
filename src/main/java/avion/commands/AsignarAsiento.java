package avion.commands;

import avion.values.*;
import co.com.sofka.domain.generic.Command;

public class AsignarAsiento implements Command {

    private final AvionId avionId;
    private final AsientoId asientoId;
    private final Fila fila;
    private final Letra letra;
    private final ClasePuesto clasePuesto;

    public AsignarAsiento(AvionId avionId, AsientoId asientoId, Fila fila, Letra letra, ClasePuesto clasePuesto) {
        this.avionId = avionId;
        this.asientoId = asientoId;
        this.fila = fila;
        this.letra = letra;
        this.clasePuesto = clasePuesto;
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

    public Letra getLetra() {
        return letra;
    }

    public ClasePuesto getClasePuesto() {
        return clasePuesto;
    }
}
