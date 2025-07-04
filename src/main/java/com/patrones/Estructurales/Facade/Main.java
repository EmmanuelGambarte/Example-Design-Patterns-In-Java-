package com.patrones.Estructurales.Facade;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== ❌ Sin uso de Facade ===");

        // El cliente interactúa directamente con múltiples clases del sistema.
        // Esto genera acoplamiento y mayor complejidad.
        CPU cpu = new CPU();
        Memoria memoria = new Memoria();
        DiscoDuro disco = new DiscoDuro();

        cpu.encender();
        memoria.cargarDatos();
        disco.leerSector();

        System.out.println("----------/////////////////------------------");
        System.out.println("=== ✅ Usando Facade ===");

        // El cliente ahora usa solo una clase (la fachada), simplificando el uso del
        // sistema.
        ComputadoraFacade computadora = new ComputadoraFacade();
        computadora.iniciarSistema(); // El cliente no necesita conocer los detalles internos
    }
}
