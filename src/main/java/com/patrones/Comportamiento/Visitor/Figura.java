package com.patrones.Comportamiento.Visitor;

// ================================
// ❌ Sin patrón Visitor
// Clase base para representar figuras genéricas
// ================================
abstract class Figura {
    String tipo;

    Figura(String tipo) {
        this.tipo = tipo;
    }
}