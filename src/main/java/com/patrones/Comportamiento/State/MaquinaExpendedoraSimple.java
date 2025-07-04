package com.patrones.Comportamiento.State;

// ==============================
// ❌ Sin aplicar el patrón State
// Maquina simple que controla estados con un String y condicionales
// ==============================
class MaquinaExpendedoraSimple {
    private String estado = "SIN_MONEDA";

    public void insertarMoneda() {
        if (estado.equals("SIN_MONEDA")) {
            System.out.println("Moneda insertada");
            estado = "CON_MONEDA";
        } else {
            System.out.println("Ya hay una moneda insertada");
        }
    }

    public void entregarProducto() {
        if (estado.equals("CON_MONEDA")) {
            System.out.println("Producto entregado");
            estado = "SIN_MONEDA";
        } else {
            System.out.println("Inserte una moneda primero");
        }
    }
}