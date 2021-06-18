package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Asiento implements ValueObject<String> {

    private final String value;

    public Asiento(String value) {
        //TODO: reglas de negocio y validaciones

        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank())
            throw new IllegalArgumentException("El campo asiento no puede estar en blanco");
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asiento asiento = (Asiento) o;
        return Objects.equals(value, asiento.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
