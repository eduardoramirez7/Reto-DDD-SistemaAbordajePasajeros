package chekin.values;

import co.com.sofka.domain.generic.Identity;

public class RecepcionistaId extends Identity {
    public RecepcionistaId(){

    }
    private RecepcionistaId(String id){
        super(id);
    }

    public static RecepcionistaId of(String id) {
        return new RecepcionistaId(id);
    }
}
