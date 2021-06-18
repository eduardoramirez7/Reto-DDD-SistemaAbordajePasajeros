package useCase.pasajero;


import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import pasajero.Pasajero;
import pasajero.commands.AsignarTiquete;


public class AsignarTiqueteUseCase extends UseCase<RequestCommand<AsignarTiquete>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AsignarTiquete> asignarTiqueteRequestCommand) {
        var command = asignarTiqueteRequestCommand.getCommand();
        var pasajero = Pasajero.from(command.getPasajeroId(), retrieveEvents(command.getPasajeroId().value()));

        pasajero.asignarTiquete(command.getTiqueteId(),command.getAsiento(), command.getOrigen(), command.getDestino(), command.getHoraVuelo());
        emit().onResponse(new ResponseEvents(pasajero.getUncommittedChanges()));

    }
}
