package chekin.values;

import co.com.sofka.domain.generic.ValueObject;

public class Estado implements ValueObject<String> {

    private final String value;

    public Estado(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
