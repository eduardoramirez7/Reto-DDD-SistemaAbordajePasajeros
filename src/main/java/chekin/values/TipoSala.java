package chekin.values;

import co.com.sofka.domain.generic.ValueObject;

public class TipoSala implements ValueObject<String>{

    private final String value;

    public TipoSala(String value) {
        this.value = value;
        if(this.value.isBlank())
            throw new IllegalArgumentException("El campo tipo sala no puede estar en blanco");

    }

    @Override
    public String value() {
        return null;
    }
}
