package chekin.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantidadPersonasPorFila implements ValueObject<Integer> {

    private final Integer value;

    public CantidadPersonasPorFila(Integer value) {
        this.value = value;

    }


    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CantidadPersonasPorFila that = (CantidadPersonasPorFila) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
