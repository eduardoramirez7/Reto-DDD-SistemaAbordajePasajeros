package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class FechaExpedicion implements ValueObject<Date> {

    private final Date value;

    public FechaExpedicion(Date value) {
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
        FechaExpedicion that = (FechaExpedicion) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
