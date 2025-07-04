package com.patrones.Estructurales.Facade;

// Esta clase representa la "fachada" que oculta la complejidad del sistema.
// Proporciona una interfaz simple para iniciar el sistema.
public class ComputadoraFacade {

    private CPU cpu;
    private Memoria memoria;
    private DiscoDuro disco;

    public ComputadoraFacade() {
        // Se instancian internamente los subsistemas.
        this.cpu = new CPU();
        this.memoria = new Memoria();
        this.disco = new DiscoDuro();
    }

    // Método de alto nivel que simplifica el arranque del sistema.
    public void iniciarSistema() {
        cpu.encender();
        memoria.cargarDatos();
        disco.leerSector();
        System.out.println("Sistema iniciado correctamente ✅");
    }
}
