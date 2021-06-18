package useCase.checkin;

import chekin.commands.AsignarInformacionVuelo;
import chekin.commands.AsignarSalaEspera;
import chekin.events.CheckInCreado;
import chekin.events.InformacionVueloAsignado;
import chekin.events.SalaEsperaAsignada;
import chekin.values.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.sql.Time;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AsignarSalaEsperaUseCaseTest {

    private AsignarSalaEsperaUseCase asignarSalaEsperaUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        asignarSalaEsperaUseCase = new AsignarSalaEsperaUseCase();
        repository = mock(DomainEventRepository.class);
        asignarSalaEsperaUseCase.addRepository(repository);
    }

    @Test
    void executeUseCase() {

        //arrange
        var command = new AsignarSalaEspera(
                CheckInId.of("33520"),
                SalaEsperaId.of("A7"),
                new TipoSala("VIP")
        );

        when(repository.getEventsBy("33520")).thenReturn(events());

        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("33520")
                .syncExecutor(
                        asignarSalaEsperaUseCase, new RequestCommand<>(command)
                ).orElseThrow();

        var events = response.getDomainEvents();
        SalaEsperaAsignada salaEsperaAsignada = (SalaEsperaAsignada) events.get(0);
        Assertions.assertEquals("A7", salaEsperaAsignada.getSalaEsperaId().value());

    }
    private List<DomainEvent> events(){
        return List.of(new CheckInCreado(
                new CantidadPersonasPorFila(10)
        ));

    }
}