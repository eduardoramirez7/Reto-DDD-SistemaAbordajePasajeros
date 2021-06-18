package chekin.values;

import avion.values.PilotoId;
import co.com.sofka.domain.generic.Identity;

public class SalaEsperaId extends Identity {
    public SalaEsperaId(){

    }
    private SalaEsperaId(String id){
        super(id);
    }

    public static SalaEsperaId of(String id) {
        return new SalaEsperaId(id);
    }
}
