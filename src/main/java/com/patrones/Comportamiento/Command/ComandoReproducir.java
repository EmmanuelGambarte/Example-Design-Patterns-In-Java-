package com.patrones.Comportamiento.Command;

// Comando concreto para reproducir música
class ComandoReproducir implements ICommand {
    private ReproductorMusica reproductor;

    // Constructor recibe el receptor sobre el que actúa
    public ComandoReproducir(ReproductorMusica r) {
        this.reproductor = r;
    }

    // Ejecuta la acción de reproducir en el receptor
    @Override
    public void ejecutar() {
        reproductor.reproducir();
    }
}