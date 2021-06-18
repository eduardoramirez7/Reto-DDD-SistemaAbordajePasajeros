package useCase.pasajero;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import pasajero.commands.AsignarEquipaje;
import pasajero.commands.AsignarTiquete;
import pasajero.events.EquipajeAsignado;
import pasajero.events.PasajeroAsignado;
import pasajero.events.TiqueteAsignado;
import pasajero.values.*;

import java.sql.Time;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AsignarEquipajeUseCaseTest {

    private AsignarEquipajeUseCase asignarEquipajeUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        asignarEquipajeUseCase = new AsignarEquipajeUseCase();
        repository = mock(DomainEventRepository.class);
        asignarEquipajeUseCase.addRepository(repository);
    }

    @Test
    void executeUseCase() {

        //arrange
        var command = new AsignarEquipaje(
                PasajeroId.of("448855"),
                EquipajeId.of("58462"),
                new Peso(20F),
                new Talla("120")
        );

        when(repository.getEventsBy("448855")).thenReturn(events());

        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("448855")
                .syncExecutor(
                        asignarEquipajeUseCase, new RequestCommand<>(command)
                ).orElseThrow();

        var events = response.getDomainEvents();
        EquipajeAsignado equipajeAsignado = (EquipajeAsignado) events.get(0);
        Assertions.assertEquals("58462", equipajeAsignado.getEquipajeId().value());

    }

    private List<DomainEvent> events(){
        return List.of(new PasajeroAsignado(
                new NombrePasajero("Mauricio"),
                new Email("mauricio@unicauca.edu.co"),
                new NumeroCelular(78958)
        ));
    }
}