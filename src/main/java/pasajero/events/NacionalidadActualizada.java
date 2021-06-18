package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.Nacionalidad;
import pasajero.values.PasaporteId;

public class NacionalidadActualizada extends DomainEvent {

    private final PasaporteId pasaporteId;
    private final Nacionalidad nacionalidad;

    public NacionalidadActualizada(PasaporteId pasaporteId, Nacionalidad nacionalidad) {
        super("sofka.pasajero.nacionalidadactualizada");
        this.pasaporteId = pasaporteId;
        this.nacionalidad = nacionalidad;
    }

    public PasaporteId getPasaporteId() {
        return pasaporteId;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }
}
