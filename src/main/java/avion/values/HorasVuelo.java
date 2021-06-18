package avion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class HorasVuelo implements ValueObject<Integer> {

    private final Integer value;

    public HorasVuelo(Integer value) {
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
        HorasVuelo that = (HorasVuelo) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
