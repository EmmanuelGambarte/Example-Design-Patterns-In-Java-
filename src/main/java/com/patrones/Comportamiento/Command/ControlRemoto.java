package com.patrones.Comportamiento.Command;

// Invocador: clase que sabe cómo ejecutar un comando
class ControlRemoto {
    private ICommand comando;

    // Permite cambiar el comando que se va a ejecutar
    public void setComando(ICommand comando) {
        this.comando = comando;
    }

    // Ejecuta el comando actual si existe
    public void presionarBoton() {
        if (comando != null) {
            comando.ejecutar();
        }
    }
}