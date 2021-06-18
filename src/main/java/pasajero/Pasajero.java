package pasajero;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import pasajero.events.*;
import pasajero.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Pasajero extends AggregateEvent<PasajeroId> {

    protected NombrePasajero nombrePasajero;
    protected Email email;
    protected NumeroCelular numeroCelular;
    protected Set<Tiquete> tiquetes;
    protected Set<Pasaporte> pasaportes;
    protected Set<Equipaje> equipajes;

    public Pasajero(PasajeroId entityId, NombrePasajero nombrePasajero, Email email, NumeroCelular numeroCelular) {
        super(entityId);
        appendChange(new PasajeroAsignado(nombrePasajero, email, numeroCelular));
    }
    private Pasajero(PasajeroId entityId){
        super(entityId);
        subscribe(new PasajeroChange(this));
    }

    public static Pasajero from (PasajeroId pasajeroId, List<DomainEvent> events){
        var pasajero = new Pasajero(pasajeroId);
        events.forEach(pasajero::applyEvent);
        return pasajero;
    }

    public void actualizarAsientoTiquete(TiqueteId tiqueteId, Asiento asiento){
        appendChange(new AsientoTiqueteActualizado(tiqueteId,asiento)).apply();
    }

    public void actualizarOrigenTiquete(TiqueteId tiqueteId, Origen origen){
        appendChange(new OrigenTiqueteActualizado(tiqueteId,origen)).apply();
    }

    public void actualizarHoraVueloTiquete(TiqueteId tiqueteId, HoraVuelo horaVuelo){
        appendChange(new HoraVueloTiqueteActualizado(tiqueteId, horaVuelo)).apply();
    }

    public void actualizarDestinoTiquete(TiqueteId tiqueteId, Destino destino){
        appendChange(new DestinoTiqueteActualizado(tiqueteId,destino)).apply();
    }

    public void actualizarNacionalidad(PasaporteId pasaporteId, Nacionalidad nacionalidad){
        appendChange(new NacionalidadActualizada(pasaporteId, nacionalidad)).apply();
    }

    public void actualizarFechaExpedicion(PasaporteId pasaporteId, FechaExpedicion fechaExpedicion){
        appendChange(new FechaExpedicionActualizada(pasaporteId, fechaExpedicion)).apply();
    }

    public void actualizarFechaVencimiento(PasaporteId pasaporteId, FechaVencimiento fechaVencimiento){
        appendChange(new FechaVencimientoActualizada(pasaporteId, fechaVencimiento)).apply();
    }

    public void actualizarPeso(EquipajeId equipajeId, Peso peso){
        appendChange(new PesoActualizado(equipajeId, peso)).apply();
    }

    public void actualizarTalla(EquipajeId equipajeId, Talla talla){
        appendChange(new TallaActualizada(equipajeId, talla)).apply();
    }

    public void asignarTiquete(TiqueteId entityId, Asiento asiento, Origen origen, Destino destino, HoraVuelo horaVuelo){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(origen);
        Objects.requireNonNull(destino);
        Objects.requireNonNull(horaVuelo);
        appendChange(new TiqueteAsignado(entityId,asiento,origen,destino,horaVuelo)).apply();
    }

    public void asignarPasaporte(PasaporteId entityId, Nacionalidad nacionalidad, FechaExpedicion fechaExpedicion, FechaVencimiento fechaVencimiento){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nacionalidad);
        Objects.requireNonNull(fechaExpedicion);
        Objects.requireNonNull(fechaVencimiento);
        appendChange(new PasaporteAsignado(entityId,nacionalidad,fechaExpedicion,fechaVencimiento)).apply();
    }

    public void asignarEquipaje(EquipajeId entityId, Peso peso, Talla talla){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(peso);
        Objects.requireNonNull(talla);
        appendChange(new EquipajeAsignado(entityId,peso,talla)).apply();
    }

    protected Optional<Tiquete> buscarTiquetePorId(TiqueteId entityId){
        return tiquetes.stream().filter(funcion-> funcion.identity().equals(entityId)).findFirst();
    }

    protected Optional<Pasaporte> buscarPasaportePorId(PasaporteId entityId){
        return pasaportes.stream().filter(funcion-> funcion.identity().equals(entityId)).findFirst();
    }

    protected Optional<Equipaje> buscarEquipajePorId(EquipajeId entityId){
        return equipajes.stream().filter(funcion-> funcion.identity().equals(entityId)).findFirst();
    }

    public NombrePasajero getNombrePasajero() {
        return nombrePasajero;
    }

    public Email getEmail() {
        return email;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }

    public Set<Tiquete> tiquetes() {
        return tiquetes;
    }

    public Set<Pasaporte> pasaportes() {
        return pasaportes;
    }

    public Set<Equipaje> equipajes() {
        return equipajes;
    }
}
