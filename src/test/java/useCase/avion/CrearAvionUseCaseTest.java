package useCase.avion;

import avion.commands.CrearAvion;
import avion.events.AvionCreado;
import avion.values.AvionId;
import avion.values.ClaseAvion;
import avion.values.CodigoVuelo;
import avion.values.NombreAerolinea;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class CrearAvionUseCaseTest {

    private CrearAvionUseCase crearAvionUseCase;

    @BeforeEach
    public void setup(){
        crearAvionUseCase = new CrearAvionUseCase();
    }

    @Test
    void executeUseCase() {

        //arrange
        var commmand = new CrearAvion(
                AvionId.of("14895"),
                new NombreAerolinea("Avianca"),
                new ClaseAvion("Comercial"),
                new CodigoVuelo("D789J")
        );

        var response = UseCaseHandler.getInstance()
                .syncExecutor(crearAvionUseCase, new RequestCommand<>(commmand))
                .orElseThrow();
        var events = response.getDomainEvents();

        AvionCreado avionCreado = (AvionCreado) events.get(0);
        Assertions.assertEquals("Avianca", avionCreado.getNombreAerolinea().value());
        Assertions.assertEquals("Comercial", avionCreado.getClaseAvion().value());
        Assertions.assertEquals("D789J", avionCreado.getCodigoVuelo().value());

    }
}