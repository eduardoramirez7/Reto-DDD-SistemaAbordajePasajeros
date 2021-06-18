package useCase.pasajero;

import avion.events.AvionCreado;
import avion.values.ClaseAvion;
import avion.values.CodigoVuelo;
import avion.values.NombreAerolinea;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import pasajero.Pasajero;
import pasajero.commands.AsignarTiquete;
import pasajero.events.PasajeroAsignado;
import pasajero.events.TiqueteAsignado;
import pasajero.values.*;
import useCase.avion.AsignarAsientoUseCase;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AsignarTiqueteUseCaseTest {

    private AsignarTiqueteUseCase asignarTiqueteUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        asignarTiqueteUseCase = new AsignarTiqueteUseCase();
        repository = mock(DomainEventRepository.class);
        asignarTiqueteUseCase.addRepository(repository);
    }

    @Test
    void executeUseCase() {

        //arrange
        var command = new AsignarTiquete(
                PasajeroId.of("12452"),
                TiqueteId.of("1061254"),
                new Asiento("A3"),
                new Origen("Colombia"),
                new Destino("Puerto Rico"),
                new HoraVuelo(Time.valueOf("12:00:00"))
        );

        when(repository.getEventsBy("1061254")).thenReturn(events());

        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("1061254")
                .syncExecutor(
                        asignarTiqueteUseCase, new RequestCommand<>(command)
                ).orElseThrow();

        var events = response.getDomainEvents();
        TiqueteAsignado tiqueteAsignado = (TiqueteAsignado) events.get(0);
        Assertions.assertEquals("1061254", tiqueteAsignado.getTiqueteId().value());

    }
    private List<DomainEvent> events(){
        return List.of(new PasajeroAsignado(
                new NombrePasajero("Joselito"),
                new Email("jose@unicauca.edu.co"),
                new NumeroCelular(325416)
        ));
    }
}