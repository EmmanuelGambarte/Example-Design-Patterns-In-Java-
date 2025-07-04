package com.patrones.Estructurales.ProxyVirtual;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ❌ Sin usar Proxy Virtual ===");

        // El objeto real se carga aunque nunca se muestre
        ImagenReal imagenPesada = new ImagenReal("foto-vacaciones.jpg");
        System.out.println("Haciendo otras cosas sin mostrar la imagen...");
        // imagenPesada.mostrar(); // Ni siquiera se muestra

        System.out.println("\n=== ✅ Usando Proxy Virtual ===");

        // El proxy retrasa la creación hasta que realmente se llama a mostrar()
        IImagen imagenConProxy = new ProxyImagen("foto-vacaciones.jpg");

        System.out.println("Realizando tareas... aún no se muestra la imagen");
        System.out.println("Mostrando imagen por primera vez:");
        imagenConProxy.mostrar(); // Ahora se carga

        System.out.println("Mostrando imagen por segunda vez:");
        imagenConProxy.mostrar(); // Ya estaba cargada
    }
}