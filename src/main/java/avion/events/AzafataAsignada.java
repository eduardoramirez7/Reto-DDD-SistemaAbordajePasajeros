package avion.events;

import avion.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class AzafataAsignada extends DomainEvent {

    private final AzafataId azafataId;
    private final NombreAzafata nombreAzafata;
    private final NumeroPasaporte numeroPasaporte;
    private final NumeroIdiomas numeroIdiomas;
    private final EdadAzafata edadAzafata;

    public AzafataAsignada(AzafataId azafataId, NombreAzafata nombreAzafata, NumeroPasaporte numeroPasaporte, NumeroIdiomas numeroIdiomas, EdadAzafata edadAzafata) {
        super("sofka.avion.azafataasignada");
        this.azafataId = azafataId;
        this.nombreAzafata = nombreAzafata;
        this.numeroPasaporte = numeroPasaporte;
        this.numeroIdiomas = numeroIdiomas;
        this.edadAzafata = edadAzafata;
    }

    public AzafataId getAzafataId() {
        return azafataId;
    }

    public NombreAzafata getNombreAzafata() {
        return nombreAzafata;
    }

    public NumeroPasaporte getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public NumeroIdiomas getNumeroIdiomas() {
        return numeroIdiomas;
    }

    public EdadAzafata getEdadAzafata() {
        return edadAzafata;
    }
}
