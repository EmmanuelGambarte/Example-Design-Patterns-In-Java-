package com.patrones.Comportamiento.Observer;

// ====================================
// ❌ Sin aplicar el patrón Observer
// ====================================
class ServicioMeteorologicoSinObserver {
    private String clima;

    public void setClima(String clima) {
        this.clima = clima;
    }

    public void notificarDispositivos() {
        System.out.println("Notificando a la app móvil: El clima es " + clima);
        System.out.println("Notificando al reloj: El clima es " + clima);
    }
}
