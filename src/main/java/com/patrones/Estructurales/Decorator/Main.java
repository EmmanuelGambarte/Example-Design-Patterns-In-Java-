package com.patrones.Estructurales.Decorator;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== ❌ Sin aplicar Decorator ===");
        // Sin usar Decorator: cada variante es una clase distinta (poco flexible)
        CafeSimple cafeSimple = new CafeSimple();
        System.out.println(cafeSimple.getDescripcion() + " - $" + cafeSimple.costo());

        CafeConLeche cafeConLeche = new CafeConLeche();
        System.out.println(cafeConLeche.getDescripcion() + " - $" + cafeConLeche.costo());

        System.out.println("\n=== ✅ Aplicando Decorator ===");

        // Café simple (base)
        ICafe cafeBase = new CafeSimple();

        // Decorador que agrega leche
        ICafe cafeConLecheDecorado = new CafeConLecheDecorator(cafeBase);

        // Decorador que agrega azúcar encima del anterior
        ICafe cafeCompleto = new CafeConAzucar(cafeConLecheDecorado);

        System.out.println(cafeBase.getDescripcion() + " - $" + cafeBase.costo());
        System.out.println(cafeConLecheDecorado.getDescripcion() + " - $" + cafeConLecheDecorado.costo());
        System.out.println(cafeCompleto.getDescripcion() + " - $" + cafeCompleto.costo());
    }
}
