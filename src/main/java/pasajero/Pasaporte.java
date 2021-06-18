package pasajero;

import co.com.sofka.domain.generic.Entity;
import pasajero.values.*;

import java.util.Objects;

public class Pasaporte extends Entity<PasaporteId> {

    private Nacionalidad nacionalidad;
    private FechaExpedicion fechaExpedicion;
    private FechaVencimiento fechaVencimiento;

    public Pasaporte(PasaporteId entityId, Nacionalidad nacionalidad, FechaExpedicion fechaExpedicion, FechaVencimiento fechaVencimiento) {
        super(entityId);
        this.nacionalidad = nacionalidad;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVencimiento = fechaVencimiento;
    }

    public void actualizarNacionalidad(Nacionalidad nacionalidad){
        this.nacionalidad = Objects.requireNonNull(nacionalidad);
    }

    public void actualizarFechaExpedicion(FechaExpedicion fechaExpedicion){
        this.fechaExpedicion = Objects.requireNonNull(fechaExpedicion);
    }

    public void actualizarFechaVencimiento(FechaVencimiento fechaVencimiento){
        this.fechaVencimiento = Objects.requireNonNull(fechaVencimiento);
    }

    public Nacionalidad nacionalidad() {
        return nacionalidad;
    }

    public FechaExpedicion fechaExpedicion() {
        return fechaExpedicion;
    }

    public FechaVencimiento fechaVencimiento() {
        return fechaVencimiento;
    }
}
