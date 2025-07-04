# ✅ Patrón de Diseño Singleton

Este ejemplo ilustra la implementación correcta e incorrecta del patrón Singleton en Java.

---

## ❌ Implementación incorrecta (NO Singleton)

La clase `ConexionDB` permite crear múltiples instancias, lo que rompe el patrón Singleton.

- El constructor es público.
- El método `obtenerConexionDB()` crea un nuevo objeto cada vez que se llama.
- No hay control para limitar la instancia a una sola.

```java
public class ConexionDB {

    public ConexionDB() {
    }

    public static ConexionDB obtenerConexionDB() {
        return new ConexionDB();  // Siempre crea un nuevo objeto
    }
}
```

Problema: No se garantiza una única instancia. Cada llamada crea un objeto distinto.

✅ Implementación correcta (Singleton)
La clase ConexionDBSingleton asegura que solo exista una instancia durante toda la ejecución del programa.

 - Constructor privado para evitar instanciación externa.

 - Instancia privada y estática que se crea solo una vez.

 - Método público estático que devuelve la instancia única.

```java
 public class ConexionDBSingleton {

    private static ConexionDBSingleton conexion;

    private ConexionDBSingleton() {
    }

    public static ConexionDBSingleton obtenerConexionDB() {
        if (conexion == null) {
            conexion = new ConexionDBSingleton();
        }
        return conexion;
    }
}
```

Beneficios:

 - Control total de la instancia.

 - Asegura que solo haya un objeto compartido.

 - Ideal para recursos compartidos, como conexiones a bases de datos, logs, configuración, etc.

 Ejemplo en Main.java


```java
public class Main {

    public static void main(String[] args) {

        // Versión incorrecta
        ConexionDB c1 = ConexionDB.obtenerConexionDB();
        ConexionDB c2 = ConexionDB.obtenerConexionDB();
        System.out.println(c1.hashCode());  // Diferente
        System.out.println(c2.hashCode());  // Diferente

        // Versión correcta
        ConexionDBSingleton s1 = ConexionDBSingleton.obtenerConexionDB();
        ConexionDBSingleton s2 = ConexionDBSingleton.obtenerConexionDB();
        System.out.println(s1.hashCode());  // Igual
        System.out.println(s2.hashCode());  // Igual
    }
}

```

Nota
Esta implementación clásica de Singleton no es segura para entornos multihilo. Para aplicaciones concurrentes, es necesario implementar mecanismos de sincronización para evitar la creación de múltiples instancias.

Referencias
 - Patrón Singleton en Design Patterns: Elements of Reusable Object-Oriented Software

 - Uso común en manejo de recursos compartidos, configuración global y control de acceso a servicios.