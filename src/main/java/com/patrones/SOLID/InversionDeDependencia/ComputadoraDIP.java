package com.patrones.SOLID.InversionDeDependencia;

public class ComputadoraDIP {

    // ✅ Depende de abstracciones (interfaces), no de implementaciones concretas
    private ITeclado teclado;
    private IMouse mouse;

    // ✅ Las dependencias se inyectan desde afuera (inyección de dependencias)
    public ComputadoraDIP(ITeclado teclado, IMouse mouse) {
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public void encenderIoD() {
        teclado.conectar();
        mouse.conectar();
    }
}
