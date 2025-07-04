package com.patrones.Comportamiento.State;

// Estado concreto cuando no hay moneda insertada
class EstadoSinMoneda implements IEstado {
    private MaquinaExpendedora maquina;

    public EstadoSinMoneda(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insertarMoneda() {
        // Insertar moneda y cambiar estado a con moneda
        System.out.println("Moneda insertada correctamente");
        maquina.setEstado(new EstadoConMoneda(maquina));
    }

    @Override
    public void entregarProducto() {
        // No se puede entregar porque falta moneda
        System.out.println("No se puede entregar, falta la moneda");
    }
}