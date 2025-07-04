package com.patrones.Comportamiento.Visitor;

// ================================
// ✅ Aplicando patrón Visitor
// Interfaz Visitor con métodos para cada tipo concreto
// Define las operaciones que pueden realizarse sobre los elementos
// ================================
interface IVisitor {
    void visitarCuadrado(CuadradoV cuadrado);

    void visitarCirculo(CirculoV circulo);
}