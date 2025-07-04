package com.patrones.Comportamiento.Visitor;

// Clase Cuadrado que implementa IElemento para permitir visitantes
class CuadradoV implements IElemento {
    int lado;

    CuadradoV(int lado) {
        this.lado = lado;
    }

    // Permite que un visitante "visite" este objeto
    @Override
    public void aceptar(IVisitor visitor) {
        visitor.visitarCuadrado(this);
    }
}