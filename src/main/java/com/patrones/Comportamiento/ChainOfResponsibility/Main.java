package com.patrones.Comportamiento.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("Problema con impresora", "bajo");
        Ticket t2 = new Ticket("Error de sistema", "alto");
        Ticket t3 = new Ticket("Consulta general", "medio");
        Ticket t4 = new Ticket("Incidente desconocido", "critico");

        System.out.println("=== Sin usar Chain of Responsibility ===");
        SoporteTecnico soporte = new SoporteTecnico();

        soporte.resolverTicket(t1);
        soporte.resolverTicket(t2);
        soporte.resolverTicket(t3);
        soporte.resolverTicket(t4);

        System.out.println("\n=== Usando Chain of Responsibility ===");
        // Crear la cadena
        IHandler nivel1 = new SoporteNivel1();
        IHandler nivel2 = new SoporteNivel2();
        IHandler nivel3 = new SoporteNivel3();

        nivel1.setSiguiente(nivel2);
        nivel2.setSiguiente(nivel3);

        // Usar la cadena para manejar los tickets
        nivel1.manejar(t1);
        nivel1.manejar(t2);
        nivel1.manejar(t3);
        nivel1.manejar(t4);
    }
}
