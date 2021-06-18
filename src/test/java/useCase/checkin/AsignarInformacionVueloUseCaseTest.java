package useCase.checkin;

import chekin.InformacionVuelo;
import chekin.commands.AsignarInformacionVuelo;
import chekin.events.CheckInCreado;
import chekin.events.InformacionVueloAsignado;
import chekin.values.*;
import chekin.values.Destino;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import pasajero.commands.AsignarTiquete;
import pasajero.events.TiqueteAsignado;
import pasajero.values.*;


import java.sql.Time;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AsignarInformacionVueloUseCaseTest {

    private AsignarInformacionVueloUseCase asignarInformacionVueloUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        asignarInformacionVueloUseCase = new AsignarInformacionVueloUseCase();
        repository = mock(DomainEventRepository.class);
        asignarInformacionVueloUseCase.addRepository(repository);
    }

    @Test
    void executeUseCase() {

        //arrange
        var command = new AsignarInformacionVuelo(
                CheckInId.of("22052"),
                InformacionVueloId.of("552233"),
                new Vuelo("PF345"),
                new Hora(Time.valueOf("12:00:00")),
                new Destino("Argentina"),
                new Estado("Retrasado"),
                new Puerta("A5")
        );

        when(repository.getEventsBy("22052")).thenReturn(events());

        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("22052")
                .syncExecutor(
                        asignarInformacionVueloUseCase, new RequestCommand<>(command)
                ).orElseThrow();

        var events = response.getDomainEvents();
        InformacionVueloAsignado informacionVueloAsignado = (InformacionVueloAsignado) events.get(0);
        Assertions.assertEquals("552233", informacionVueloAsignado.getInformacionVueloId().value());
    }
    private List<DomainEvent> events(){
        return List.of(new CheckInCreado(
                new CantidadPersonasPorFila(10)
        ));

    }
}