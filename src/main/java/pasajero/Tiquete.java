package pasajero;

import co.com.sofka.domain.generic.Entity;
import pasajero.values.*;

import java.util.Objects;

public class Tiquete extends Entity<TiqueteId> {

    private Asiento asiento;
    private Origen origen;
    private Destino destino;
    private HoraVuelo horaVuelo;

    public Tiquete(TiqueteId entityId, Asiento asiento, Origen origen, Destino destino, HoraVuelo horaVuelo) {
        super(entityId);
        this.asiento = asiento;
        this.origen = origen;
        this.destino = destino;
        this.horaVuelo = horaVuelo;
    }

    public void actualizarAsientoTiquete(Asiento asiento){
        this.asiento = Objects.requireNonNull(asiento);
    }

    public void actualizarOrigenTiquete(Origen origen){
        this.origen = Objects.requireNonNull(origen);
    }

    public void actualizarHoraVueloTiquete(HoraVuelo horaVuelo){
        this.horaVuelo = Objects.requireNonNull(horaVuelo);
    }

    public void actualizarDestinoTiquete(Destino destino){
        this.destino = Objects.requireNonNull(destino);
    }

    public Asiento asiento() {
        return asiento;
    }

    public Origen origen() {
        return origen;
    }

    public Destino destino() {
        return destino;
    }
}
