package com.patrones.Comportamiento.Iterator;

import java.util.ArrayList;
import java.util.List;

// Implementación concreta de la colección que implementa IColeccion
class ColeccionConcreta implements IColeccion {
    private List<String> elementos = new ArrayList<>();

    public void agregar(String elemento) {
        elementos.add(elemento);
    }

    // Devuelve un iterador para esta colección
    @Override
    public IIterador crearIterador() {
        return new IteradorConcreto(this);
    }

    public String get(int index) {
        return elementos.get(index);
    }

    public int size() {
        return elementos.size();
    }
}