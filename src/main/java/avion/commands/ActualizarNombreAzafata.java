package avion.commands;

import avion.values.AvionId;
import avion.values.AzafataId;
import avion.values.NombreAzafata;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreAzafata implements Command {

    private final AvionId avionId;
    private final AzafataId azafataId;
    private final NombreAzafata nombreAzafata;

    public ActualizarNombreAzafata(AvionId avionId, AzafataId azafataId, NombreAzafata nombreAzafata) {
        this.avionId = avionId;
        this.azafataId = azafataId;
        this.nombreAzafata = nombreAzafata;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public AzafataId getAzafataId() {
        return azafataId;
    }

    public NombreAzafata getNombreAzafata() {
        return nombreAzafata;
    }
}
