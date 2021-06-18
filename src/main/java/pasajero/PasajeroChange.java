package pasajero;

import co.com.sofka.domain.generic.EventChange;
import pasajero.events.*;

import java.util.HashSet;

public class PasajeroChange extends EventChange {
    public PasajeroChange(Pasajero pasajero) {

        apply((PasajeroAsignado event)-> {
            pasajero.nombrePasajero = event.getNombrePasajero();
            pasajero.email = event.getEmail();
            pasajero.numeroCelular = event.getNumeroCelular();
            pasajero.tiquetes = new HashSet<>();
            pasajero.pasaportes = new HashSet<>();
            pasajero.equipajes = new HashSet<>();
        });

        apply((NombrePasajeroActualizado event) -> {
            pasajero.nombrePasajero = event.getNombrePasajero();
        });

        apply((EmailActualizado event)-> {
            pasajero.email = event.getEmail();
        });

        apply((NumeroCelularActualizado event)-> {
            pasajero.numeroCelular = event.getNumeroCelular();
        });

        apply((TiqueteAsignado event)-> {
            pasajero.tiquetes.add(new Tiquete(
               event.getTiqueteId(),
               event.getAsiento(),
               event.getOrigen(),
               event.getDestino(),
               event.getHoraVuelo()
            ));
        });

        apply((PasaporteAsignado event)-> {
            pasajero.pasaportes.add(new Pasaporte(
                    event.getPasaporteId(),
                    event.getNacionalidad(),
                    event.getFechaExpedicion(),
                    event.getFechaVencimiento()
            ));
        });

        apply((EquipajeAsignado event)-> {
            pasajero.equipajes.add(new Equipaje(
                    event.getEquipajeId(),
                    event.getPeso(),
                    event.getTalla()
            ));
        });

        apply((AsientoTiqueteActualizado event)-> {
            var funcion = pasajero.buscarTiquetePorId(event.getTiqueteId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra tiquete para este servicio"));
            funcion.actualizarAsientoTiquete(event.getAsiento());
        });

        apply((OrigenTiqueteActualizado event)->{
            var funcion = pasajero.buscarTiquetePorId(event.getTiqueteId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra origen en el tiquete"));
            funcion.actualizarOrigenTiquete(event.getOrigen());
        });

        apply((DestinoTiqueteActualizado event)->{
            var funcion = pasajero.buscarTiquetePorId(event.getTiqueteId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra destino en el tiquete"));
            funcion.actualizarDestinoTiquete(event.getDestino());
        });

        apply((HoraVueloTiqueteActualizado event)->{
            var funcion = pasajero.buscarTiquetePorId(event.getTiqueteId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra hora de vuelo en el tiquete"));
            funcion.actualizarHoraVueloTiquete(event.getHoraVuelo());
        });

        apply((NacionalidadActualizada event)->{
            var funcion = pasajero.buscarPasaportePorId(event.getPasaporteId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra nacionalidad en el pasaporte"));
            funcion.actualizarNacionalidad(event.getNacionalidad());
        });

        apply((FechaExpedicionActualizada event)->{
            var funcion = pasajero.buscarPasaportePorId(event.getPasaporteId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra fecha de expedicion en el pasaporte"));
            funcion.actualizarFechaExpedicion(event.getFechaExpedicion());
        });

        apply((FechaVencimientoActualizada event)->{
            var funcion = pasajero.buscarPasaportePorId(event.getPasaporteId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra fecha de vencimiento en el pasaporte"));
            funcion.actualizarFechaVencimiento(event.getFechaVencimiento());
        });

        apply((PesoActualizado event)->{
            var funcion = pasajero.buscarEquipajePorId(event.getEquipajeId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra peso del equipaje"));
            funcion.actualizarPeso(event.getPeso());
        });

        apply((TallaActualizada event)->{
            var funcion = pasajero.buscarEquipajePorId(event.getEquipajeId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra talla del equipaje"));
            funcion.actualizarTalla(event.getTalla());
        });

    }
}
