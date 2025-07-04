package com.patrones.Creacionales.Prototype;

/**
 * Clase que representa una computadora.
 * Esta versión NO aplica el patrón Prototype.
 * Para duplicar un objeto, se instancia manualmente otra con los mismos datos.
 */
public class Computadora {
    private String procesador;
    private int ram;
    private int disco;

    public Computadora(String procesador, int ram, int disco) {
        this.procesador = procesador;
        this.ram = ram;
        this.disco = disco;
    }

    public void mostrar() {
        System.out.println("Computadora: " + procesador + ", RAM: " + ram + "GB, Disco: " + disco + "GB");
    }
}
