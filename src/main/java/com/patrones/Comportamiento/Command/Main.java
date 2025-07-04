package com.patrones.Comportamiento.Command;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sin patrón Command ===");
        ReproductorMusica reproductor = new ReproductorMusica();

        // Llamadas directas a métodos del receptor
        reproductor.reproducir();
        reproductor.pausar();
        reproductor.detener();

        System.out.println("\n=== Con patrón Command ===");
        ControlRemoto control = new ControlRemoto();

        // Creación de comandos concretos que encapsulan las acciones
        ICommand play = new ComandoReproducir(reproductor);
        ICommand pause = new ComandoPausar(reproductor);
        ICommand stop = new ComandoDetener(reproductor);

        // Ejecutar comando reproducir
        control.setComando(play);
        control.presionarBoton();

        // Ejecutar comando pausar
        control.setComando(pause);
        control.presionarBoton();

        // Ejecutar comando detener
        control.setComando(stop);
        control.presionarBoton();
    }
}
