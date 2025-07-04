package com.patrones.SOLID.InterfaceSegregation;

// ❌ Jaguar implementa IFelino, pero no tiene sentido que maúlle
public class Jaguar implements IFelino {

    @Override
    public void rugir() {
        System.out.println("El jaguar ruge!");
    }

    @Override
    public void cazar() {
        System.out.println("El jaguar caza!");
    }

    @Override
    public void maullar() {
        // ⚠️ Jaguar no maúlla: estamos forzando una implementación sin sentido
        System.out.println("Error, El jaguar no maulla");
    }

}
