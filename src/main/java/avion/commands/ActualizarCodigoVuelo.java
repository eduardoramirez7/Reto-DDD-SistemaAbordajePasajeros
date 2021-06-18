package avion.commands;

import avion.values.AvionId;
import avion.values.CodigoVuelo;
import co.com.sofka.domain.generic.Command;

public class ActualizarCodigoVuelo implements Command {

    private final AvionId avionId;
    private final CodigoVuelo codigoVuelo;


    public ActualizarCodigoVuelo(AvionId avionId, CodigoVuelo codigoVuelo) {
        this.avionId = avionId;
        this.codigoVuelo = codigoVuelo;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public CodigoVuelo getCodigoVuelo() {
        return codigoVuelo;
    }
}
