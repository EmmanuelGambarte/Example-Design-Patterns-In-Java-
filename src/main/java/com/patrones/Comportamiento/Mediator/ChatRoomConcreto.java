package com.patrones.Comportamiento.Mediator;

import java.util.ArrayList;
import java.util.List;

// Clase concreta del Mediador
class ChatRoomConcreto implements IChatRoom {
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviar(String mensaje, Usuario emisor) {
        for (Usuario usuario : usuarios) {
            if (usuario != emisor) {
                usuario.recibir(mensaje, emisor.getNombre());
            }
        }
    }
}
