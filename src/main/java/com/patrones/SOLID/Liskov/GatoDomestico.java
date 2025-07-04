package com.patrones.SOLID.Liskov;

public class GatoDomestico extends Jaguar {

    public void rugir() {
        // ❌ comportamiento inesperado o lanzamos excepción
        System.out.println("Error, El gato doméstico no puede rugir");
    }

    @Override
    public void cazar() {
        System.out.println("El gato doméstico juega con la comida en lugar de cazar");
    }
}
