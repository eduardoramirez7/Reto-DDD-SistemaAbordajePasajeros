package pasajero;

import co.com.sofka.domain.generic.Entity;
import pasajero.values.EquipajeId;
import pasajero.values.Peso;
import pasajero.values.Talla;

import java.util.Objects;

public class Equipaje extends Entity<EquipajeId> {

    private Peso peso;
    private Talla talla;

    public Equipaje(EquipajeId entityId, Peso peso, Talla talla) {
        super(entityId);
        this.peso = peso;
        this.talla = talla;
    }

    public void actualizarPeso(Peso peso){
        this.peso = Objects.requireNonNull(peso);
    }

    public void actualizarTalla(Talla talla){
        this.talla = Objects.requireNonNull(talla);
    }

    public Peso peso() {
        return peso;
    }

    public Talla talla() {
        return talla;
    }
}
