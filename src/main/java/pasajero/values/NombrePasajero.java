package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombrePasajero implements ValueObject<String> {

    private final String value;

    public NombrePasajero(String value) {
        this.value = Objects.requireNonNull(value);
        //TODO: realizar todas las validaciones-reglas del negocio
        if(value.length() < 5 || value.length() > 60) {
            throw new IllegalArgumentException("El nombre debe tener entre 5 y 60 caracteres");
        }
        if(this.value.isBlank()) {
            throw new IllegalArgumentException("El campo asiento no puede estar en blanco");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NombrePasajero that = (NombrePasajero) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
