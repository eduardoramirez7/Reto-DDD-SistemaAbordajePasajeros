package avion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreAerolinea implements ValueObject<String> {

    private final String value;

    public NombreAerolinea(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank())
            throw new IllegalArgumentException("El campo email no puede estar en blanco");
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NombreAerolinea that = (NombreAerolinea) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
