package com.patrones.Comportamiento.State;

// Estado concreto cuando hay moneda insertada
class EstadoConMoneda implements IEstado {
    private MaquinaExpendedora maquina;

    // Se pasa la referencia a la máquina para cambiar el estado
    public EstadoConMoneda(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insertarMoneda() {
        // Ya hay moneda, no se puede insertar otra
        System.out.println("Ya hay una moneda insertada");
    }

    @Override
    public void entregarProducto() {
        // Entregar producto y cambiar estado a sin moneda
        System.out.println("Producto entregado 🍬");
        maquina.setEstado(new EstadoSinMoneda(maquina));
    }
}