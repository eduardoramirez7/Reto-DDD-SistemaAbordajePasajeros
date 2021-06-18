package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class FechaVencimiento implements ValueObject<Date> {

    private final Date value;

    public FechaVencimiento(Date value) {
        this.value = value;
    }

    @Override
    public Date value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaVencimiento that = (FechaVencimiento) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
