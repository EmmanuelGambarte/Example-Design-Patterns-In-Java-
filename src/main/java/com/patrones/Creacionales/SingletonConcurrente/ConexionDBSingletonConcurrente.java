package com.patrones.Creacionales.SingletonConcurrente;

public class ConexionDBSingletonConcurrente {

    // Instancia privada estática y volátil para asegurar visibilidad entre hilos
    private static volatile ConexionDBSingletonConcurrente instancia;

    // Constructor privado evita instanciación externa
    private ConexionDBSingletonConcurrente() {
    }

    // Método público para obtener la instancia única, con sincronización doble
    // chequeo (Double-Check Locking)
    public static ConexionDBSingletonConcurrente obtenerConexionDB() {
        if (instancia == null) { // Primer chequeo sin bloqueo para eficiencia
            synchronized (ConexionDBSingletonConcurrente.class) {
                if (instancia == null) { // Segundo chequeo dentro del bloqueo para evitar múltiples instancias
                    instancia = new ConexionDBSingletonConcurrente();
                }
            }
        }
        return instancia;
    }
}
