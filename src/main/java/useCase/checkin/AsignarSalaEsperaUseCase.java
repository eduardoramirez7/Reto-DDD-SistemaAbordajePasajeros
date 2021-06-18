package useCase.checkin;

import chekin.CheckIn;
import chekin.commands.AsignarSalaEspera;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AsignarSalaEsperaUseCase extends UseCase<RequestCommand<AsignarSalaEspera>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AsignarSalaEspera> asignarSalaEsperaRequestCommand) {
        var command = asignarSalaEsperaRequestCommand.getCommand();
        var checkin = CheckIn.from(command.getCheckInId(),retrieveEvents(command.getCheckInId().value()));
        checkin.asignarSalaEspera(command.getSalaEsperaId(),command.getTipoSala());
        emit().onResponse(new ResponseEvents(checkin.getUncommittedChanges()));
    }
}
