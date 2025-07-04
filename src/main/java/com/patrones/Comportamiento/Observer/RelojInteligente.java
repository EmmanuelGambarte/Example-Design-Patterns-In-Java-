package com.patrones.Comportamiento.Observer;

// Observador concreto: reloj inteligente
class RelojInteligente implements IObservador {
    @Override
    public void actualizar(String clima) {
        System.out.println("Reloj recibe clima: " + clima);
    }
}
