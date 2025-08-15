package com.patrones.SOLID.InversionDeDependencia;

//🟩 ITeclado.java — interfaz específica para teclados
// ✅ Hereda la abstracción base y permite extender comportamientos de teclado
public interface ITeclado extends IComponente {

    // Podrías agregar métodos específicos de teclado en el futuro
    public void conectar();
}
