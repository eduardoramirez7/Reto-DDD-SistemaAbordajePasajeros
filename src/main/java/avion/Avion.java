package avion;

import avion.events.*;
import avion.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.Email;
import pasajero.values.NombrePasajero;
import pasajero.values.NumeroCelular;
import pasajero.values.PasajeroId;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Avion extends AggregateEvent<AvionId> {
    protected NombreAerolinea nombreAerolinea;
    protected ClaseAvion claseAvion;
    protected CodigoVuelo codigoVuelo;
    protected Set<Piloto> pilotos;
    protected Set<Azafata> azafatas;
    protected Set<Asiento> asientos;
    protected PasajeroId pasajeroId;

    public Avion(AvionId entityId, NombreAerolinea nombreAerolinea, ClaseAvion claseAvion, CodigoVuelo codigoVuelo) {
        super(entityId);
        appendChange(new AvionCreado(nombreAerolinea,claseAvion,codigoVuelo)).apply();
    }
    private Avion(AvionId avionId){
        super(avionId);
        subscribe(new AvionChange(this));
    }
    public static Avion from(AvionId avionId, List<DomainEvent> events){
        var avion = new Avion(avionId);
        events.forEach(avion::applyEvent);
        return avion;
    }

    public void asignarPasajero(PasajeroId pasajeroId, NombrePasajero nombrePasajero, Email email, NumeroCelular numeroCelular){
        Objects.requireNonNull(pasajeroId);
        appendChange(new PasajeroAsignado(pasajeroId,nombrePasajero,email,numeroCelular)).apply();
    }

    public void actualizarNombreAerolinea(NombreAerolinea nombreAerolinea){
        Objects.requireNonNull(nombreAerolinea);
        appendChange(new NombreAerolineaActualizado(nombreAerolinea)).apply();
    }

    public void actualizarClaseAvion(ClaseAvion claseAvion){
        Objects.requireNonNull(claseAvion);
        appendChange(new ClaseAvionActualizada(claseAvion)).apply();
    }

    public void actualizarCodigoVuelo(CodigoVuelo codigoVuelo){
        Objects.requireNonNull(codigoVuelo);
        appendChange(new CodigoVueloActualizado(codigoVuelo)).apply();
    }

    public void actualizarNombrePiloto(PilotoId pilotoId,NombrePiloto nombrePiloto){
        Objects.requireNonNull(pilotoId);
        Objects.requireNonNull(nombrePiloto);
        appendChange(new NombrePilotoActualizado(pilotoId,nombrePiloto)).apply();
    }

    public void actualizarLicencia(PilotoId pilotoId, TipoLicencia tipoLicencia){
        Objects.requireNonNull(pilotoId);
        Objects.requireNonNull(tipoLicencia);
        appendChange(new LicenciaActualizada(pilotoId,tipoLicencia)).apply();
    }

    public void actualizarHorasVuelo(PilotoId pilotoId, HorasVuelo horasVuelo){
        Objects.requireNonNull(pilotoId);
        Objects.requireNonNull(horasVuelo);
        appendChange(new HorasVueloActualizada(pilotoId, horasVuelo)).apply();
    }

    public void actualizarNombreAzafata(AzafataId azafataId, NombreAzafata nombreAzafata){
        Objects.requireNonNull(azafataId);
        Objects.requireNonNull(nombreAzafata);
        appendChange(new NombreAzafataActualizado(azafataId, nombreAzafata)).apply();
    }

    public void actualizarNumeroPasaporte(AzafataId azafataId, NumeroPasaporte numeroPasaporte){
        Objects.requireNonNull(azafataId);
        Objects.requireNonNull(numeroPasaporte);
        appendChange(new NumeroPasaporteActualizado(azafataId, numeroPasaporte)).apply();
    }

    public void actualizarNumeroIdiomas(AzafataId azafataId, NumeroIdiomas numeroIdiomas){
        Objects.requireNonNull(azafataId);
        Objects.requireNonNull(numeroIdiomas);
        appendChange(new NumeroIdiomasActualizado(azafataId, numeroIdiomas)).apply();
    }

    public void actualizarEdadAzafata(AzafataId azafataId, EdadAzafata edadAzafata){
        Objects.requireNonNull(azafataId);
        Objects.requireNonNull(edadAzafata);
        appendChange(new EdadAzafataActualizada(azafataId, edadAzafata)).apply();
    }

    public void actualizarFila(AsientoId asientoId, Fila fila){
        Objects.requireNonNull(asientoId);
        Objects.requireNonNull(fila);
        appendChange(new FilaActualizada(asientoId, fila)).apply();
    }

    public void actualizarLetra(AsientoId asientoId, Letra letra){
        Objects.requireNonNull(asientoId);
        Objects.requireNonNull(letra);
        appendChange(new LetraActualizada(asientoId, letra)).apply();
    }

    public void actualizarClasePuesto(AsientoId asientoId, ClasePuesto clasePuesto){
        Objects.requireNonNull(asientoId);
        Objects.requireNonNull(clasePuesto);
        appendChange(new ClasePuestoActualizada(asientoId, clasePuesto)).apply();
    }

    public void asignarPiloto(PilotoId entityId, NombrePiloto nombrePiloto, TipoLicencia tipoLicencia, HorasVuelo horasVuelo){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombrePiloto);
        Objects.requireNonNull(tipoLicencia);
        Objects.requireNonNull(horasVuelo);
        appendChange(new PilotoAsignado(entityId,nombrePiloto,tipoLicencia,horasVuelo)).apply();
    }

    public void asignarAzafata(AzafataId azafataId, NombreAzafata nombreAzafata, NumeroPasaporte numeroPasaporte, NumeroIdiomas numeroIdiomas, EdadAzafata edadAzafata){
        Objects.requireNonNull(azafataId);
        Objects.requireNonNull(nombreAzafata);
        Objects.requireNonNull(numeroPasaporte);
        Objects.requireNonNull(numeroIdiomas);
        Objects.requireNonNull(edadAzafata);
        appendChange(new AzafataAsignada(azafataId,nombreAzafata,numeroPasaporte,numeroIdiomas,edadAzafata)).apply();
    }

    public void asignarAsiento(AsientoId asientoId, Fila fila, Letra letra, ClasePuesto clasePuesto){
        Objects.requireNonNull(asientoId);
        Objects.requireNonNull(fila);
        Objects.requireNonNull(letra);
        Objects.requireNonNull(clasePuesto);
        appendChange(new AsientoAsignado(asientoId,fila,letra,clasePuesto)).apply();
    }

    protected Optional<Piloto> buscarPilotoPorId(PilotoId pilotoId){
        return pilotos().stream().filter(funcion -> funcion.identity().equals(entityId)).findFirst();
    }

    protected Optional<Azafata> buscarAzafataPorId(AzafataId azafataId){
        return azafatas().stream().filter(funcion -> funcion.identity().equals(entityId)).findFirst();
    }

    protected Optional<Asiento> buscarAsientoPorId(AsientoId asientoId){
        return asientos().stream().filter(funcion -> funcion.identity().equals(entityId)).findFirst();
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

    public Set<Piloto> pilotos() {
        return pilotos;
    }

    public Set<Azafata> azafatas() {
        return azafatas;
    }

    public Set<Asiento> asientos() {
        return asientos;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }
}
