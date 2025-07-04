# ✅ Patrón de Diseño: Builder

Este ejemplo demuestra cómo **no aplicar** y cómo **aplicar correctamente** el patrón de diseño **Builder**, ideal para construir objetos complejos de forma clara, flexible y segura.

---

## ❌ Sin aplicar Builder

Se crea un objeto directamente usando un constructor con muchos parámetros:

- Difícil de leer y mantener.
- Propenso a errores al pasar los parámetros en orden incorrecto.
- No se manejan fácilmente parámetros opcionales o valores por defecto.

```java
Computadora computadora = new Computadora("Intel i7", 16, 512, true);
```

✅ Aplicando el patrón Builder
Se crea un Builder que permite construir el objeto paso a paso:

 - Mejora la legibilidad del código.

 - Permite encadenar métodos (fluent interface).

 - Es fácil agregar validaciones antes de crear el objeto.

 - Flexible para parámetros opcionales o configuraciones personalizadas.

```java
 Computadora computadora = new ComputadoraBuilder()
    .setProcesador("AMD Ryzen 7")
    .setRam(32)
    .setDisco(1024)
    .setTieneGpu(true)
    .build();
```

🧩 Estructura del código
Builder/
├── Computadora.java           # Clase con varios atributos
├── ComputadoraBuilder.java   # Builder para construir Computadora
├── Main.java                  # Clase principal con ejemplos


📌 Conclusión
El patrón Builder permite construir objetos complejos de forma clara y controlada. Es especialmente útil cuando:

✅ Hay muchos parámetros en el constructor
✅ Algunos atributos son opcionales
✅ Se necesita mayor flexibilidad y legibilidad en la construcción del objeto

📚 Referencias
 - B: Builder Pattern (Patrones Creacionales - GoF)

 - Parte del catálogo de patrones de diseño orientado a objetos