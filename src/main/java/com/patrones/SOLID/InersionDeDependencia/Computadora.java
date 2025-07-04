package com.patrones.SOLID.InersionDeDependencia;

public class Computadora {

    // ❌ Depende de clases concretas (Teclado y Mouse)
    private Teclado teclado;
    private Mouse mouse;

    public Computadora() {
        // ❌ Las dependencias están "quemadas" en el constructor
        this.teclado = new Teclado();
        this.mouse = new Mouse();
    }

    public void encender() {
        // ❌ La clase está fuertemente acoplada a las implementaciones
        this.teclado.conectar();
        this.mouse.conectar();
    }

}
