package avion.events;

import avion.values.AzafataId;
import avion.values.EdadAzafata;
import co.com.sofka.domain.generic.DomainEvent;

public class EdadAzafataActualizada extends DomainEvent {

    private final AzafataId azafataId;
    private final EdadAzafata edadAzafata;

    public EdadAzafataActualizada(AzafataId azafataId, EdadAzafata edadAzafata) {
        super("sofka.avion.edadazafataactualizada");
        this.azafataId = azafataId;
        this.edadAzafata = edadAzafata;
    }

    public AzafataId getAzafataId() {
        return azafataId;
    }

    public EdadAzafata getEdadAzafata() {
        return edadAzafata;
    }
}
