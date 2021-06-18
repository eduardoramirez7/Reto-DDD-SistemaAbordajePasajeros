package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nacionalidad implements ValueObject<String> {

    private final String value;

    public Nacionalidad(String value) {
        this.value = value;
        if(this.value.isBlank())
            throw new IllegalArgumentException("El campo nacionalidad no puede estar en blanco");
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nacionalidad that = (Nacionalidad) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
