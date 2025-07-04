package com.patrones.Creacionales.SingletonConcurrente;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Singleton mal implementado para concurrencia ===");

        // Lanzamos varios hilos para obtener la instancia simultáneamente
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                ConexionDB instancia = ConexionDB.obtenerConexionDB();
                System.out.println(Thread.currentThread().getName() + ": " + instancia.hashCode());
            }).start();
        }

        // Pausa para evitar mezcla de salidas
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        System.out.println("--------------//////////////////////////-----------------");

        System.out.println("=== Singleton bien implementado (Thread-safe) ===");

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                ConexionDBSingletonConcurrente instancia = ConexionDBSingletonConcurrente.obtenerConexionDB();
                System.out.println(Thread.currentThread().getName() + ": " + instancia.hashCode());
            }).start();
        }

        // Pausa para evitar que termine el programa antes de mostrar hashCode
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        ConexionDBSingletonConcurrente c1 = ConexionDBSingletonConcurrente.obtenerConexionDB();
        ConexionDBSingletonConcurrente c2 = ConexionDBSingletonConcurrente.obtenerConexionDB();

        System.out.println("HashCodes finales (bien implementado):");
        System.out.println(c1.hashCode()); // Igual
        System.out.println(c2.hashCode()); // Igual
    }
}
