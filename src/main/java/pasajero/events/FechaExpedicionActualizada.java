package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.FechaExpedicion;
import pasajero.values.PasaporteId;

public class FechaExpedicionActualizada extends DomainEvent {

    private final PasaporteId pasaporteId;
    private final FechaExpedicion fechaExpedicion;

    public FechaExpedicionActualizada(PasaporteId pasaporteId, FechaExpedicion fechaExpedicion) {
        super("sofka.pasajero.fechaexpedicionactualizada");
        this.pasaporteId = pasaporteId;
        this.fechaExpedicion = fechaExpedicion;
    }

    public PasaporteId getPasaporteId() {
        return pasaporteId;
    }

    public FechaExpedicion getFechaExpedicion() {
        return fechaExpedicion;
    }
}
