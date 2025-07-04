package com.patrones.SOLID.SingleResponsibilityPrinciple;

public class Main {

    public static void main(String[] args) {

        // --- Ejemplo sin aplicar SRP ---
        Rectangulo rectangulo = new Rectangulo(10, 20);
        rectangulo.imprimir();

        /*
         * En este ejemplo, la clase Rectangulo se encarga tanto de representar
         * los datos geométricos como de imprimir su información.
         * Esto rompe el Principio de Responsabilidad Única (SRP),
         * ya que tiene más de una responsabilidad.
         */

        // --- Ejemplo aplicando SRP ---
        RectanguloSRP rectanguloSRP = new RectanguloSRP(20, 30);
        Presentacion presentacion = new Presentacion();
        presentacion.imprimir(rectanguloSRP);

        /*
         * Aquí dividimos las responsabilidades:
         * - RectanguloSRP se encarga solo del modelo de datos y cálculos.
         * - Presentacion se encarga de mostrar la información por pantalla.
         * Cada clase tiene una sola responsabilidad, cumpliendo con el SRP.
         */
    }
}
