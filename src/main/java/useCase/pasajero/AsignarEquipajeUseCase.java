package useCase.pasajero;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import pasajero.Pasajero;
import pasajero.commands.AsignarEquipaje;

public class AsignarEquipajeUseCase extends UseCase<RequestCommand<AsignarEquipaje>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsignarEquipaje> asignarEquipajeRequestCommand) {
        var command = asignarEquipajeRequestCommand.getCommand();
        var pasajero = Pasajero.from(command.getPasajeroId(), retrieveEvents(command.getPasajeroId().value()));

        pasajero.asignarEquipaje(command.getEquipajeId(), command.getPeso(), command.getTalla());
        emit().onResponse(new ResponseEvents(pasajero.getUncommittedChanges()));
    }
}
