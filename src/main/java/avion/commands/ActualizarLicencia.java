package avion.commands;

import avion.values.AvionId;
import avion.values.PilotoId;
import avion.values.TipoLicencia;
import co.com.sofka.domain.generic.Command;

public class ActualizarLicencia implements Command {

    private final AvionId avionId;
    private final PilotoId pilotoId;
    private final TipoLicencia tipoLicencia;


    public ActualizarLicencia(AvionId avionId, PilotoId pilotoId, TipoLicencia tipoLicencia) {
        this.avionId = avionId;
        this.pilotoId = pilotoId;
        this.tipoLicencia = tipoLicencia;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public PilotoId getPilotoId() {
        return pilotoId;
    }

    public TipoLicencia getTipoLicencia() {
        return tipoLicencia;
    }
}
