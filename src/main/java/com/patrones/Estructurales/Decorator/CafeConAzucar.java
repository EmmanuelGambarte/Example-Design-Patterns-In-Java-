package com.patrones.Estructurales.Decorator;

// Decorador concreto: agrega azúcar al café
public class CafeConAzucar extends CafeDecorator {

    public CafeConAzucar(ICafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafeDecorado.getDescripcion() + ", con azúcar";
    }

    @Override
    public double costo() {
        return cafeDecorado.costo() + 0.2;
    }
}
