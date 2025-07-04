package com.patrones.SimpleFactory;

public class Pizza {

    private int cantidadRebanadas;

    // Constructor público: se usa cuando no hay una fábrica que lo abstraiga.
    public Pizza(int cantidadRebanadas) {
        this.cantidadRebanadas = cantidadRebanadas;
    }

    @Override
    public String toString() {
        return "Cantidad de rebanadas: " + this.cantidadRebanadas;
    }

}
