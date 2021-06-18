package useCase.avion;

import avion.Avion;
import avion.Piloto;
import avion.commands.AsignarPiloto;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AsignarPilotoUseCase extends UseCase<RequestCommand<AsignarPiloto>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsignarPiloto> asignarPilotoRequestCommand) {
        var command = asignarPilotoRequestCommand.getCommand();
        var avion = Avion.from(command.getAvionId(),retrieveEvents(command.getAvionId().value()));

        if(avion.cantidadPilotos() > 4){
            throw new IllegalArgumentException("La cantidad de pilotos por avion no debe ser mayor a 4");
        }
        avion.asignarPiloto(command.getEntityId(),command.getNombrePiloto(),command.getTipoLicencia(), command.getHorasVuelo());
        emit().onResponse(new ResponseEvents(avion.getUncommittedChanges()));
    }
}
