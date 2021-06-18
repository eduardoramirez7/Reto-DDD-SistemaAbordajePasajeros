package useCase.avion;

import avion.commands.AsignarPiloto;
import avion.events.AvionCreado;
import avion.events.PilotoAsignado;
import avion.values.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import useCase.pasajero.CrearPasajeroUseCase;

import java.util.List;
import java.util.concurrent.Flow;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class AsignarPilotoUseCaseTest {

    private AsignarPilotoUseCase asignarPilotoUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        asignarPilotoUseCase = new AsignarPilotoUseCase();
        repository = mock(DomainEventRepository.class);
        asignarPilotoUseCase.addRepository(repository);
    }

    @Test
    void executeUseCase() throws InterruptedException {

        //arrange
        var command = new AsignarPiloto(
                AvionId.of("32950"),
                PilotoId.of("91982"),
                new NombrePiloto("Andres"),
                new TipoLicencia("CPL"),
                new HorasVuelo(210)
        );

        when(repository.getEventsBy("32950")).thenReturn(events());

        //act
        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("32950")
                .syncExecutor(
                asignarPilotoUseCase, new RequestCommand<>(command)
        ).orElseThrow();

        var events = response.getDomainEvents();

        //assert
        PilotoAsignado pilotoAsignado = (PilotoAsignado) events.get(0);
        Assertions.assertEquals("91982", pilotoAsignado.getPilotoId().value());


    }
    private List<DomainEvent> events(){
        return List.of(new AvionCreado(
                new NombreAerolinea("Emirates"),
                new ClaseAvion("Comercial"),
                new CodigoVuelo("T78N")
        ));

    }
}