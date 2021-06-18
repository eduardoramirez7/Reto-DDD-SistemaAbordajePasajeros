package useCase.checkin;

import chekin.CheckIn;
import chekin.commands.AsignarInformacionVuelo;
import chekin.commands.AsignarRecepcionista;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AsignarInformacionVueloUseCase extends UseCase<RequestCommand<AsignarInformacionVuelo>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsignarInformacionVuelo> asignarInformacionVueloRequestCommand) {

        var command = asignarInformacionVueloRequestCommand.getCommand();
        var checkin = CheckIn.from(command.getCheckInId(),retrieveEvents(command.getCheckInId().value()));
        checkin.asignarInformacionVuelo(command.getInformacionVueloId(), command.getVuelo(), command.getHora(),command.getDestino(), command.getEstado(), command.getPuerta());
        emit().onResponse(new ResponseEvents(checkin.getUncommittedChanges()));

    }
}
