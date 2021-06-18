package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Destino implements ValueObject<String> {

    private final String value;

    public Destino(String value) {
        //TODO: reglas de negocio y validaciones

        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank())
            throw new IllegalArgumentException("El campo destino no puede estar en blanco");
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destino destino = (Destino) o;
        return Objects.equals(value, destino.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
