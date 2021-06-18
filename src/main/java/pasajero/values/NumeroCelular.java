package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroCelular implements ValueObject<Integer> {

    private final Integer value;

    public NumeroCelular(Integer value) {
        this.value = Objects.requireNonNull(value);
        //TODO: realizar las validaciones
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroCelular that = (NumeroCelular) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
