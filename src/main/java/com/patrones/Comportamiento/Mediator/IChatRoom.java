package com.patrones.Comportamiento.Mediator;

// ==========================
// ✅ Aplicando el patrón Mediator
// ==========================

// Interfaz del Mediador
interface IChatRoom {
    void enviar(String mensaje, Usuario participante);

    void registrarUsuario(Usuario usuario);
}
