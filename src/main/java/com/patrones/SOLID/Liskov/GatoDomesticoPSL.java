package com.patrones.SOLID.Liskov;

public class GatoDomesticoPSL implements IFelinoPSL {

    @Override
    public void emitirSonido() {
        System.out.println("El gato maúlla!");
    }

    @Override
    public void cazar() {
        System.out.println("El gato juega con la presa!");
    }
}
