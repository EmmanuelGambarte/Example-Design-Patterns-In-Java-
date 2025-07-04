package com.patrones.Comportamiento.TemplateMethod;

// Clase abstracta que define el esqueleto del algoritmo (template method)
abstract class BebidaCaliente {
    // Método template que define el flujo del algoritmo y no puede ser modificado
    // por subclases (final)
    public final void prepararReceta() {
        hervirAgua();
        prepararBebida(); // paso abstracto a implementar en subclases
        servir();
        agregarComplemento(); // paso abstracto a implementar en subclases
    }

    // Método concreto común a todas las subclases
    private void hervirAgua() {
        System.out.println("Hirviendo agua");
    }

    // Método concreto común a todas las subclases
    private void servir() {
        System.out.println("Sirviendo en la taza");
    }

    // Paso abstracto que las subclases deben definir
    protected abstract void prepararBebida();

    // Paso abstracto que las subclases deben definir
    protected abstract void agregarComplemento();
}