package com.patrones.Comportamiento.TemplateMethod;

// ============================
// ❌ Sin aplicar Template Method
// ============================
class Cafe {
    public void preparar() {
        System.out.println("Hervir agua");
        System.out.println("Preparar café");
        System.out.println("Servir en taza");
        System.out.println("Agregar azúcar");
    }
}