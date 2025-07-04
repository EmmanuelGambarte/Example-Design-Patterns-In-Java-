package com.patrones.Creacionales.FactoryMethod;

public class Main {

    public static void main(String[] args) {

        // ❌ Ejemplo sin aplicar Factory Method

        // Instanciación directa (acoplamiento)
        IVehiculo auto = new Auto();
        // Instanciación directa (acoplamiento)
        IVehiculo moto = new Moto();

        auto.conducir();
        moto.conducir();

        System.out.println("------------");

        // ✅ Ejemplo aplicando Factory Method
        FabricaVehiculo fabricaAuto = new FabricaAuto();
        // El cliente no sabe qué clase concreta se instancia
        IVehiculo autoFM = fabricaAuto.crearVehiculo();
        autoFM.conducir();

        FabricaVehiculo fabricaMoto = new FabricaMoto();
        // El cliente no sabe qué clase concreta se instancia
        IVehiculo motoFM = fabricaMoto.crearVehiculo();
        motoFM.conducir();
    }
}
