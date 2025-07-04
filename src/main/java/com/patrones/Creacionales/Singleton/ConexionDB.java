package com.patrones.Creacionales.Singleton;

// Ejemplo MAL implementado de Singleton (NO asegura una única instancia)
public class ConexionDB {

    // Constructor público permite crear múltiples instancias fuera de la clase
    public ConexionDB() {
    }

    // Cada vez que se llama, se crea una nueva instancia, rompiendo el patrón
    // Singleton
    public static ConexionDB obtenerConexionDB() {
        return new ConexionDB(); // ❌ NO es Singleton: se crean múltiples objetos
    }
}
