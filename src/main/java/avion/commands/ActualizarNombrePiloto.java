package avion.commands;

import avion.values.AvionId;
import avion.values.NombrePiloto;
import avion.values.PilotoId;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombrePiloto implements Command {

    private final AvionId avionId;
    private final PilotoId pilotoId;
    private final NombrePiloto nombrePiloto;

    public ActualizarNombrePiloto(AvionId avionId, PilotoId pilotoId, NombrePiloto nombrePiloto) {
        this.avionId = avionId;
        this.pilotoId = pilotoId;
        this.nombrePiloto = nombrePiloto;
    }

    public AvionId getAvionId() {
        return avionId;
    }

    public PilotoId getPilotoId() {
        return pilotoId;
    }

    public NombrePiloto getNombrePiloto() {
        return nombrePiloto;
    }
}
