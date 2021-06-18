package avion.events;

import avion.values.NombrePiloto;
import avion.values.PilotoId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombrePilotoActualizado extends DomainEvent {

    private final PilotoId pilotoId;
    private final NombrePiloto nombrePiloto;

    public NombrePilotoActualizado(PilotoId pilotoId, NombrePiloto nombrePiloto) {
        super("sofka.nombrepilotoactualizado");
        this.pilotoId = pilotoId;
        this.nombrePiloto = nombrePiloto;
    }

    public PilotoId getPilotoId() {
        return pilotoId;
    }

    public NombrePiloto getNombrePiloto() {
        return nombrePiloto;
    }
}
