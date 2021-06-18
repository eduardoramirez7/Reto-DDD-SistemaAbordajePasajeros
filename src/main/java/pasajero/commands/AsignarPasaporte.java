package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.values.*;

public class AsignarPasaporte implements Command {

    private final PasajeroId pasajeroId;
    private final PasaporteId pasaporteId;
    private final Nacionalidad nacionalidad;
    private final FechaExpedicion fechaExpedicion;
    private final FechaVencimiento fechaVencimiento;

    public AsignarPasaporte(PasajeroId pasajeroId, PasaporteId pasaporteId, Nacionalidad nacionalidad, FechaExpedicion fechaExpedicion, FechaVencimiento fechaVencimiento) {
        this.pasajeroId = pasajeroId;
        this.pasaporteId = pasaporteId;
        this.nacionalidad = nacionalidad;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVencimiento = fechaVencimiento;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }

    public PasaporteId getPasaporteId() {
        return pasaporteId;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public FechaExpedicion getFechaExpedicion() {
        return fechaExpedicion;
    }

    public FechaVencimiento getFechaVencimiento() {
        return fechaVencimiento;
    }
}
