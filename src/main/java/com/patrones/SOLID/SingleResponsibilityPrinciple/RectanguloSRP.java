package com.patrones.SOLID.SingleResponsibilityPrinciple;

public class RectanguloSRP {

    // Clase que sigue el Principio de Responsabilidad Única (SRP)

    private float base;
    private float altura;

    public RectanguloSRP(float base, float altura) {
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

    @Override
    public String toString() {
        return "Base: " + base + " | Altura: " + altura;
    }

}
