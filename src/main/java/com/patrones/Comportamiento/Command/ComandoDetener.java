package com.patrones.Comportamiento.Command;

// Comando concreto para detener música
class ComandoDetener implements ICommand {
    private ReproductorMusica reproductor;

    public ComandoDetener(ReproductorMusica r) {
        this.reproductor = r;
    }

    @Override
    public void ejecutar() {
        reproductor.detener();
    }
}