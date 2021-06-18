package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.sql.Time;
import java.util.Objects;

public class HoraVuelo implements ValueObject<Time> {

    private final Time value;

    public HoraVuelo(Time value) {
        this.value = value;
    }

    @Override
    public Time value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoraVuelo horaVuelo = (HoraVuelo) o;
        return Objects.equals(value, horaVuelo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
