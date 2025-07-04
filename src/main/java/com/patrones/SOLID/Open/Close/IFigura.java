package com.patrones.SOLID.Open.Close;

// Interface que representa una figura con una única responsabilidad: calcular su área
// Permite cumplir con el principio Open/Closed: podemos agregar nuevas figuras
// sin modificar las clases que consumen IFigura
public interface IFigura {

    float area();
}
