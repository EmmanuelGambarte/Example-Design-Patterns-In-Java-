package com.patrones.Creacionales.FactoryMethod;

// Clase concreta que implementa la interfaz IVehiculo.
// Representa un tipo específico de vehículo.
public class Auto implements IVehiculo {

    @Override
    public void conducir() {
        System.out.println("Conduciendo un auto 🚗");
    }
}
