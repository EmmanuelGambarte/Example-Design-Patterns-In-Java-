package com.patrones.SOLID.SingleResponsibilityPrinciple;

public class Presentacion {

    // Clase responsable exclusivamente de mostrar información por pantalla

    public void imprimir(RectanguloSRP rectanguloSRP) {
        System.out.println(rectanguloSRP);
    }
}
