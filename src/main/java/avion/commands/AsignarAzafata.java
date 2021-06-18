package avion.commands;

import avion.values.*;
import co.com.sofka.domain.generic.Command;

public class AsignarAzafata implements Command {

    private final AvionId avionId;
    private final AzafataId azafataId;
    private final NombreAzafata nombreAzafata;
    private final NumeroPasaporte numeroPasaporte;
    private final NumeroIdiomas numeroIdiomas;
    private final EdadAzafata edadAzafata;


    public AsignarAzafata(AvionId avionId, AzafataId azafataId, NombreAzafata nombreAzafata, NumeroPasaporte numeroPasaporte, NumeroIdiomas numeroIdiomas, EdadAzafata edadAzafata) {
        this.avionId = avionId;
        this.azafataId = azafataId;
        this.nombreAzafata = nombreAzafata;
        this.numeroPasaporte = numeroPasaporte;
        this.numeroIdiomas = numeroIdiomas;
        this.edadAzafata = edadAzafata;
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
