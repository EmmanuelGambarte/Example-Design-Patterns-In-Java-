package com.patrones.SOLID.Liskov;

public class Main {

    public static void main(String[] args) {
        // ✅ Ejemplo válido de herencia: Jaguar
        Jaguar jaguar = new Jaguar();
        jaguar.emitirSonido(); // El jaguar ruge
        jaguar.cazar(); // El jaguar caza

        // ❌ Ejemplo que viola el principio LSP
        Jaguar otroJaguar = new GatoDomestico();
        otroJaguar.emitirSonido(); // ⚠️ No debería rugir: comportamiento no esperado

        // ✅ Ejemplo correcto usando una interfaz común
        IFelinoPSL felino1 = new Jaguar();
        felino1.emitirSonido(); // OK

        IFelinoPSL felino2 = new GatoDomesticoPSL();
        felino2.emitirSonido(); // OK: maúlla
    }
}
