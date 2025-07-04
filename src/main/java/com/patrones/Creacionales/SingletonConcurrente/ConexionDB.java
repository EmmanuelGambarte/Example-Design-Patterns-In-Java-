package com.patrones.Creacionales.SingletonConcurrente;

public class ConexionDB {

    private static ConexionDB instancia;

    private ConexionDB() {
    }

    public static ConexionDB obtenerConexionDB() {
        if (instancia == null) {
            // Aquí no hay sincronización, por lo que varios hilos
            // pueden entrar al mismo tiempo y crear múltiples instancias
            instancia = new ConexionDB();
        }
        return instancia;
    }

}
