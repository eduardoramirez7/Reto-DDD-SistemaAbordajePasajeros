package avion.commands;

import avion.values.AvionId;
import avion.values.AzafataId;
import avion.values.NumeroIdiomas;
import co.com.sofka.domain.generic.Command;

public class ActualizarNumeroIdiomas implements Command {

    private final AvionId avionId;
    private final AzafataId azafataId;
    private final NumeroIdiomas numeroIdiomas;

    public ActualizarNumeroIdiomas(AvionId avionId, AzafataId azafataId, NumeroIdiomas numeroIdiomas) {
        this.avionId = avionId;
        this.azafataId = azafataId;
        this.numeroIdiomas = numeroIdiomas;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public AzafataId getAzafataId() {
        return azafataId;
    }

    public NumeroIdiomas getNumeroIdiomas() {
        return numeroIdiomas;
    }
}
