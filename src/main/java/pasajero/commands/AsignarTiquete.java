package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.values.*;

public class AsignarTiquete implements Command {

    private final PasajeroId pasajeroId;
    private final TiqueteId tiqueteId;
    private final Asiento asiento;
    private final Origen origen;
    private final Destino destino;
    private final HoraVuelo horaVuelo;

    public AsignarTiquete(PasajeroId pasajeroId, TiqueteId tiqueteId, Asiento asiento, Origen origen, Destino destino, HoraVuelo horaVuelo) {
        this.pasajeroId = pasajeroId;
        this.tiqueteId = tiqueteId;
        this.asiento = asiento;
        this.origen = origen;
        this.destino = destino;
        this.horaVuelo = horaVuelo;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }

    public TiqueteId getTiqueteId() {
        return tiqueteId;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public Origen getOrigen() {
        return origen;
    }

    public Destino getDestino() {
        return destino;
    }

    public HoraVuelo getHoraVuelo() {
        return horaVuelo;
    }
}
