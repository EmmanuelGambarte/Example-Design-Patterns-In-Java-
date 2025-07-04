package com.patrones.Estructurales.Flyweight;

public class Letra {
    private char caracter;
    private int posicionX;
    private int posicionY;

    public Letra(char caracter, int x, int y) {
        this.caracter = caracter;
        this.posicionX = x;
        this.posicionY = y;
    }

    public void mostrar() {
        System.out.println("Mostrando letra '" + caracter + "' en posición (" + posicionX + ", " + posicionY + ")");
    }
}