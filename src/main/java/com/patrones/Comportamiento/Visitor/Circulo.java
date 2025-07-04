package com.patrones.Comportamiento.Visitor;

// Clase Circulo sin patrón Visitor, hereda de Figura
class Circulo extends Figura {
    int radio;

    Circulo(int radio) {
        super("Círculo");
        this.radio = radio;
    }
}