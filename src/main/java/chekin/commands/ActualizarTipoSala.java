package chekin.commands;

import chekin.values.CheckInId;
import chekin.values.SalaEsperaId;
import chekin.values.TipoSala;
import co.com.sofka.domain.generic.Command;

public class ActualizarTipoSala implements Command {

    private final CheckInId checkInId;
    private final SalaEsperaId salaEsperaId;
    private final TipoSala tipoSala;

    public ActualizarTipoSala(CheckInId checkInId, SalaEsperaId salaEsperaId, TipoSala tipoSala) {
        this.checkInId = checkInId;
        this.salaEsperaId = salaEsperaId;
        this.tipoSala = tipoSala;
    }

    public CheckInId getCheckInId() {
        return checkInId;
    }

    public SalaEsperaId getSalaEsperaId() {
        return salaEsperaId;
    }

    public TipoSala getTipoSala() {
        return tipoSala;
    }
}
