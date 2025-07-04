package com.patrones.Comportamiento.Visitor;

// Clase Cuadrado sin patrón Visitor, hereda de Figura
class Cuadrado extends Figura {
    int lado;

    Cuadrado(int lado) {
        super("Cuadrado");
        this.lado = lado;
    }
}