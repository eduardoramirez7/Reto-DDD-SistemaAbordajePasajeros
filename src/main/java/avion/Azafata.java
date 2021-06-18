package avion;

import avion.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Azafata extends Entity<AzafataId> {

    private NombreAzafata nombreAzafata;
    private NumeroPasaporte numeroPasaporte;
    private NumeroIdiomas numeroIdiomas;
    private EdadAzafata edadAzafata;

    public Azafata(AzafataId entityId, NombreAzafata nombreAzafata, NumeroPasaporte numeroPasaporte, NumeroIdiomas numeroIdiomas, EdadAzafata edadAzafata) {
        super(entityId);
        this.nombreAzafata = nombreAzafata;
        this.numeroPasaporte = numeroPasaporte;
        this.numeroIdiomas = numeroIdiomas;
        this.edadAzafata = edadAzafata;
    }

    public void actualizarNombreAzafata(NombreAzafata nombreAzafata){
        this.nombreAzafata = Objects.requireNonNull(nombreAzafata);
    }

    public void actualizarNumeroPasaporte(NumeroPasaporte numeroPasaporte){
        this.numeroPasaporte = Objects.requireNonNull(numeroPasaporte);

    }

    public void actualizarNumeroIdiomas(NumeroIdiomas numeroIdiomas){
        this.numeroIdiomas = Objects.requireNonNull(numeroIdiomas);
    }

    public void actualizarEdadAzafata(EdadAzafata edadAzafata){
        this.edadAzafata = Objects.requireNonNull(edadAzafata);
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
