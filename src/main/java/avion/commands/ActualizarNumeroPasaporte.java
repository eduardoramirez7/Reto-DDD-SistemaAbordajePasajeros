package avion.commands;

import avion.values.AvionId;
import avion.values.AzafataId;
import avion.values.NumeroPasaporte;
import co.com.sofka.domain.generic.Command;

public class ActualizarNumeroPasaporte implements Command {

    private final AvionId avionId;
    private final AzafataId azafataId;
    private final NumeroPasaporte numeroPasaporte;

    public ActualizarNumeroPasaporte(AvionId avionId, AzafataId azafataId, NumeroPasaporte numeroPasaporte) {
        this.avionId = avionId;
        this.azafataId = azafataId;
        this.numeroPasaporte = numeroPasaporte;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public AzafataId getAzafataId() {
        return azafataId;
    }

    public NumeroPasaporte getNumeroPasaporte() {
        return numeroPasaporte;
    }
}
