package pasajero.values;

import co.com.sofka.domain.generic.Identity;

public class PasaporteId extends Identity {

    public PasaporteId(){

    }

    private PasaporteId(String id){
        super(id);
    }

    public static PasaporteId of(String id) {
        return new PasaporteId(id);
    }

}
