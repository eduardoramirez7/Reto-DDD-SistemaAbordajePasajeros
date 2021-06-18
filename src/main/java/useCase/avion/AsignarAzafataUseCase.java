package useCase.avion;

import avion.Avion;
import avion.commands.AsignarAzafata;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AsignarAzafataUseCase extends UseCase<RequestCommand<AsignarAzafata>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AsignarAzafata> asignarAzafataRequestCommand) {
        var command = asignarAzafataRequestCommand.getCommand();
        var avion = Avion.from(command.getAvionId(), retrieveEvents(command.getAvionId().value()));

        if(avion.cantidadAzafatas() > 3){
            throw new IllegalArgumentException("La cantidad de azafatas por avion no debe ser mayor a 3");
        }
        avion.asignarAzafata(command.getAzafataId(), command.getNombreAzafata(), command.getNumeroPasaporte(), command.getNumeroIdiomas(), command.getEdadAzafata());
        emit().onResponse(new ResponseEvents(avion.getUncommittedChanges()));

    }
}
