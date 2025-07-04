package com.patrones.Comportamiento.Iterator;

// Implementación concreta del iterador
class IteradorConcreto implements IIterador {
    private ColeccionConcreta coleccion;
    private int posicion = 0;

    public IteradorConcreto(ColeccionConcreta coleccion) {
        this.coleccion = coleccion;
    }

    // Indica si quedan más elementos para iterar
    @Override
    public boolean tieneSiguiente() {
        return posicion < coleccion.size();
    }

    // Devuelve el siguiente elemento y avanza la posición
    @Override
    public String siguiente() {
        String elemento = coleccion.get(posicion);
        posicion++;
        return elemento;
    }
}