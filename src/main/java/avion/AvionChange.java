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
