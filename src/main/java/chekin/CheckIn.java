package chekin;

import chekin.events.*;
import chekin.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class CheckIn extends AggregateEvent<CheckInId> {

    protected CantidadPersonasPorFila cantidadPersonasPorFila;
    protected Set<SalaEspera> salasespera;
    protected Set<Recepcionista> recepcionistas;
    protected Set<InformacionVuelo> informacionVuelos;

    public CheckIn(CheckInId entityId, CantidadPersonasPorFila cantidadPersonasPorFila, Set<SalaEspera> salasespera, Set<Recepcionista> recepcionistas, Set<InformacionVuelo> informacionVuelos) {
        super(entityId);
        appendChange(new CheckInCreado(cantidadPersonasPorFila));
    }

    private CheckIn(CheckInId checkInId){
        super(checkInId);
        subscribe(new CheckInChange(this));
    }

    public static  CheckIn from (CheckInId checkInId, List<DomainEvent> events){
        var checkin = new CheckIn(checkInId);
        events.forEach(checkin::applyEvent);
        return checkin;
    }

    public void actualizarCantidadPersonasFila(CheckInId checkInId, CantidadPersonasPorFila cantidadPersonasPorFila){
        Objects.requireNonNull(cantidadPersonasPorFila);
        appendChange(new CantidadPersonasPorFilaActualizado(checkInId, cantidadPersonasPorFila)).apply();
    }

    public void asignarSalaEspera(SalaEsperaId salaEsperaId, TipoSala tipoSala){
        Objects.requireNonNull(salaEsperaId);
        appendChange(new SalaEsperaAsignada(salaEsperaId,tipoSala)).apply();
    }

    public void actualizarTipoSala(SalaEsperaId salaEsperaId, TipoSala tipoSala){
        Objects.requireNonNull(salaEsperaId);
        appendChange(new TipoSalaActualizado(salaEsperaId, tipoSala)).apply();
    }

    public void asignarRecepcionista(RecepcionistaId recepcionistaId, NombreRecepcionista nombreRecepcionista){
        Objects.requireNonNull(recepcionistaId);
        appendChange(new RecepcionistaAsignada(recepcionistaId,nombreRecepcionista)).apply();
    }

    public void actualizarRecepcionista(RecepcionistaId recepcionistaId, NombreRecepcionista nombreRecepcionista){
        Objects.requireNonNull(recepcionistaId);
        appendChange(new NombreRecepcionistaActualizada(recepcionistaId,nombreRecepcionista)).apply();
    }

    public void asignarInformacionVuelo(InformacionVueloId informacionVueloId, Vuelo vuelo, Hora hora, Destino destino, Estado estado, Puerta puerta){
        Objects.requireNonNull(informacionVueloId);
        appendChange(new InformacionVueloAsignado(informacionVueloId,vuelo,hora,destino, estado, puerta)).apply();
    }

    public void actualizarVuelo(InformacionVueloId informacionVueloId, Vuelo vuelo){
        Objects.requireNonNull(informacionVueloId);
        appendChange(new VueloActualizado(informacionVueloId,vuelo)).apply();
    }
    public void actualizarHora(InformacionVueloId informacionVueloId, Hora hora){
        Objects.requireNonNull(informacionVueloId);
        appendChange(new HoraActualizada(informacionVueloId,hora)).apply();
    }
    public void actualizarDestino(InformacionVueloId informacionVueloId, Destino destino){
        Objects.requireNonNull(informacionVueloId);
        appendChange(new DestinoActualizado(informacionVueloId,destino)).apply();
    }
    public void actualizarEstado(InformacionVueloId informacionVueloId, Estado estado){
        Objects.requireNonNull(informacionVueloId);
        appendChange(new EstadoActualizado(informacionVueloId,estado)).apply();
    }
    public void actualizarPuerta(InformacionVueloId informacionVueloId, Puerta puerta){
        Objects.requireNonNull(informacionVueloId);
        appendChange(new PuertaActualizada(informacionVueloId,puerta)).apply();
    }

    protected Optional<SalaEspera> buscarSalaEsperaPorId(SalaEsperaId salaEsperaId){
        return salasespera().stream().filter(funcion -> funcion.identity().equals(entityId)).findFirst();
    }

    protected Optional<Recepcionista> buscarRecepcionistaPorId(RecepcionistaId recepcionistaId){
        return recepcionistas().stream().filter(funcion -> funcion.identity().equals(entityId)).findFirst();
    }

    protected Optional<InformacionVuelo> buscarInformacioVueloPorId(InformacionVueloId informacionVueloId){
        return informacionVuelos().stream().filter(funcion -> funcion.identity().equals(entityId)).findFirst();
    }

    public CantidadPersonasPorFila getCantidadPersonasPorFila() {
        return cantidadPersonasPorFila;
    }

    public Set<SalaEspera> salasespera() {
        return salasespera;
    }

    public Set<Recepcionista> recepcionistas() {
        return recepcionistas;
    }

    public Set<InformacionVuelo> informacionVuelos() {
        return informacionVuelos;
    }
}
