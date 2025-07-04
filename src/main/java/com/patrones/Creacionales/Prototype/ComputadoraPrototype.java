package com.patrones.Creacionales.Prototype;

/**
 * Clase que aplica correctamente el patrón Prototype.
 * Implementa la interfaz IClonablePrototype y define cómo clonar una
 * computadora.
 */
public class ComputadoraPrototype implements IClonablePrototype {

    private String procesador;
    private int ram;
    private int disco;

    public ComputadoraPrototype(String procesador, int ram, int disco) {
        this.procesador = procesador;
        this.ram = ram;
        this.disco = disco;
    }

    public void mostrar() {
        System.out.println("Computadora: " + procesador + ", RAM: " + ram + "GB, Disco: " + disco + "GB");
    }

    @Override
    public ComputadoraPrototype clonar() {
        // Clon superficial: se copian los valores tal cual
        return new ComputadoraPrototype(procesador, ram, disco);
    }
}
