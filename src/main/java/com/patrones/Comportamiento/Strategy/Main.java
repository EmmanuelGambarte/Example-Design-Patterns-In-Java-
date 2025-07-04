package com.patrones.Comportamiento.Strategy;

// ==============================
// 🎯 Main: comparar ambos casos
// ==============================
public class Main {
    public static void main(String[] args) {

        System.out.println("=== ❌ Sin aplicar Strategy ===");
        TiendaSinStrategy tiendaAntigua = new TiendaSinStrategy();
        tiendaAntigua.pagar("efectivo", 100);
        tiendaAntigua.pagar("tarjeta", 200);
        tiendaAntigua.pagar("paypal", 300); // no soportado

        System.out.println("\n=== ✅ Aplicando patrón Strategy ===");
        IMetodoPago efectivo = new PagoEfectivo();
        IMetodoPago tarjeta = new PagoTarjeta();

        // Creamos la tienda con la estrategia inicial de pago en efectivo
        Tienda tienda = new Tienda(efectivo);
        tienda.realizarPago(150);

        // Cambiamos la estrategia a pago con tarjeta en tiempo de ejecución
        tienda.setMetodoPago(tarjeta);
        tienda.realizarPago(250);
    }
}