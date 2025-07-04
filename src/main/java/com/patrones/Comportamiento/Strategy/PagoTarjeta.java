package com.patrones.Comportamiento.Strategy;

// Implementación concreta de la estrategia: pago con tarjeta
class PagoTarjeta implements IMetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " con tarjeta");
    }
}