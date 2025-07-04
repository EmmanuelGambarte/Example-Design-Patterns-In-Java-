package com.patrones.Estructurales.Composite;

// ❌ Clase simple que representa un archivo sin aplicar el patrón Composite
public class Archivo {

    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println("Archivo: " + nombre);
    }
}
