package com.patrones.Comportamiento.ChainOfResponsibility;

public class SoporteTecnico {
    // Método sin usar Chain of Responsibility
    public void resolverTicket(Ticket ticket) {
        if (ticket.nivel.equals("bajo")) {
            System.out.println("Soporte Nivel 1: Resuelto ticket: " + ticket.descripcion);
        } else if (ticket.nivel.equals("medio")) {
            System.out.println("Soporte Nivel 2: Resuelto ticket: " + ticket.descripcion);
        } else if (ticket.nivel.equals("alto")) {
            System.out.println("Soporte Nivel 3: Resuelto ticket: " + ticket.descripcion);
        } else {
            System.out.println("Nivel desconocido, no se pudo resolver el ticket: " + ticket.descripcion);
        }
    }
}
