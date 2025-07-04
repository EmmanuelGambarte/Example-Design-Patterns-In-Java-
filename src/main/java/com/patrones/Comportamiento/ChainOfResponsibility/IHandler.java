package com.patrones.Comportamiento.ChainOfResponsibility;

// Interfaz para los manejadores
interface IHandler {
    void setSiguiente(IHandler handler);

    void manejar(Ticket ticket);
}
