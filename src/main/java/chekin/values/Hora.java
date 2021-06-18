package chekin.values;

import co.com.sofka.domain.generic.ValueObject;

import java.sql.Time;

public class Hora implements ValueObject<Time> {

    private final Time value;

    public Hora(Time value) {
        this.value = value;
    }

    @Override
    public Time value() {
        return value;
    }
}
