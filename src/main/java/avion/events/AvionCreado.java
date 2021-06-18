package avion.events;

import avion.values.ClaseAvion;
import avion.values.CodigoVuelo;
import avion.values.NombreAerolinea;
import co.com.sofka.domain.generic.DomainEvent;

public class AvionCreado extends DomainEvent {

    private final NombreAerolinea nombreAerolinea;
    private final ClaseAvion claseAvion;
    private final CodigoVuelo codigoVuelo;

    public AvionCreado(NombreAerolinea nombreAerolinea, ClaseAvion claseAvion, CodigoVuelo codigoVuelo) {
        super("sofka.avion.avioncreado");
        this.nombreAerolinea = nombreAerolinea;
        this.claseAvion = claseAvion;
        this.codigoVuelo = codigoVuelo;
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
