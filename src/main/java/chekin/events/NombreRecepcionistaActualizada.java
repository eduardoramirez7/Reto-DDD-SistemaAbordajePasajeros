package chekin.events;

import chekin.values.NombreRecepcionista;
import chekin.values.RecepcionistaId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreRecepcionistaActualizada extends DomainEvent {

    private final RecepcionistaId recepcionistaId;
    private final NombreRecepcionista nombreRecepcionista;

    public NombreRecepcionistaActualizada(RecepcionistaId recepcionistaId, NombreRecepcionista nombreRecepcionista) {
        super("sofka.checkin.nombrerecepcionistaactualizada");
        this.recepcionistaId = recepcionistaId;
        this.nombreRecepcionista = nombreRecepcionista;
    }

    public RecepcionistaId getRecepcionistaId() {
        return recepcionistaId;
    }

    public NombreRecepcionista getNombreRecepcionista() {
        return nombreRecepcionista;
    }
}
