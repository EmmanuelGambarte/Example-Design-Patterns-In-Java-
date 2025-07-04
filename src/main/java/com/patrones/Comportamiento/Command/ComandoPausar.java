package com.patrones.Comportamiento.Command;

// Comando concreto para pausar música
class ComandoPausar implements ICommand {
    private ReproductorMusica reproductor;

    public ComandoPausar(ReproductorMusica r) {
        this.reproductor = r;
    }

    @Override
    public void ejecutar() {
        reproductor.pausar();
    }
}