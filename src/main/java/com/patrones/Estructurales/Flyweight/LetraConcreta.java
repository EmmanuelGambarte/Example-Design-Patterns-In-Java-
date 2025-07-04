package com.patrones.Estructurales.Flyweight;

public class LetraConcreta implements ILetra {
    private char caracter; // Estado intrínseco

    public LetraConcreta(char caracter) {
        this.caracter = caracter;
    }

    @Override
    public void mostrar(int x, int y) {
        System.out.println("Mostrando letra '" + caracter + "' en posición (" + x + ", " + y + ")");
    }
}