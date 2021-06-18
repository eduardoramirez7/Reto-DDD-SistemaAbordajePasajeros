package chekin;

import chekin.values.NombreRecepcionista;
import chekin.values.RecepcionistaId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Recepcionista extends Entity<RecepcionistaId> {

    private NombreRecepcionista nombreRecepcionista;

    public Recepcionista(RecepcionistaId entityId, NombreRecepcionista nombreRecepcionista) {
        super(entityId);
        this.nombreRecepcionista = nombreRecepcionista;
    }

    public void actualizarNombreRecepcionista(NombreRecepcionista nombreRecepcionista){
        this.nombreRecepcionista = Objects.requireNonNull(nombreRecepcionista);
    }

    public NombreRecepcionista getNombreRecepcionista() {
        return nombreRecepcionista;
    }
}
