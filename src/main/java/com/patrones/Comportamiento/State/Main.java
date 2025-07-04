package com.patrones.Comportamiento.State;

// ==============================
// 🎯 Main que compara ambos casos
// ==============================
public class Main {
    public static void main(String[] args) {

        System.out.println("=== ❌ Sin aplicar patrón State ===");
        MaquinaExpendedoraSimple simple = new MaquinaExpendedoraSimple();
        simple.entregarProducto(); // No hay moneda
        simple.insertarMoneda(); // Inserta moneda
        simple.entregarProducto(); // Entrega producto
        simple.entregarProducto(); // No hay moneda ahora

        System.out.println("\n=== ✅ Aplicando patrón State ===");
        MaquinaExpendedora maquina = new MaquinaExpendedora();
        maquina.entregarProducto(); // No hay moneda
        maquina.insertarMoneda(); // Inserta moneda, cambia estado
        maquina.entregarProducto(); // Entrega producto, cambia estado
        maquina.entregarProducto(); // No hay moneda ahora
    }
}