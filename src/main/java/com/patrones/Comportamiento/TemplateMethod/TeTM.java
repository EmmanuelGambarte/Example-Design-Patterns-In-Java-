package com.patrones.Comportamiento.TemplateMethod;

// Implementación concreta de BebidaCaliente para preparar té
class TeTM extends BebidaCaliente {
    @Override
    protected void prepararBebida() {
        System.out.println("Preparando té");
    }

    @Override
    protected void agregarComplemento() {
        System.out.println("Agregando limón");
    }
}