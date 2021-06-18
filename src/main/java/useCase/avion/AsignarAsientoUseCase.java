package useCase.avion;

import avion.Avion;
import avion.commands.AsignarAsiento;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AsignarAsientoUseCase extends UseCase<RequestCommand<AsignarAsiento>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsignarAsiento> asignarAsientoRequestCommand) {
        var command = asignarAsientoRequestCommand.getCommand();
        var avion = Avion.from(command.getAvionId(), retrieveEvents(command.getAvionId().value()));

        if(avion.cantidadAsientos() < 0 || avion.cantidadAsientos() > 538){
            throw new IllegalArgumentException("La cantidad de asientos disponibles esta entre 1 a 538");
        }
        avion.asignarAsiento(command.getAsientoId(),command.getFila(),command.getLetra(),command.getClasePuesto());
        emit().onResponse(new ResponseEvents(avion.getUncommittedChanges()));
    }
}
