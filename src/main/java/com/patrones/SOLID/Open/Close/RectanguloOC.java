package com.patrones.SOLID.Open.Close;

// Aplica el principio Open/Closed al implementar la interfaz IFigura
// Podemos agregar nuevas figuras sin tocar el código existente.
public class RectanguloOC implements IFigura {

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

    public RectanguloOC(float base, float altura) {
        this.setBase(base);
        this.setAltura(altura);
    }

    public float area() {
        return getBase() * getAltura();
    }
}
