package avion.commands;

import avion.values.AvionId;
import avion.values.HorasVuelo;
import avion.values.PilotoId;
import co.com.sofka.domain.generic.Command;

public class ActualizarHorasVuelo implements Command {

    private final AvionId avionId;
    private final PilotoId pilotoId;
    private final HorasVuelo horasVuelo;


    public ActualizarHorasVuelo(AvionId avionId, PilotoId pilotoId, HorasVuelo horasVuelo) {
        this.avionId = avionId;
        this.pilotoId = pilotoId;
        this.horasVuelo = horasVuelo;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public PilotoId getPilotoId() {
        return pilotoId;
    }

    public HorasVuelo getHorasVuelo() {
        return horasVuelo;
    }
}
