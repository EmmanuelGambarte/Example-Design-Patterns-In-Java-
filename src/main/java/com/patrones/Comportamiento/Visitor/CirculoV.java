package com.patrones.Comportamiento.Visitor;

// Clase Circulo que implementa IElemento para permitir visitantes
class CirculoV implements IElemento {
    int radio;

    CirculoV(int radio) {
        this.radio = radio;
    }

    // Permite que un visitante "visite" este objeto
    @Override
    public void aceptar(IVisitor visitor) {
        visitor.visitarCirculo(this);
    }
}