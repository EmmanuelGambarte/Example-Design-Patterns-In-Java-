package com.patrones.SOLID.Open.Close;

// Esta clase viola el principio Open/Closed
// porque cada vez que agregamos una nueva figura,
// debemos modificar esta clase y agregar un nuevo método.
public class Presentacion {

    public void area(Rectangulo rectangulo) {
        System.out.println(rectangulo.getBase() * rectangulo.getAltura());
    }

    public void area(Triangulo triangulo) {
        System.out.println((triangulo.getBase() * triangulo.getAltura()) / 2);
    }
}
