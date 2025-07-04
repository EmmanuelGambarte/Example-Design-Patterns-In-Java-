package com.patrones.Comportamiento.Command;

// Receptor: clase que conoce cómo realizar las operaciones reales
class ReproductorMusica {
    // Método para reproducir música
    public void reproducir() {
        System.out.println("Reproduciendo música");
    }

    // Método para pausar la música
    public void pausar() {
        System.out.println("Música pausada");
    }

    // Método para detener la música
    public void detener() {
        System.out.println("Música detenida");
    }
}