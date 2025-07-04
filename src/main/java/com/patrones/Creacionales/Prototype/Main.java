package com.patrones.Creacionales.Prototype;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sin aplicar Prototype ===");

        // ✅ Creamos una computadora base de forma tradicional
        Computadora base = new Computadora("Intel i7", 16, 512);
        base.mostrar();

        // ❌ Creamos una copia manualmente repitiendo datos
        Computadora copia = new Computadora("Intel i7", 16, 512);
        copia.mostrar();

        System.out.println("---------------//////////////////////---------------------");

        System.out.println("=== Aplicando Prototype ===");

        // ✅ Creamos una computadora base usando la versión que implementa Prototype
        ComputadoraPrototype basePrototype = new ComputadoraPrototype("Intel i7", 16, 512);
        basePrototype.mostrar();

        // ✅ Clonamos la computadora usando el método clonar()
        ComputadoraPrototype clon = basePrototype.clonar();
        clon.mostrar();
    }
}
