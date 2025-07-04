package com.patrones.Creacionales.FactoryMethod;

// Clase abstracta que representa el "creator" del patrón Factory Method.
// Define el método de fábrica que las subclases concretas deben implementar.
public abstract class FabricaVehiculo {

    public abstract IVehiculo crearVehiculo();
}
