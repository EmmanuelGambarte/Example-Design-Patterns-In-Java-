package com.patrones.Comportamiento.Observer;

// ================================
// 🎯 Main: Compara ambos casos
// ================================
public class Main {
    public static void main(String[] args) {

        System.out.println("=== ❌ Sin aplicar Observer ===");
        ServicioMeteorologicoSinObserver servicioAntiguo = new ServicioMeteorologicoSinObserver();
        servicioAntiguo.setClima("Soleado");
        servicioAntiguo.notificarDispositivos();

        System.out.println("\n=== ✅ Aplicando patrón Observer ===");
        ServicioMeteorologico servicio = new ServicioMeteorologico();

        IObservador app = new AppMovil("ClimaYa");
        IObservador reloj = new RelojInteligente();

        servicio.registrar(app);
        servicio.registrar(reloj);

        servicio.setClima("Nublado");
        servicio.setClima("Lluvia 🌧️");
    }
}
