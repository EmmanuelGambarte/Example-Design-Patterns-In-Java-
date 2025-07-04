package com.patrones.Creacionales.FactoryMethod;

// Fábrica concreta que devuelve un objeto Moto.
// Permite al cliente instanciar una moto sin acoplarse directamente a la clase Moto
public class FabricaMoto extends FabricaVehiculo {

    public IVehiculo crearVehiculo() {
        return new Moto();
    }
}
