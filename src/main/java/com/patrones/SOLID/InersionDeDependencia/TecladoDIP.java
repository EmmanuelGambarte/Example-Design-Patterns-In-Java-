package com.patrones.SOLID.InersionDeDependencia;

//🟩 TecladoIoD.java — implementación correcta del DIP
// ✅ Hereda la abstracción base y permite extender comportamientos de mouse
public class TecladoDIP implements ITeclado {

    // Podrías agregar métodos específicos del mouse en el futuro
    public void conectar() {
        System.out.println("Conexcion Teclado via USB!");
    }
}
