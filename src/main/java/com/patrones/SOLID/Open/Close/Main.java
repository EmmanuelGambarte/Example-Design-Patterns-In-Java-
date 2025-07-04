package com.patrones.SOLID.Open.Close;

public class Main {

    public static void main(String[] args) {

        // 🟥 Violación del principio Open/Closed:
        // Si agregamos más figuras, hay que modificar la clase Presentacion (mala
        // práctica)
        Rectangulo rectangulo = new Rectangulo(10, 20);
        Triangulo triangulo = new Triangulo(10, 5);

        Presentacion presentacion = new Presentacion();
        presentacion.area(rectangulo);
        presentacion.area(triangulo);

        // ✅ Aplicación del principio Open/Closed:
        // Podemos agregar nuevas figuras sin modificar PresentacionOC
        RectanguloOC rectanguloOC = new RectanguloOC(10, 20);
        TrianguloOC trianguloOC = new TrianguloOC(10, 5);

        System.out.println("------Open/Close---------");
        PresentacionOC presentacionOC = new PresentacionOC();
        presentacionOC.area(rectanguloOC);
        presentacionOC.area(trianguloOC);
    }
}
