package avion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroIdiomas implements ValueObject<Integer> {

    private final Integer value;

    public NumeroIdiomas(Integer value) {
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
        NumeroIdiomas that = (NumeroIdiomas) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
