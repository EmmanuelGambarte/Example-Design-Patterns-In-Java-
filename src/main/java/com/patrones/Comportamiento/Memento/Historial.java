package com.patrones.Comportamiento.Memento;

import java.util.Stack;

// Cuidador: mantiene el historial de estados (mementos)
class Historial {
    private Stack<Memento> historial = new Stack<>();

    public void guardarEstado(Memento memento) {
        historial.push(memento);
    }

    public Memento deshacer() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return new Memento("");
    }
}