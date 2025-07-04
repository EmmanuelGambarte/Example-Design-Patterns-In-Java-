package com.patrones.Comportamiento.ChainOfResponsibility;

// Manejador nivel 3
class SoporteNivel3 implements IHandler {
    private IHandler siguiente;

    @Override
    public void setSiguiente(IHandler handler) {
        this.siguiente = handler;
    }

    @Override
    public void manejar(Ticket ticket) {
        if (ticket.nivel.equals("alto")) {
            System.out.println("Soporte Nivel 3: Resuelto ticket: " + ticket.descripcion);
        } else if (siguiente != null) {
            siguiente.manejar(ticket);
        } else {
            System.out.println("Ticket no resuelto: " + ticket.descripcion);
        }
    }
}
