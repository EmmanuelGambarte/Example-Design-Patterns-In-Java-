package com.patrones.SimpleFactory;

public class Pizzeria {

    // Esta clase implementa el patrón Simple Factory.

    // Permite encapsular la lógica de creación de objetos,
    // facilitando cambios futuros y reduciendo el acoplamiento.

    public Pizza crearPizzaChica() {
        return new Pizza(6);
    }

    public Pizza crearPizzaMediana() {
        return new Pizza(8);
    }

    public Pizza crearPizzaGrande() {
        return new Pizza(12);
    }
}
