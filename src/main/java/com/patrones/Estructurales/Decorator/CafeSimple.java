package com.patrones.Estructurales.Decorator;

// Clase base que implementa la interfaz
public class CafeSimple implements ICafe {
    @Override
    public String getDescripcion() {
        return "Café simple";
    }

    @Override
    public double costo() {
        return 1.0;
    }
}
