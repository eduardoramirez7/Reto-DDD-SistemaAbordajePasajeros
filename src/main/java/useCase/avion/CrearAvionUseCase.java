package useCase.avion;

import avion.Avion;
import avion.commands.CrearAvion;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearAvionUseCase extends UseCase<RequestCommand<CrearAvion>, ResponseEvents>{
    @Override
    public void executeUseCase(RequestCommand<CrearAvion> crearAvionRequestCommand) {
        var command = crearAvionRequestCommand.getCommand();
        var avion = new Avion(command.getAvionId(),command.getNombreAerolinea(), command.getClaseAvion(), command.getCodigoVuelo());
        emit().onResponse(new ResponseEvents(avion.getUncommittedChanges()));
    }
}
