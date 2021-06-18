package chekin.commands;

import chekin.values.CheckInId;
import chekin.values.NombreRecepcionista;
import chekin.values.RecepcionistaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class ActualizarNombreRecepcionista implements Command {

    private final CheckInId checkInId;
    private final RecepcionistaId recepcionistaId;
    private final NombreRecepcionista nombreRecepcionista;

    public ActualizarNombreRecepcionista(CheckInId checkInId, RecepcionistaId recepcionistaId, NombreRecepcionista nombreRecepcionista) {
        this.checkInId = checkInId;
        this.recepcionistaId = recepcionistaId;
        this.nombreRecepcionista = nombreRecepcionista;
    }

    public CheckInId getCheckInId() {
        return checkInId;
    }

    public RecepcionistaId getRecepcionistaId() {
        return recepcionistaId;
    }

    public NombreRecepcionista getNombreRecepcionista() {
        return nombreRecepcionista;
    }
}
