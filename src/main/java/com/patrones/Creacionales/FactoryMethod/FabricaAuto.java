package com.patrones.Creacionales.FactoryMethod;

// Fábrica concreta que devuelve un objeto Auto.
// El cliente usará esta clase para obtener una instancia de Auto sin conocer su implementación.
public class FabricaAuto extends FabricaVehiculo {

    public IVehiculo crearVehiculo() {
        return new Auto();
    }
}
