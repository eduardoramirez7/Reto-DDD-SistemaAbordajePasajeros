package avion.events;

import avion.values.AzafataId;
import avion.values.NumeroPasaporte;
import co.com.sofka.domain.generic.DomainEvent;

public class NumeroPasaporteActualizado extends DomainEvent {

    private final AzafataId azafataId;
    private final NumeroPasaporte numeroPasaporte;

    public NumeroPasaporteActualizado(AzafataId azafataId, NumeroPasaporte numeroPasaporte) {
        super("sofka.avion.numeropasaporteactualizado");
        this.azafataId = azafataId;
        this.numeroPasaporte = numeroPasaporte;
    }

    public AzafataId getAzafataId() {
        return azafataId;
    }

    public NumeroPasaporte getNumeroPasaporte() {
        return numeroPasaporte;
    }
}
