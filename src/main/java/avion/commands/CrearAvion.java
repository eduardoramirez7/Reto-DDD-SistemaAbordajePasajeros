package avion.commands;

import avion.Piloto;
import avion.values.AvionId;
import avion.values.ClaseAvion;
import avion.values.CodigoVuelo;
import avion.values.NombreAerolinea;
import co.com.sofka.domain.generic.Command;

import java.util.Set;

public class CrearAvion implements Command {

    private final AvionId avionId;
    private final NombreAerolinea nombreAerolinea;
    private final ClaseAvion claseAvion;
    private final CodigoVuelo codigoVuelo;



    public CrearAvion(AvionId avionId, NombreAerolinea nombreAerolinea, ClaseAvion claseAvion, CodigoVuelo codigoVuelo) {
        this.avionId = avionId;
        this.nombreAerolinea = nombreAerolinea;
        this.claseAvion = claseAvion;
        this.codigoVuelo = codigoVuelo;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public NombreAerolinea getNombreAerolinea() {
        return nombreAerolinea;
    }

    public ClaseAvion getClaseAvion() {
        return claseAvion;
    }

    public CodigoVuelo getCodigoVuelo() {
        return codigoVuelo;
    }


}
