package avion;

import avion.events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class AvionChange extends EventChange {
    public AvionChange(Avion avion) {

        apply((AvionCreado event)-> {
            avion.nombreAerolinea = event.getNombreAerolinea();
            avion.claseAvion = event.getClaseAvion();
            avion.codigoVuelo = event.getCodigoVuelo();
            avion.pilotos = new HashSet<>();
            avion.azafatas = new HashSet<>();
            avion.asientos = new HashSet<>();
        });

        apply((PasajeroAsignado event)-> {
            avion.pasajeroId = event.getPasajeroId();
        });

        apply((NombreAerolineaActualizado event)-> {
            avion.nombreAerolinea = event.getNombreAerolinea();
        });

        apply((ClaseAvionActualizada event)-> {
            avion.claseAvion = event.getClaseAvion();
        });

        apply((CodigoVueloActualizado event)-> {
            avion.codigoVuelo = event.getCodigoVuelo();
        });

        apply((NombrePilotoActualizado event)-> {
            var funcion = avion.buscarPilotoPorId(event.getPilotoId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra piloto con este nombre"));
            funcion.actualizarNombrePiloto(event.getNombrePiloto());
        });

        apply((LicenciaActualizada event)-> {
            var funcion = avion.buscarPilotoPorId(event.getPilotoId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra licencia para este piloto"));
            funcion.actualizarLicencia(event.getTipoLicencia());
        });

        apply((HorasVueloActualizada event)-> {
            var funcion = avion.buscarPilotoPorId(event.getPilotoId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra horas de vuelo para este piloto"));
            funcion.actualizarHorasVuelo(event.getHorasVuelo());
        });

        apply((NombreAzafataActualizado event)-> {
            var funcion = avion.buscarAzafataPorId(event.getAzafataId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra azafata con este nombre"));
            funcion.actualizarNombreAzafata(event.getNombreAzafata());
        });

        apply((NumeroPasaporteActualizado event)-> {
            var funcion = avion.buscarAzafataPorId(event.getAzafataId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra numero de pasaporte para esta azafata"));
            funcion.actualizarNumeroPasaporte(event.getNumeroPasaporte());
        });

        apply((NumeroIdiomasActualizado event)-> {
            var funcion = avion.buscarAzafataPorId(event.getAzafataId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra numero de idiomas para esta azafata"));
            funcion.actualizarNumeroIdiomas(event.getNumeroIdiomas());
        });

        apply((EdadAzafataActualizada event)-> {
            var funcion = avion.buscarAzafataPorId(event.getAzafataId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra edad para esta azafata"));
            funcion.actualizarEdadAzafata(event.getEdadAzafata());
        });

        apply((FilaActualizada event)-> {
            var funcion = avion.buscarAsientoPorId(event.getAsientoId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra fila para este asiento"));
            funcion.actualizarFila(event.getFila());
        });

        apply((LetraActualizada event)-> {
            var funcion = avion.buscarAsientoPorId(event.getAsientoId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra letra para este asiento"));
            funcion.actualizarLetra(event.getLetra());
        });

        apply((ClasePuestoActualizada event)-> {
            var funcion = avion.buscarAsientoPorId(event.getAsientoId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra clase para este asiento"));
            funcion.actualizarClasePuesto(event.getClasePuesto());
        });

        apply((PilotoAsignado event)-> {
            avion.pilotos.add(new Piloto(
                    event.getPilotoId(),
                    event.getNombrePiloto(),
                    event.getTipoLicencia(),
                    event.getHorasVuelo()
            ));
        });

        apply((AzafataAsignada event)-> {
            avion.azafatas.add(new Azafata(
                    event.getAzafataId(),
                    event.getNombreAzafata(),
                    event.getNumeroPasaporte(),
                    event.getNumeroIdiomas(),
                    event.getEdadAzafata()
            ));
        });

        apply((AsientoAsignado event)-> {
            avion.asientos.add(new Asiento(
                    event.getAsientoId(),
                    event.getFila(),
                    event.getLetra(),
                    event.getClasePuesto()
            ));
        });

    }
}
