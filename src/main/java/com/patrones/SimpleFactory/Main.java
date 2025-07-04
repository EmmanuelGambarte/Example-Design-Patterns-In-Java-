package com.patrones.SimpleFactory;

public class Main {
    public static void main(String[] args) {

        // --- Sin usar Simple Factory ---
        // El cliente conoce directamente la clase Pizza y sus detalles de construcción.
        Pizza pizzaPeperoni = new Pizza(8);
        System.out.println("Sin usar Simple Factory: " + pizzaPeperoni);

        // --- Usando Simple Factory ---
        // El cliente delega la creación del objeto a la fábrica (Pizzeria),
        // y no necesita saber cómo se construye internamente la Pizza.
        Pizzeria pizzeriaCF = new Pizzeria();
        Pizza pizzaPeperoniChica = pizzeriaCF.crearPizzaChica();
        System.out.println("Usando Simple Factory: " + pizzaPeperoniChica);
    }
}