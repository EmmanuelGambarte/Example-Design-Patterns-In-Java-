package com.patrones.Creacionales.Singleton;

// Clase Singleton que garantiza una única instancia de ConexionDBSingleton
public class ConexionDBSingleton {

    // Instancia estática privada que almacenará el único objeto de la clase
    private static ConexionDBSingleton conexion;

    // Constructor privado para evitar instanciación directa fuera de la clase
    private ConexionDBSingleton() {
    }

    // Método estático que devuelve la instancia única,
    // creando el objeto si aún no existe
    public static ConexionDBSingleton obtenerConexionDB() {
        if (conexion == null) {
            conexion = new ConexionDBSingleton();
        }
        return conexion;
    }
}