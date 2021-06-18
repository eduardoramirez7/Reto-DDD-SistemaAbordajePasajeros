package avion.events;

import avion.values.NombreAerolinea;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreAerolineaActualizado extends DomainEvent {

    private final NombreAerolinea nombreAerolinea;

    public NombreAerolineaActualizado(NombreAerolinea nombreAerolinea) {
        super("sofka.avion.nombreaerolineaactualizado");
        this.nombreAerolinea = nombreAerolinea;
    }

    public NombreAerolinea getNombreAerolinea() {
        return nombreAerolinea;
    }
}
