package com.patrones.Estructurales.Decorator;

// Clase que representa café con leche (sin usar patrón Decorator)
public class CafeConLeche {
    public String descripcion = "Café con leche";

    public String getDescripcion() {
        return descripcion;
    }

    public double costo() {
        return 1.5;
    }
}