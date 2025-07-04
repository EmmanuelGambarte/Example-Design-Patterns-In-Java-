package com.patrones.Comportamiento.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sin patrón Iterador ===");
        ColeccionSimple coleccionSimple = new ColeccionSimple();
        coleccionSimple.agregar("Rojo");
        coleccionSimple.agregar("Verde");
        coleccionSimple.agregar("Azul");

        coleccionSimple.imprimirElementos();

        System.out.println("\n=== Con patrón Iterador ===");
        ColeccionConcreta coleccion = new ColeccionConcreta();
        coleccion.agregar("Rojo");
        coleccion.agregar("Verde");
        coleccion.agregar("Azul");

        IIterador iterador = coleccion.crearIterador();

        // Recorremos la colección usando el iterador
        while (iterador.tieneSiguiente()) {
            System.out.println("Elemento: " + iterador.siguiente());
        }
    }
}