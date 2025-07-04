package com.patrones.Creacionales.Singleton;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ejemplo de cuando no aplicamos Singleton:");

        // Se obtienen 3 instancias usando la clase mal implementada
        ConexionDB conexionDB1 = ConexionDB.obtenerConexionDB();
        ConexionDB conexionDB2 = ConexionDB.obtenerConexionDB();
        ConexionDB conexionDB3 = ConexionDB.obtenerConexionDB();

        // Imprimimos el hashCode para ver que son distintas instancias
        System.out.println(conexionDB1.hashCode());
        System.out.println(conexionDB2.hashCode());
        System.out.println(conexionDB3.hashCode());

        // Al tener distintos códigos hash, cada objeto es una instancia diferente
        // Esto NO cumple con el patrón Singleton

        System.out.println("--------------/////////////////////------------------");

        System.out.println("Ejemplo de cuando usamos Singleton:");

        // Se obtienen 3 instancias usando la clase Singleton correcta
        ConexionDBSingleton conexionDBSingleton1 = ConexionDBSingleton.obtenerConexionDB();
        ConexionDBSingleton conexionDBSingleton2 = ConexionDBSingleton.obtenerConexionDB();
        ConexionDBSingleton conexionDBSingleton3 = ConexionDBSingleton.obtenerConexionDB();

        // Imprimimos el hashCode para ver que son la misma instancia
        System.out.println(conexionDBSingleton1.hashCode());
        System.out.println(conexionDBSingleton2.hashCode());
        System.out.println(conexionDBSingleton3.hashCode());

        // Al imprimir, los códigos hash serán iguales, indicando que es la misma
        // instancia
        // Esto cumple con el patrón Singleton
    }
}
