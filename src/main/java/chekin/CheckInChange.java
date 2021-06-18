package chekin;

import chekin.events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class CheckInChange extends EventChange {
    public CheckInChange(CheckIn checkIn) {

        apply((CheckInCreado event)-> {
            checkIn.cantidadPersonasPorFila = event.getCantidadPersonasPorFila();
            checkIn.salasespera = new HashSet<>();
            checkIn.recepcionistas = new HashSet<>();
            checkIn.informacionVuelos = new HashSet<>();
        });

        apply((CantidadPersonasPorFilaActualizado event)-> {
            checkIn.cantidadPersonasPorFila = event.getCantidadPersonasPorFila();
        });

        apply((SalaEsperaAsignada event)-> {
            checkIn.salasespera.add(new SalaEspera(
                    event.getSalaEsperaId(),
                    event.getTipoSala()
            ));
        });

        apply((TipoSalaActualizado event)-> {
            var funcion = checkIn.buscarSalaEsperaPorId(event.getSalaEsperaId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra sala con este nombre"));
            funcion.actualizarTipoSala(event.getTipoSala());
        });

        apply((RecepcionistaAsignada event)-> {
            checkIn.recepcionistas.add(new Recepcionista(
                    event.getRecepcionistaId(),
                    event.getNombreRecepcionista()
            ));
        });

        apply((NombreRecepcionistaActualizada event)-> {
            var funcion = checkIn.buscarRecepcionistaPorId(event.getRecepcionistaId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra recepcionista con este nombre"));
            funcion.actualizarNombreRecepcionista(event.getNombreRecepcionista());
        });

        apply((InformacionVueloAsignado event)-> {
            checkIn.informacionVuelos.add(new InformacionVuelo(
                    event.getInformacionVueloId(),
                    event.getVuelo(),
                    event.getHora(),
                    event.getDestino(),
                    event.getEstado(),
                    event.getPuerta()
            ));
        });

        apply((VueloActualizado event)-> {
            var funcion = checkIn.buscarInformacioVueloPorId(event.getInformacionVueloId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra informacion para este vuelo"));
            funcion.actualizarVuelo(event.getVuelo());
        });

        apply((HoraActualizada event)-> {
            var funcion = checkIn.buscarInformacioVueloPorId(event.getInformacionVueloId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra hora para este vuelo"));
            funcion.actualizarHora(event.getHora());
        });

        apply((DestinoActualizado event)-> {
            var funcion = checkIn.buscarInformacioVueloPorId(event.getInformacionVueloId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra destino para este vuelo"));
            funcion.actualizarDestino(event.getDestino());
        });

        apply((EstadoActualizado event)-> {
            var funcion = checkIn.buscarInformacioVueloPorId(event.getInformacionVueloId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra estado para este vuelo"));
            funcion.actualizarEstado(event.getEstado());
        });

        apply((PuertaActualizada event)-> {
            var funcion = checkIn.buscarInformacioVueloPorId(event.getInformacionVueloId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra puerta para este vuelo"));
            funcion.actualizarPuerta(event.getPuerta());
        });

    }
}
