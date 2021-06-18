package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.values.FechaVencimiento;
import pasajero.values.PasajeroId;
import pasajero.values.PasaporteId;

public class ActualizarFechaVencimiento implements Command {

    private final PasajeroId pasajeroId;
    private final PasaporteId pasaporteId;
    private final FechaVencimiento fechaVencimiento;

    public ActualizarFechaVencimiento(PasajeroId pasajeroId, PasaporteId pasaporteId, FechaVencimiento fechaVencimiento) {
        this.pasajeroId = pasajeroId;
        this.pasaporteId = pasaporteId;
        this.fechaVencimiento = fechaVencimiento;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }

    public PasaporteId getPasaporteId() {
        return pasaporteId;
    }

    public FechaVencimiento getFechaVencimiento() {
        return fechaVencimiento;
    }
}
