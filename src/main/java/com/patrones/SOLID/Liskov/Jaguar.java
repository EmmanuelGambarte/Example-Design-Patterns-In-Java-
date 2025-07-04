package com.patrones.SOLID.Liskov;

public class Jaguar implements IFelinoPSL {

    @Override
    public void emitirSonido() {
        System.out.println("El jaguar ruge!");
    }

    @Override
    public void cazar() {
        System.out.println("El jaguar caza!");
    }
}
