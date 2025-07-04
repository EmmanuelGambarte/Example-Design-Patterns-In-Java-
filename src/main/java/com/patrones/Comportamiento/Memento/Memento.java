package com.patrones.Comportamiento.Memento;

// =============================
// ✅ Aplicando el patrón Memento
// =============================

// Memento: guarda un snapshot del estado del editor
class Memento {
    private final String estado;

    public Memento(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}