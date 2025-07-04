package com.patrones.Comportamiento.Mediator;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== ❌ Sin aplicar Mediator ===");
        UsuarioDirecto juan = new UsuarioDirecto("Juan");
        UsuarioDirecto ana = new UsuarioDirecto("Ana");
        UsuarioDirecto lucas = new UsuarioDirecto("Lucas");

        // Cada usuario debe saber a quién le habla
        juan.enviarMensaje("Hola Ana!", ana);
        ana.enviarMensaje("Hola Juan, todo bien!", juan);
        lucas.enviarMensaje("Hola a ambos!", juan); // No escala bien con muchos usuarios

        System.out.println("\n=== ✅ Aplicando el patrón Mediator ===");
        IChatRoom chatRoom = new ChatRoomConcreto();

        Usuario jose = new Usuario("José", chatRoom);
        Usuario maria = new Usuario("María", chatRoom);
        Usuario pedro = new Usuario("Pedro", chatRoom);

        jose.enviar("Hola a todos!");
        maria.enviar("Hola José!");
        pedro.enviar("Buen día grupo!");
    }
}
