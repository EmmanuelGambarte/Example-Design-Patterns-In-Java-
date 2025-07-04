package com.patrones.Estructurales.Decorator;

// Decorador abstracto que implementa la interfaz y tiene un campo para el componente a decorar
public abstract class CafeDecorator implements ICafe {
    protected ICafe cafeDecorado;

    public CafeDecorator(ICafe cafe) {
        this.cafeDecorado = cafe;
    }

    @Override
    public String getDescripcion() {
        return cafeDecorado.getDescripcion();
    }

    @Override
    public double costo() {
        return cafeDecorado.costo();
    }
}
