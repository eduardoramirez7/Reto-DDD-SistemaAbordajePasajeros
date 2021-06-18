package chekin.values;

import co.com.sofka.domain.generic.Identity;

public class InformacionVueloId extends Identity {

    public InformacionVueloId(){

    }
    private InformacionVueloId(String id){
        super(id);
    }

    public static InformacionVueloId of(String id) {
        return new InformacionVueloId(id);
    }

}
