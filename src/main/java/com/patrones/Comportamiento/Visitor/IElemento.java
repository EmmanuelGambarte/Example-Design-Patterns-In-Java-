package com.patrones.Comportamiento.Visitor;

// Interfaz Elemento que acepta un visitante
// Cada elemento debe implementar el método aceptar para recibir un visitante
interface IElemento {
    void aceptar(IVisitor visitor);
}