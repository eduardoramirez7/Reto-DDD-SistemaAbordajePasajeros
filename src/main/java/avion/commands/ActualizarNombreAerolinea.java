package avion.commands;

import avion.values.AvionId;
import avion.values.NombreAerolinea;

public class ActualizarNombreAerolinea {

    private final AvionId avionId;
    private final NombreAerolinea nombreAerolinea;

    public ActualizarNombreAerolinea(AvionId avionId, NombreAerolinea nombreAerolinea) {
        this.avionId = avionId;
        this.nombreAerolinea = nombreAerolinea;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public NombreAerolinea getNombreAerolinea() {
        return nombreAerolinea;
    }
}
