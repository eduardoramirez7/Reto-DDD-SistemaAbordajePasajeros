package avion.commands;

import avion.values.AvionId;
import avion.values.AzafataId;
import avion.values.EdadAzafata;
import co.com.sofka.domain.generic.Command;

public class ActualizarEdadAzafata implements Command {

    private final AvionId avionId;
    private final AzafataId azafataId;
    private final EdadAzafata edadAzafata;

    public ActualizarEdadAzafata(AvionId avionId, AzafataId azafataId, EdadAzafata edadAzafata) {
        this.avionId = avionId;
        this.azafataId = azafataId;
        this.edadAzafata = edadAzafata;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public AzafataId getAzafataId() {
        return azafataId;
    }

    public EdadAzafata getEdadAzafata() {
        return edadAzafata;
    }
}
