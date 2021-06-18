package avion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Fila implements ValueObject<Integer> {

    private final Integer value;

    public Fila(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fila fila = (Fila) o;
        return Objects.equals(value, fila.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
