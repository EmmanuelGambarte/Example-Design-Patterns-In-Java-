package com.patrones.SOLID.SingleResponsibilityPrinciple;

public class Rectangulo {

    // Clase que viola el Principio de Responsabilidad Única (SRP)

    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

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

    public float area() {
        return base * altura;
    }

    public void imprimir() {
        // Esta clase no debería tener responsabilidades de presentación
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Base: " + base + " | Altura: " + altura;
    }
}
