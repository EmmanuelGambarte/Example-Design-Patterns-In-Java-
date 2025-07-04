package com.patrones.Creacionales.Prototype;

/**
 * Interfaz del patrón Prototype.
 * Define el método clonar() que deben implementar las clases que se pueden
 * copiar.
 */
public interface IClonablePrototype {

    // Devuelve una copia del objeto
    IClonablePrototype clonar();
}
