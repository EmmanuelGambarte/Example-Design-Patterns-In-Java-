package com.patrones.Comportamiento.Mediator;

import java.util.ArrayList;
import java.util.List;

// ==========================
// 💥 Sin usar el patrón Mediator
// ==========================

class UsuarioDirecto {
    private String nombre;

    public UsuarioDirecto(String nombre) {
        this.nombre = nombre;
    }

    public void enviarMensaje(String mensaje, UsuarioDirecto receptor) {
        System.out.println(this.nombre + " le dice a " + receptor.nombre + ": " + mensaje);
    }
}
