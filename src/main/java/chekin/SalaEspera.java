package chekin;

import chekin.values.SalaEsperaId;
import chekin.values.TipoSala;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;


public class SalaEspera extends Entity<SalaEsperaId> {

    private TipoSala tipoSala;

    public SalaEspera(SalaEsperaId entityId, TipoSala tipoSala) {
        super(entityId);
        this.tipoSala = tipoSala;
    }

    public void actualizarTipoSala(TipoSala tipoSala){
        this.tipoSala = Objects.requireNonNull(tipoSala);
    }

    public TipoSala getTipoSala() {
        return tipoSala;
    }
}
