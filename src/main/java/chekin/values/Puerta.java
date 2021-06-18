package chekin.values;

import co.com.sofka.domain.generic.ValueObject;

public class Puerta implements ValueObject<String> {

    private final String value;

    public Puerta(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
