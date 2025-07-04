package com.patrones.Comportamiento.Strategy;

// Implementación concreta de la estrategia: pago en efectivo
class PagoEfectivo implements IMetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " en efectivo");
    }
}