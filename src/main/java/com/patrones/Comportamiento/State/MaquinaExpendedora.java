package com.patrones.Comportamiento.State;

// Contexto: máquina expendedora que delega en el estado actual
class MaquinaExpendedora {
    private IEstado estado;

    public MaquinaExpendedora() {
        // Estado inicial: sin moneda
        this.estado = new EstadoSinMoneda(this);
    }

    // Cambia el estado actual
    public void setEstado(IEstado estado) {
        this.estado = estado;
    }

    // Delegan el comportamiento al estado actual
    public void insertarMoneda() {
        estado.insertarMoneda();
    }

    public void entregarProducto() {
        estado.entregarProducto();
    }
}