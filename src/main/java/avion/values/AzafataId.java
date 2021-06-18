package avion.values;

import co.com.sofka.domain.generic.Identity;

public class AzafataId extends Identity {

    public AzafataId(){

    }

    private AzafataId(String id){
        super(id);
    }

    public static AzafataId of(String id) {
        return new AzafataId(id);
    }

}
