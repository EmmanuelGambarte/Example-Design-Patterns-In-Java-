package com.patrones.Creacionales.AbstracFactory;

// Fábrica concreta que extiende la Abstract Factory.
// Retorna productos concretos relacionados con autos: Auto y SillaAuto.
public class FabricaAuto extends FabricaVehiculo {

    @Override
    public IVehiculo crearVehiculo() {
        return new Auto();
    }

    @Override
    public ISilla crearSilla() {
        return new SillaAuto();
    }
}
