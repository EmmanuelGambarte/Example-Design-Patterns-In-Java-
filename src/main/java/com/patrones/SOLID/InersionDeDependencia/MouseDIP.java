package com.patrones.SOLID.InersionDeDependencia;

//🟩 MouseIoD.java — implementación correcta del DIP
public class MouseDIP implements IMouse {

    public void conectar() {
        System.out.println("Conexcion Mouse via USB!");
    }
}
