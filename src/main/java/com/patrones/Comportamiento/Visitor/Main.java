package com.patrones.Comportamiento.Visitor;

// ================================
// 🎯 Main que compara ambos casos
// ================================
public class Main {
    public static void main(String[] args) {

        System.out.println("=== ❌ Sin patrón Visitor ===");
        Dibujo dibujo = new Dibujo();
        dibujo.dibujar(new Cuadrado(5));
        dibujo.dibujar(new Circulo(3));

        System.out.println("\n=== ✅ Aplicando patrón Visitor ===");
        IElemento cuadrado = new CuadradoV(5);
        IElemento circulo = new CirculoV(3);

        IVisitor dibujante = new Dibujante();

        // Los elementos aceptan el visitante, que ejecuta la operación
        cuadrado.aceptar(dibujante);
        circulo.aceptar(dibujante);
    }
}
