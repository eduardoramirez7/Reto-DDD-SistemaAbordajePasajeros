package chekin.events;

import chekin.values.Hora;
import chekin.values.InformacionVueloId;
import co.com.sofka.domain.generic.DomainEvent;

public class HoraActualizada extends DomainEvent {

    private final InformacionVueloId informacionVueloId;
    private final Hora hora;

    public HoraActualizada(InformacionVueloId informacionVueloId, Hora hora) {
        super("sofka.checkin.horaactualizada");
        this.informacionVueloId = informacionVueloId;
        this.hora = hora;
    }

    public InformacionVueloId getInformacionVueloId() {
        return informacionVueloId;
    }

    public Hora getHora() {
        return hora;
    }
}
