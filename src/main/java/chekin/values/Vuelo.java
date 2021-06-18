package chekin.values;

import co.com.sofka.domain.generic.ValueObject;

public class Vuelo implements ValueObject<String> {

    private final String value;

    public Vuelo(String value) {
        this.value = value;
        if(this.value.isBlank())
            throw new IllegalArgumentException("El campo cantidad de personas no puede estar en blanco");
    }

    @Override
    public String value() {
        return value;
    }
}
