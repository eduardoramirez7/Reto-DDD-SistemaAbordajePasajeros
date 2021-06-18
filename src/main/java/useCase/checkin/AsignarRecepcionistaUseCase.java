package useCase.checkin;

import avion.Avion;
import chekin.CheckIn;
import chekin.commands.AsignarRecepcionista;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AsignarRecepcionistaUseCase extends UseCase<RequestCommand<AsignarRecepcionista>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsignarRecepcionista> asignarRecepcionistaRequestCommand) {
        var command = asignarRecepcionistaRequestCommand.getCommand();
        var checkin = CheckIn.from(command.getCheckInId(),retrieveEvents(command.getCheckInId().value()));
        checkin.asignarRecepcionista(command.getRecepcionistaId(), command.getNombreRecepcionista());
        emit().onResponse(new ResponseEvents(checkin.getUncommittedChanges()));
    }
}
