package com.patrones.SOLID.InterfaceSegregation;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sin aplicar la Segregación de Interfaces:");
        Jaguar jaguar = new Jaguar();
        jaguar.maullar(); // ⚠️ Comportamiento innecesario

        System.out.println("/////////////----------///////////");

        System.out.println("Aplicando la Segregación de Interfaces:");
        JaguarIS jaguarIS = new JaguarIS();
        jaguarIS.cazar(); // ✅ Solo los métodos válidos
    }
}