package useCase.checkin;

import chekin.commands.AsignarRecepcionista;
import chekin.events.CheckInCreado;
import chekin.events.RecepcionistaAsignada;
import chekin.values.CantidadPersonasPorFila;
import chekin.values.CheckInId;
import chekin.values.NombreRecepcionista;
import chekin.values.RecepcionistaId;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;


import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class AsignarRecepcionistaUseCaseTest {

    private AsignarRecepcionistaUseCase asignarRecepcionistaUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        asignarRecepcionistaUseCase = new AsignarRecepcionistaUseCase();
        repository = mock(DomainEventRepository.class);
        asignarRecepcionistaUseCase.addRepository(repository);
    }

    @Test
    void executeUseCase() {

        //Arrange
        var command = new AsignarRecepcionista(
                CheckInId.of("1021"),
                RecepcionistaId.of("8585"),
                new NombreRecepcionista("Margarita")
        );

        when(repository.getEventsBy("1021")).thenReturn(events());

        //Act
        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("8585")
                .syncExecutor(
                        asignarRecepcionistaUseCase, new RequestCommand<>(command)
                ).orElseThrow();
        var events = response.getDomainEvents();

        //Assert
        RecepcionistaAsignada recepcionistaAsignada = (RecepcionistaAsignada) events.get(0);
        Assertions.assertEquals("8585",recepcionistaAsignada.getRecepcionistaId().value());

    }
    private List<DomainEvent> events(){
        return List.of(new CheckInCreado(
                new CantidadPersonasPorFila(10)
        ));

    }
}