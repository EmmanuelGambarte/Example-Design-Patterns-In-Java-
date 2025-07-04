package com.patrones.Estructurales.Decorator;

public class CafeConLecheDecorator extends CafeDecorator {

    public CafeConLecheDecorator(ICafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafeDecorado.getDescripcion() + ", con leche";
    }

    @Override
    public double costo() {
        return cafeDecorado.costo() + 0.5;
    }
}
