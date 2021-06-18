package useCase.avion;

import avion.commands.AsignarAsiento;
import avion.events.AsientoAsignado;
import avion.events.AvionCreado;
import avion.values.*;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
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

class AsignarAsientoUseCaseTest{

    private AsignarAsientoUseCase asignarAsientoUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        asignarAsientoUseCase = new AsignarAsientoUseCase();
        repository = mock(DomainEventRepository.class);
        asignarAsientoUseCase.addRepository(repository);
    }

    @Test
    void executeUseCase() throws InterruptedException {

        //arrange
        var command = new AsignarAsiento(
                AvionId.of("32950"),
                AsientoId.of("1"),
                new Fila(5),
                new Letra("A"),
                new ClasePuesto("VIP")
        );

        //act
        when(repository.getEventsBy("32950")).thenReturn(events());

        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("32950")
                .syncExecutor(
                        asignarAsientoUseCase, new RequestCommand<>(command)
        ).orElseThrow();

        var events = response.getDomainEvents();
        AsientoAsignado asientoAsignado = (AsientoAsignado) events.get(0);
        Assertions.assertEquals("1", asientoAsignado.getAsientoId().value());


    }
    private List<DomainEvent> events(){
        return List.of(new AvionCreado(
                new NombreAerolinea("Emirates"),
                new ClaseAvion("Comercial"),
                new CodigoVuelo("T78N")
        ));
    }

}