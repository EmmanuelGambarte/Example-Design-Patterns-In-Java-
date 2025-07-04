package com.patrones.SOLID.InersionDeDependencia;

//🟥 Mouse.java — implementación concreta que rompe el DIP
public class Mouse {

    public void conectar() {
        System.out.println("Conexcion Mouse via USB!");
    }
}
