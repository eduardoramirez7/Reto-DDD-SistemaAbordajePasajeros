package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.FechaVencimiento;
import pasajero.values.PasaporteId;

public class FechaVencimientoActualizada extends DomainEvent {

    private final PasaporteId pasaporteId;
    private final FechaVencimiento fechaVencimiento;

    public FechaVencimientoActualizada(PasaporteId pasaporteId, FechaVencimiento fechaVencimiento) {
        super("sofka.pasajero.fechavencimientoactualizada");
        this.pasaporteId = pasaporteId;
        this.fechaVencimiento = fechaVencimiento;
    }

    public PasaporteId getPasaporteId() {
        return pasaporteId;
    }

    public FechaVencimiento getFechaVencimiento() {
        return fechaVencimiento;
    }
}
