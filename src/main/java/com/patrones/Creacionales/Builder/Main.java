package com.patrones.Creacionales.Builder;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Sin aplicar Builder ===");
        // 🔧 Se crea el objeto con un constructor que tiene muchos parámetros
        // Esto puede volverse difícil de leer y mantener
        Computadora computadora1 = new Computadora("Intel i7", 16, 512, true);
        System.out.println(computadora1);

        System.out.println("-----------/////////////////----------------");

        System.out.println("\n=== Aplicando Builder ===");
        // ✅ Se crea el objeto paso a paso, usando el patrón Builder
        // Es más flexible y legible, sobre todo cuando hay muchos atributos
        Computadora computadora2 = new ComputadoraBuilder()
                .setProcesador("AMD Ryzen 7")
                .setRam(32)
                .setDisco(1024)
                .setTieneGpu(true)
                .build();

        System.out.println(computadora2);
    }
}
