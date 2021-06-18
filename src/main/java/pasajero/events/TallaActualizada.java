package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.EquipajeId;
import pasajero.values.Talla;

public class TallaActualizada extends DomainEvent {

    private final EquipajeId equipajeId;
    private final Talla talla;

    public TallaActualizada(EquipajeId equipajeId, Talla talla) {
        super("sofka.pasajero.tallaactualizada");
        this.equipajeId = equipajeId;
        this.talla = talla;
    }

    public EquipajeId getEquipajeId() {
        return equipajeId;
    }

    public Talla getTalla() {
        return talla;
    }
}
