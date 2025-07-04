package com.patrones.SOLID.Open.Close;

// Esta clase cumple con el principio Open/Closed
// porque no necesita cambiar si agregamos nuevas figuras.
// Solo necesita que las figuras implementen la interfaz IFigura.
public class PresentacionOC {

    public void area(IFigura figura) {
        System.out.println(figura.area());
    }
}
