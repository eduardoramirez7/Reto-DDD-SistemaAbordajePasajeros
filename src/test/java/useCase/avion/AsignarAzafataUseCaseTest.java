package useCase.avion;

import avion.commands.AsignarAzafata;
import avion.events.AvionCreado;
import avion.events.AzafataAsignada;
import avion.values.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;
import java.util.concurrent.Flow;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AsignarAzafataUseCaseTest {

    private AsignarAzafataUseCase asignarAzafataUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        asignarAzafataUseCase = new AsignarAzafataUseCase();
        repository = mock(DomainEventRepository.class);
        asignarAzafataUseCase.addRepository(repository);
    }

    @Test
    void executeUseCase() throws InterruptedException {

        //arrange
        var command = new AsignarAzafata(
                AvionId.of("32950"),
                AzafataId.of("A123"),
                new NombreAzafata("Marcela Guzman"),
                new NumeroPasaporte("5493365"),
                new NumeroIdiomas(150),
                new EdadAzafata(25)
        );

        when(repository.getEventsBy("32950")).thenReturn(events());

        //act
        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("A123")
                .syncExecutor(
                        asignarAzafataUseCase, new RequestCommand<>(command)
                ).orElseThrow();
        var events = response.getDomainEvents();
        AzafataAsignada azafataAsignada = (AzafataAsignada) events.get(0);
        Assertions.assertEquals("A123", azafataAsignada.getAzafataId().value());


    }
    private List<DomainEvent> events(){
        return List.of(new AvionCreado(
                new NombreAerolinea("Emirates"),
                new ClaseAvion("Comercial"),
                new CodigoVuelo("T78N")
        ));
    }
}