package com.patrones.Creacionales.AbstracFactory;

// Clase abstracta que representa la Abstract Factory.
// Declara métodos abstractos para crear objetos de tipo IVehiculo e ISilla.
public abstract class FabricaVehiculo {

    public abstract IVehiculo crearVehiculo();

    public abstract ISilla crearSilla();
}
