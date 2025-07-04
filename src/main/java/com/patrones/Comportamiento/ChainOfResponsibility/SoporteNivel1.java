package com.patrones.Comportamiento.ChainOfResponsibility;

// Manejador nivel 1
class SoporteNivel1 implements IHandler {
    private IHandler siguiente;

    @Override
    public void setSiguiente(IHandler handler) {
        this.siguiente = handler;
    }

    @Override
    public void manejar(Ticket ticket) {
        if (ticket.nivel.equals("bajo")) {
            System.out.println("Soporte Nivel 1: Resuelto ticket: " + ticket.descripcion);
        } else if (siguiente != null) {
            siguiente.manejar(ticket);
        } else {
            System.out.println("Ticket no resuelto: " + ticket.descripcion);
        }
    }
}
