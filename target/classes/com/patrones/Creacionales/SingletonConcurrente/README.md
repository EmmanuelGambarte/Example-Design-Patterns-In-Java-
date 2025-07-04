# ✅ Patrón Singleton Concurrente en Java

Este ejemplo muestra cómo implementar el patrón Singleton para asegurar que **solo exista una instancia** de una clase en toda la aplicación, incluso en entornos con múltiples hilos (concurrencia).

---

## 🛑 Ejemplo mal implementado (NO thread-safe)

La clase `ConexionDB` crea la instancia sin protección contra acceso concurrente. Si varios hilos llaman al método para obtener la instancia al mismo tiempo, pueden crearse **múltiples instancias**, rompiendo la regla del Singleton.

```java
public class ConexionDB {

    private static ConexionDB instancia;

    private ConexionDB() {}

    public static ConexionDB obtenerConexionDB() {
        if (instancia == null) {
            // Sin sincronización, riesgo de crear varias instancias simultáneamente
            instancia = new ConexionDB();
        }
        return instancia;
    }
}
```

Resultado esperado
Cada hilo puede imprimir diferentes hashCodes para las instancias, mostrando que no es una única instancia.

✅ Ejemplo bien implementado (Thread-safe)
La clase ConexionDBSingletonConcurrente usa la técnica de Double-Check Locking con el modificador volatile para asegurar que:

 - Solo se crea una instancia única incluso con múltiples hilos.

 - Se evita sincronización costosa en cada llamada después de creada la instancia.

 ```java
public class ConexionDBSingletonConcurrente {

    private static volatile ConexionDBSingletonConcurrente instancia;

    private ConexionDBSingletonConcurrente() {}

    public static ConexionDBSingletonConcurrente obtenerConexionDB() {
        if (instancia == null) {
            synchronized (ConexionDBSingletonConcurrente.class) {
                if (instancia == null) {
                    instancia = new ConexionDBSingletonConcurrente();
                }
            }
        }
        return instancia;
    }
}

 ```

 Resultado esperado
Todos los hilos imprimen el mismo hashCode, demostrando que es la misma instancia compartida.

🧩 Estructura del código
SingletonConcurrente/
├── Main.java # Ejecuta la prueba con múltiples hilos
├── ConexionDB.java # Singleton mal implementado (no thread-safe)
├── ConexionDBSingletonConcurrente.java # Singleton bien implementado (thread-safe)


📌 Conclusión
El patrón Singleton garantiza una única instancia global.

 - En ambientes concurrentes, la implementación debe ser thread-safe para evitar múltiples instancias.

 - El uso de volatile y sincronización doble (Double-Check Locking) es una técnica común y eficiente para lograrlo en Java.


 📚 Referencias
Patrón Singleton - Wikipedia

 - Double-Check Locking en Java

 - Effective Java - Bloch, Joshua