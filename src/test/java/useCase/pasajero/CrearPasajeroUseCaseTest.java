package useCase.pasajero;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pasajero.commands.CrearPasajero;
import pasajero.events.PasajeroAsignado;
import pasajero.values.Email;
import pasajero.values.NombrePasajero;
import pasajero.values.NumeroCelular;
import pasajero.values.PasajeroId;

class CrearPasajeroUseCaseTest {

    private CrearPasajeroUseCase crearPasajeroUseCase;

    @BeforeEach
    public void setup(){
        crearPasajeroUseCase = new CrearPasajeroUseCase();
    }

    @Test
    void executeUseCase() {

//arrange
        var command = new CrearPasajero(
                new PasajeroId(1234),
                new NombrePasajero("Eduardo"),
                new Email("eduar1079@gmail.com"),
                new NumeroCelular(12344)
        );
        var valor = String.valueOf(5);
        //act
        var response = UseCaseHandler.getInstance().syncExecutor(
                crearPasajeroUseCase, new RequestCommand<>(command)
        ).orElseThrow();
        var events = response.getDomainEvents();

        //assert
        PasajeroAsignado pasajeroCreado = (PasajeroAsignado) events.get(0);
        Assertions.assertEquals("Eduardo", pasajeroCreado.getNombrePasajero().value());
        Assertions.assertEquals("eduar1079@gmail.com", pasajeroCreado.getEmail().value());
        Assertions.assertEquals(12344, pasajeroCreado.getNumeroCelular().value());

    }
}