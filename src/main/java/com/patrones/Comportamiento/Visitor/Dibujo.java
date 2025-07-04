package com.patrones.Comportamiento.Visitor;

// Clase Dibujo que dibuja las figuras sin usar Visitor
// Usa instanceof para determinar el tipo y actuar en consecuencia
class Dibujo {
    public void dibujar(Figura figura) {
        if (figura instanceof Cuadrado) {
            Cuadrado c = (Cuadrado) figura;
            System.out.println("Dibujando cuadrado de lado " + c.lado);
        } else if (figura instanceof Circulo) {
            Circulo c = (Circulo) figura;
            System.out.println("Dibujando círculo de radio " + c.radio);
        }
    }
}