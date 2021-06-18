package pasajero.values;

import co.com.sofka.domain.generic.Identity;

public class EquipajeId extends Identity {

    public EquipajeId(){

    }

    private EquipajeId(String id){
        super(id);
    }

    public static EquipajeId of(String id) {
        return new EquipajeId(id);
    }

}
