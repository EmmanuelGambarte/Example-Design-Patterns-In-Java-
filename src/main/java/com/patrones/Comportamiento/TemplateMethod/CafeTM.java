package com.patrones.Comportamiento.TemplateMethod;

// Implementación concreta de BebidaCaliente para preparar café
class CafeTM extends BebidaCaliente {
    @Override
    protected void prepararBebida() {
        System.out.println("Preparando café filtrado");
    }

    @Override
    protected void agregarComplemento() {
        System.out.println("Agregando azúcar");
    }
}