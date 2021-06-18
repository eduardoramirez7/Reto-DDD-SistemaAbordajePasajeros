package chekin;

import chekin.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class InformacionVuelo extends Entity<InformacionVueloId> {

    private Vuelo vuelo;
    private Hora hora;
    private Destino destino;
    private Estado estado;
    private Puerta puerta;

    public InformacionVuelo(InformacionVueloId entityId, Vuelo vuelo, Hora hora, Destino destino, Estado estado, Puerta puerta) {
        super(entityId);
        this.vuelo = vuelo;
        this.hora = hora;
        this.destino = destino;
        this.estado = estado;
        this.puerta = puerta;
    }

    public void actualizarVuelo(Vuelo vuelo){
        this.vuelo = Objects.requireNonNull(vuelo);
    }
    public void actualizarHora(Hora hora){
        this.hora = Objects.requireNonNull(hora);
    }
    public void actualizarDestino(Destino destino){
        this.destino = Objects.requireNonNull(destino);
    }
    public void actualizarEstado(Estado estado){
        this.estado = Objects.requireNonNull(estado);
    }
    public void actualizarPuerta(Puerta puerta){
        this.puerta = Objects.requireNonNull(puerta);
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Hora getHora() {
        return hora;
    }

    public Destino getDestino() {
        return destino;
    }

    public Estado getEstado() {
        return estado;
    }

    public Puerta getPuerta() {
        return puerta;
    }
}
