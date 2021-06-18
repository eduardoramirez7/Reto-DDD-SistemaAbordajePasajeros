package avion.events;

import avion.values.HorasVuelo;
import avion.values.NombrePiloto;
import avion.values.PilotoId;
import avion.values.TipoLicencia;
import co.com.sofka.domain.generic.DomainEvent;

public class PilotoAsignado extends DomainEvent {

    private final PilotoId pilotoId;
    private final NombrePiloto nombrePiloto;
    private final TipoLicencia tipoLicencia;
    private final HorasVuelo horasVuelo;

    public PilotoAsignado(PilotoId pilotoId, NombrePiloto nombrePiloto, TipoLicencia tipoLicencia, HorasVuelo horasVuelo) {
        super("sofka.avion.pilotoasignado");
        this.pilotoId = pilotoId;
        this.nombrePiloto = nombrePiloto;
        this.tipoLicencia = tipoLicencia;
        this.horasVuelo = horasVuelo;
    }

    public PilotoId getPilotoId() {
        return pilotoId;
    }

    public NombrePiloto getNombrePiloto() {
        return nombrePiloto;
    }

    public TipoLicencia getTipoLicencia() {
        return tipoLicencia;
    }

    public HorasVuelo getHorasVuelo() {
        return horasVuelo;
    }
}
