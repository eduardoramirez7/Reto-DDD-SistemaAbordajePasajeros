package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Peso implements ValueObject<Float> {

    private final Float value;

    public Peso(Float value) {
        this.value = value;
    }

    @Override
    public Float value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peso peso = (Peso) o;
        return Objects.equals(value, peso.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
