package avion.commands;

import avion.values.*;
import co.com.sofka.domain.generic.Command;

public class AsignarPiloto implements Command {

    private final AvionId avionId;
    private final PilotoId entityId;
    private final NombrePiloto nombrePiloto;
    private final TipoLicencia tipoLicencia;
    private final HorasVuelo horasVuelo;


    public AsignarPiloto(AvionId avionId, PilotoId entityId, NombrePiloto nombrePiloto, TipoLicencia tipoLicencia, HorasVuelo horasVuelo) {
        this.avionId = avionId;
        this.entityId = entityId;
        this.nombrePiloto = nombrePiloto;
        this.tipoLicencia = tipoLicencia;
        this.horasVuelo = horasVuelo;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public PilotoId getEntityId() {
        return entityId;
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
