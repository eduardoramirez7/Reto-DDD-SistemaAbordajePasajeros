package chekin.events;

import chekin.values.NombreRecepcionista;
import chekin.values.RecepcionistaId;
import co.com.sofka.domain.generic.DomainEvent;

public class RecepcionistaAsignada extends DomainEvent {

    private final RecepcionistaId recepcionistaId;
    private final NombreRecepcionista nombreRecepcionista;

    public RecepcionistaAsignada(RecepcionistaId recepcionistaId, NombreRecepcionista nombreRecepcionista) {
        super("sofka.checkin.recepcionistaasiganada");
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
