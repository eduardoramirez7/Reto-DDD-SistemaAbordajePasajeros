package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.values.Email;

public class EmailActualizado extends DomainEvent {

    private final Email email;

    public EmailActualizado(Email email) {
        super("sofka.pasajero.emailactualizado");
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
