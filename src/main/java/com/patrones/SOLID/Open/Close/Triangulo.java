package com.patrones.SOLID.Open.Close;

// Esta clase viola el principio Open/Closed (OCP)
// porque la lógica de cálculo de área es específica
// y no está unificada por una interfaz.
public class Triangulo {

    private float base;
    private float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Triangulo(float base, float altura) {
        this.setBase(base);
        this.setAltura(altura);
    }

    public float area() {
        return (getBase() * getAltura()) / 2;
    }
}
