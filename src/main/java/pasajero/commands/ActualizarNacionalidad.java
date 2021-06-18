package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.values.Nacionalidad;
import pasajero.values.PasajeroId;
import pasajero.values.PasaporteId;

public class ActualizarNacionalidad implements Command {

    private final PasajeroId pasajeroId;
    private final PasaporteId pasaporteId;
    private final Nacionalidad nacionalidad;

    public ActualizarNacionalidad(PasajeroId pasajeroId, PasaporteId pasaporteId, Nacionalidad nacionalidad) {
        this.pasajeroId = pasajeroId;
        this.pasaporteId = pasaporteId;
        this.nacionalidad = nacionalidad;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }

    public PasaporteId getPasaporteId() {
        return pasaporteId;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }
}
