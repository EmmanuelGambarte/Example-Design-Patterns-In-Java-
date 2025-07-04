package com.patrones.Creacionales.Builder;

/**
 * Clase que representa una Computadora con varios atributos.
 * Esta clase puede ser instanciada directamente (forma no recomendada)
 * o a través de ComputadoraBuilder (forma recomendada).
 */
public class Computadora {
    private String procesador;
    private int ram;
    private int disco;
    private boolean tieneGpu;

    // Constructor tradicional (no recomendado cuando hay muchos parámetros)
    public Computadora(String procesador, int ram, int disco, boolean tieneGpu) {
        this.procesador = procesador;
        this.ram = ram;
        this.disco = disco;
        this.tieneGpu = tieneGpu;
    }

    @Override
    public String toString() {
        return "Computadora [procesador=" + procesador + ", ram=" + ram + "GB, disco=" + disco + "GB, GPU=" + tieneGpu
                + "]";
    }
}
