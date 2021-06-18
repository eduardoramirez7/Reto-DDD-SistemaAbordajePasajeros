package avion.commands;

import avion.values.AsientoId;
import avion.values.AvionId;
import avion.values.Letra;
import co.com.sofka.domain.generic.Command;

public class ActualizarLetra implements Command {

    private final AvionId avionId;
    private final AsientoId asientoId;
    private final Letra letra;

    public ActualizarLetra(AvionId avionId, AsientoId asientoId, Letra letra) {
        this.avionId = avionId;
        this.asientoId = asientoId;
        this.letra = letra;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public AsientoId getAsientoId() {
        return asientoId;
    }

    public Letra getLetra() {
        return letra;
    }
}
