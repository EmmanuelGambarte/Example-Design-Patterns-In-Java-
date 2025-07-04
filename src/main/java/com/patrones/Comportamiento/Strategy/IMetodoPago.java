package com.patrones.Comportamiento.Strategy;

// ==============================
// ✅ Aplicando el patrón Strategy
// ==============================

// Interfaz que define el método común para las estrategias de pago
interface IMetodoPago {
    void pagar(double monto);
}