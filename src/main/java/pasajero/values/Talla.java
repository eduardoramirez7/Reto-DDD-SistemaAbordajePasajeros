package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Talla implements ValueObject<String> {

    private final String value;

    public Talla(String value) {
        this.value = value;
        if(this.value.isBlank())
            throw new IllegalArgumentException("El campo talla no puede estar en blanco");
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Talla talla = (Talla) o;
        return Objects.equals(value, talla.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
