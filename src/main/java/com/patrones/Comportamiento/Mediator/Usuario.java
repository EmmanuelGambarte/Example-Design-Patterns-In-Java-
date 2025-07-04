package com.patrones.Comportamiento.Mediator;

// Usuario (Colega) que se comunica mediante el Mediador
class Usuario {
    private String nombre;
    private IChatRoom chat;

    public Usuario(String nombre, IChatRoom chat) {
        this.nombre = nombre;
        this.chat = chat;
        chat.registrarUsuario(this); // se registra automáticamente
    }

    public String getNombre() {
        return nombre;
    }

    public void enviar(String mensaje) {
        chat.enviar(mensaje, this);
    }

    public void recibir(String mensaje, String emisor) {
        System.out.println(this.nombre + " recibió de " + emisor + ": " + mensaje);
    }
}