package com.patrones.Comportamiento.Observer;

// Observador concreto: app móvil
class AppMovil implements IObservador {
    private String nombre;

    public AppMovil(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String clima) {
        System.out.println(nombre + " recibe actualización: El clima es " + clima);
    }
}