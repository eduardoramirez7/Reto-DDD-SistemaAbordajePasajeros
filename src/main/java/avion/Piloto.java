package avion;

import avion.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Piloto extends Entity<PilotoId> {

    private NombrePiloto nombrePiloto;
    private TipoLicencia tipoLicencia;
    private HorasVuelo horasVuelo;

    public Piloto(PilotoId entityId, NombrePiloto nombrePiloto, TipoLicencia tipoLicencia, HorasVuelo horasVuelo) {
        super(entityId);
        this.nombrePiloto = nombrePiloto;
        this.tipoLicencia = tipoLicencia;
        this.horasVuelo = horasVuelo;
    }

    public void actualizarNombrePiloto(NombrePiloto nombrePiloto){
        this.nombrePiloto = Objects.requireNonNull(nombrePiloto);
    }

    public void actualizarLicencia(TipoLicencia tipoLicencia){
        this.tipoLicencia = Objects.requireNonNull(tipoLicencia);
    }

    public void actualizarHorasVuelo(HorasVuelo horasVuelo){
        this.horasVuelo = Objects.requireNonNull(horasVuelo);
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
