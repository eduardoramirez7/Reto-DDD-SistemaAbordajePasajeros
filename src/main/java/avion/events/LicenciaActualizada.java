package avion.events;

import avion.values.PilotoId;
import avion.values.TipoLicencia;
import co.com.sofka.domain.generic.DomainEvent;

public class LicenciaActualizada extends DomainEvent {

    private final PilotoId pilotoId;
    private final TipoLicencia tipoLicencia;

    public LicenciaActualizada(PilotoId pilotoId, TipoLicencia tipoLicencia) {
        super("sofka.avion.licenciaactualizada");
        this.pilotoId = pilotoId;
        this.tipoLicencia = tipoLicencia;
    }

    public PilotoId getPilotoId() {
        return pilotoId;
    }

    public TipoLicencia getTipoLicencia() {
        return tipoLicencia;
    }
}
