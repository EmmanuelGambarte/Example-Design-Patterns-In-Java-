package com.patrones.Creacionales.FactoryMethod;

// Otra implementación concreta de IVehiculo.
// Representa otro tipo de vehículo.
public class Moto implements IVehiculo {

    @Override
    public void conducir() {
        System.out.println("Conduciendo un moto 🏍️");
    }
}
