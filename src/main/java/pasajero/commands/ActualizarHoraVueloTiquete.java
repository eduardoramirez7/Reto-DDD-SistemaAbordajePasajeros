package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.values.HoraVuelo;
import pasajero.values.PasajeroId;
import pasajero.values.TiqueteId;

public class ActualizarHoraVueloTiquete implements Command {

    private final PasajeroId pasajeroId;
    private final TiqueteId tiqueteId;
    private final HoraVuelo horaVuelo;

    public ActualizarHoraVueloTiquete(PasajeroId pasajeroId, TiqueteId tiqueteId, HoraVuelo horaVuelo) {
        this.pasajeroId = pasajeroId;
        this.tiqueteId = tiqueteId;
        this.horaVuelo = horaVuelo;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }

    public TiqueteId getTiqueteId() {
        return tiqueteId;
    }

    public HoraVuelo getHoraVuelo() {
        return horaVuelo;
    }
}
