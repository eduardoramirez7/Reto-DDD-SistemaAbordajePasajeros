package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.FechaExpedicion;
import pasajero.values.FechaVencimiento;
import pasajero.values.Nacionalidad;
import pasajero.values.PasaporteId;

public class PasaporteAsignado extends DomainEvent {

    private final PasaporteId pasaporteId;
    private final Nacionalidad nacionalidad;
    private final FechaExpedicion fechaExpedicion;
    private final FechaVencimiento fechaVencimiento;

    public PasaporteAsignado(PasaporteId pasaporteId, Nacionalidad nacionalidad, FechaExpedicion fechaExpedicion, FechaVencimiento fechaVencimiento) {
        super("sofka.pasajero.pasaporteescogido");
        this.pasaporteId = pasaporteId;
        this.nacionalidad = nacionalidad;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVencimiento = fechaVencimiento;
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
