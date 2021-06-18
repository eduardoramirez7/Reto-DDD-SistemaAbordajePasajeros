package avion;

import avion.values.AsientoId;
import avion.values.ClasePuesto;
import avion.values.Fila;
import avion.values.Letra;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Asiento extends Entity<AsientoId> {

    private Fila fila;
    private Letra letra;
    private ClasePuesto clasePuesto;

    public Asiento(AsientoId entityId, Fila fila, Letra letra, ClasePuesto clasePuesto) {
        super(entityId);
        this.fila = fila;
        this.letra = letra;
        this.clasePuesto = clasePuesto;
    }

    public void actualizarFila(Fila fila){
        this.fila = Objects.requireNonNull(fila);
    }

    public void actualizarLetra(Letra letra){
        this.letra = Objects.requireNonNull(letra);
    }

    public void actualizarClasePuesto(ClasePuesto clasePuesto){
        this.clasePuesto = Objects.requireNonNull(clasePuesto);
    }

    public Fila getFila() {
        return fila;
    }

    public Letra getLetra() {
        return letra;
    }

    public ClasePuesto getClasePuesto() {
        return clasePuesto;
    }
}
