package chekin.events;

import chekin.values.SalaEsperaId;
import chekin.values.TipoSala;
import co.com.sofka.domain.generic.DomainEvent;

public class TipoSalaActualizado extends DomainEvent {

    private  final SalaEsperaId salaEsperaId;
    private final TipoSala tipoSala;

    public TipoSalaActualizado(SalaEsperaId salaEsperaId, TipoSala tipoSala) {
        super("sofka.checkin.tiposalaactualizado");
        this.salaEsperaId = salaEsperaId;
        this.tipoSala = tipoSala;
    }

    public SalaEsperaId getSalaEsperaId() {
        return salaEsperaId;
    }

    public TipoSala getTipoSala() {
        return tipoSala;
    }
}
