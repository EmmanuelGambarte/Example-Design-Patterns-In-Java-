package com.patrones.Creacionales.AbstracFactory;

// Fábrica concreta que extiende la Abstract Factory.
// Retorna productos concretos relacionados con motos: Moto y SillaMoto.
public class FabricaMoto extends FabricaVehiculo {

    @Override
    public IVehiculo crearVehiculo() {
        return new Moto();
    }

    @Override
    public ISilla crearSilla() {
        return new SillaMoto();
    }
}
