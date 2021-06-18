package avion.events;

import avion.values.AzafataId;
import avion.values.NumeroIdiomas;
import co.com.sofka.domain.generic.DomainEvent;

public class NumeroIdiomasActualizado extends DomainEvent {

    private final AzafataId azafataId;
    private final NumeroIdiomas numeroIdiomas;

    public NumeroIdiomasActualizado(AzafataId azafataId, NumeroIdiomas numeroIdiomas) {
        super("sofka.avion.numeroidiomasactualizado");
        this.azafataId = azafataId;
        this.numeroIdiomas = numeroIdiomas;
    }

    public AzafataId getAzafataId() {
        return azafataId;
    }

    public NumeroIdiomas getNumeroIdiomas() {
        return numeroIdiomas;
    }
}
