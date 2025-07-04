package com.patrones.Comportamiento.Visitor;

// Visitor concreto que implementa las operaciones específicas
// En este caso, dibuja los elementos
class Dibujante implements IVisitor {
    @Override
    public void visitarCuadrado(CuadradoV cuadrado) {
        System.out.println("Dibujando cuadrado con lado " + cuadrado.lado);
    }

    @Override
    public void visitarCirculo(CirculoV circulo) {
        System.out.println("Dibujando círculo con radio " + circulo.radio);
    }
}