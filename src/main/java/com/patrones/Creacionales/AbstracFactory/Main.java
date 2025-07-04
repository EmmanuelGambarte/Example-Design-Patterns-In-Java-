package com.patrones.Creacionales.AbstracFactory;

import com.patrones.Creacionales.FactoryMethod.Auto;
import com.patrones.Creacionales.FactoryMethod.Moto;

public class Main {

    public static void main(String[] args) {

        // ❌ Ejemplo sin aplicar Abstract Factory
        System.out.println("Sin aplicar Abstract Factory:");
        Auto auto = new Auto();
        Moto moto = new Moto();
        SillaAuto sillaAuto = new SillaAuto();
        SillaMoto sillaMoto = new SillaMoto();

        auto.conducir();
        moto.conducir();
        sillaAuto.sentarse();
        sillaMoto.sentarse();

        System.out.println("---------/////////////////-------------");

        // ✅ Abstract Factory
        System.out.println("Aplicando Abstract Factory:");
        // Fábrica concreta
        FabricaVehiculo fabricaAuto = new FabricaAuto();
        IVehiculo vehiculoAutoAF = fabricaAuto.crearVehiculo();
        ISilla sillaAutoAF = fabricaAuto.crearSilla();

        vehiculoAutoAF.conducir();
        sillaAutoAF.sentarse();
    }
}
