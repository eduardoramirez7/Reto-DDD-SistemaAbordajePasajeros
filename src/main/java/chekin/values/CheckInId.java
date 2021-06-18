package chekin.values;

import avion.values.AvionId;
import co.com.sofka.domain.generic.Identity;

public class CheckInId extends Identity {

    public CheckInId(){

    }

    private CheckInId(String id){
        super(id);
    }

    public static CheckInId of(String id) {
        return new CheckInId(id);
    }
}
