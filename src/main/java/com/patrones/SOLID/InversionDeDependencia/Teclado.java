package com.patrones.SOLID.InversionDeDependencia;

//🟥 Teclado.java — implementación concreta que rompe el DIP
public class Teclado {

    public void conectar() {
        System.out.println("Conexcion Teclado via USB!");
    }
}
