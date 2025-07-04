package com.patrones.Creacionales.Builder;

/**
 * Builder para la clase Computadora.
 * Permite construir objetos complejos paso a paso,
 * especialmente útil cuando hay múltiples parámetros.
 */
public class ComputadoraBuilder {
    private String procesador;
    private int ram;
    private int disco;
    private boolean tieneGpu;

    public ComputadoraBuilder setProcesador(String procesador) {
        this.procesador = procesador;
        return this; // Permite encadenar llamadas (fluent interface)
    }

    public ComputadoraBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputadoraBuilder setDisco(int disco) {
        this.disco = disco;
        return this;
    }

    public ComputadoraBuilder setTieneGpu(boolean tieneGpu) {
        this.tieneGpu = tieneGpu;
        return this;
    }

    /**
     * Devuelve una instancia de Computadora con los datos cargados.
     * Se pueden agregar validaciones antes de crear el objeto.
     */
    public Computadora build() {
        if (procesador == null || procesador.isEmpty()) {
            throw new IllegalStateException("Procesador es obligatorio");
        }
        return new Computadora(procesador, ram, disco, tieneGpu);
    }
}
