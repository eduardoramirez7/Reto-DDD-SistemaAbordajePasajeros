package pasajero.values;

import co.com.sofka.domain.generic.Identity;

public class PasajeroId extends Identity {

    public PasajeroId(){

    }

    private PasajeroId(String id){
        super(id);

    }

    public static PasajeroId of(String id) {
        return new PasajeroId(id);
    }
}
