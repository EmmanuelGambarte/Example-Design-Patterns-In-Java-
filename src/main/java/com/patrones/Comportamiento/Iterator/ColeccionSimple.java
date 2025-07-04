package com.patrones.Comportamiento.Iterator;

import java.util.ArrayList;
import java.util.List;

// Clase sin patrón: Colección simple con método para imprimir elementos directamente
class ColeccionSimple {
    private List<String> elementos = new ArrayList<>();

    public void agregar(String elemento) {
        elementos.add(elemento);
    }

    public void imprimirElementos() {
        for (int i = 0; i < elementos.size(); i++) {
            System.out.println("Elemento: " + elementos.get(i));
        }
    }
}