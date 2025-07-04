package com.patrones.Comportamiento.Strategy;

// ==============================
// ❌ Sin aplicar el patrón Strategy
// ==============================

// Clase que maneja los métodos de pago sin usar el patrón
// Usa condicionales para decidir qué hacer según el método
class TiendaSinStrategy {
    public void pagar(String metodo, double monto) {
        if (metodo.equals("efectivo")) {
            System.out.println("Pagando $" + monto + " en efectivo");
        } else if (metodo.equals("tarjeta")) {
            System.out.println("Pagando $" + monto + " con tarjeta");
        } else {
            System.out.println("Método de pago no soportado");
        }
    }
}