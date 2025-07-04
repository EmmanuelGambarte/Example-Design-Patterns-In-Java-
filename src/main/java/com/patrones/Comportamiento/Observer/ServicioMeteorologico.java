package com.patrones.Comportamiento.Observer;

import java.util.ArrayList;
import java.util.List;

// Clase concreta del sujeto (observable)
class ServicioMeteorologico implements ISujeto {
    private List<IObservador> observadores = new ArrayList<>();
    private String clima;

    @Override
    public void registrar(IObservador o) {
        observadores.add(o);
    }

    @Override
    public void remover(IObservador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (IObservador o : observadores) {
            o.actualizar(clima);
        }
    }

    public void setClima(String nuevoClima) {
        this.clima = nuevoClima;
        notificarObservadores();
    }
}
