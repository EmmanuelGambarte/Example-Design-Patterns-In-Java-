package com.patrones.SOLID.InterfaceSegregation;

// ✅ Jaguar solo implementa lo que realmente necesita
public class JaguarIS implements IFelinoSalvajeIS {

    @Override
    public void rugir() {
        System.out.println("El jaguar ruge!");
    }

    @Override
    public void cazar() {
        System.out.println("El jaguar caza!");
    }
}
