package com.patrones.Comportamiento.TemplateMethod;

// ============================
// 🎯 Main con ambos ejemplos
// ============================
public class Main {
    public static void main(String[] args) {

        System.out.println("=== Sin patrón Template Method ===");
        // Sin patrón, duplicaríamos código para café y té (no mostrado aquí)

        System.out.println("\n=== Usando patrón Template Method ===");
        BebidaCaliente cafe = new CafeTM();
        cafe.prepararReceta(); // Ejecuta el algoritmo definido, con pasos personalizados

        System.out.println();

        BebidaCaliente te = new TeTM();
        te.prepararReceta(); // Ejecuta el algoritmo para té, con sus pasos
    }
}