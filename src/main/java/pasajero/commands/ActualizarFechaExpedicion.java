package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.values.FechaExpedicion;
import pasajero.values.PasajeroId;
import pasajero.values.PasaporteId;

public class ActualizarFechaExpedicion implements Command {

    private final PasajeroId pasajeroId;
    private final PasaporteId pasaporteId;
    private final FechaExpedicion fechaExpedicion;

    public ActualizarFechaExpedicion(PasajeroId pasajeroId, PasaporteId pasaporteId, FechaExpedicion fechaExpedicion) {
        this.pasajeroId = pasajeroId;
        this.pasaporteId = pasaporteId;
        this.fechaExpedicion = fechaExpedicion;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }

    public PasaporteId getPasaporteId() {
        return pasaporteId;
    }

    public FechaExpedicion getFechaExpedicion() {
        return fechaExpedicion;
    }
}
