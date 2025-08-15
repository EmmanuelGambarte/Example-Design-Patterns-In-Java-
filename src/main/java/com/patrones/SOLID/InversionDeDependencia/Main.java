package com.patrones.SOLID.InversionDeDependencia;

//🟨 Main.java — prueba de ambas implementaciones
public class Main {

    public static void main(String[] args) {

        // ❌ Ejemplo que viola el principio de Inversión de Dependencias
        System.out.println("Ejemplo que viola el principio de Inversión de Dependencias");
        Computadora computadora = new Computadora();
        computadora.encender(); // Fuertemente acoplada a las clases concretas

        System.out.println("//////////----------/////////////");

        // ✅ Ejemplo que aplica correctamente el principio
        System.out.println("Ejemplo que aplica correctamente el principio");
        TecladoDIP teclado = new TecladoDIP();
        MouseDIP mouse = new MouseDIP();

        // Uso de dependencias inyectadas y desacopladas
        ComputadoraDIP computadoraIoD = new ComputadoraDIP(teclado, mouse);
        computadoraIoD.encenderIoD();
    }
}
