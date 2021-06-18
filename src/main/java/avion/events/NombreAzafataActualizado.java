package avion.events;

import avion.values.AzafataId;
import avion.values.NombreAzafata;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreAzafataActualizado extends DomainEvent {

    private final AzafataId azafataId;
    private final NombreAzafata nombreAzafata;

    public NombreAzafataActualizado(AzafataId azafataId, NombreAzafata nombreAzafata) {
        super("sofka.avion.nombreazafataactualizado");
        this.azafataId = azafataId;
        this.nombreAzafata = nombreAzafata;
    }

    public AzafataId getAzafataId() {
        return azafataId;
    }

    public NombreAzafata getNombreAzafata() {
        return nombreAzafata;
    }
}
