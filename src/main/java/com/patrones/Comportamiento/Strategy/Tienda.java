package com.patrones.Comportamiento.Strategy;

// Contexto: representa la tienda que usa una estrategia de pago
class Tienda {
    private IMetodoPago metodoPago;

    // Constructor que recibe la estrategia inicial
    public Tienda(IMetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    // Permite cambiar la estrategia de pago en tiempo de ejecución
    public void setMetodoPago(IMetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    // Ejecuta la estrategia actual para realizar el pago
    public void realizarPago(double monto) {
        metodoPago.pagar(monto);
    }
}