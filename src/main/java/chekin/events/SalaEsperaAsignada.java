package chekin.events;

import chekin.values.SalaEsperaId;
import chekin.values.TipoSala;
import co.com.sofka.domain.generic.DomainEvent;

public class SalaEsperaAsignada extends DomainEvent {

    private final SalaEsperaId salaEsperaId;
    private final TipoSala tipoSala;

    public SalaEsperaAsignada(SalaEsperaId salaEsperaId, TipoSala tipoSala) {
        super("sofka.checkin.salaesperaasignada");
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
