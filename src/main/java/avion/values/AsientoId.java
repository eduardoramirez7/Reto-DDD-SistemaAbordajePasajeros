package avion.values;

import co.com.sofka.domain.generic.Identity;

public class AsientoId extends Identity {

    public AsientoId(){

    }

    private AsientoId(String id){
        super(id);
    }

    public static AsientoId of(String id) {
        return new AsientoId(id);
    }

}
