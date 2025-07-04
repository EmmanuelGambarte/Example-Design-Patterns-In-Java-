# 🧱 Patrón Facade

El patrón **Facade** (fachada) es un patrón estructural que proporciona una interfaz unificada y simplificada para un conjunto de interfaces en un subsistema. Su objetivo es ocultar la complejidad del sistema y facilitar su uso desde el exterior.

---

## ✅ Problema

Cuando un cliente necesita interactuar con varios objetos directamente (como CPU, Memoria y DiscoDuro), el sistema se vuelve más complejo y acoplado. Cada vez que se quiere iniciar el sistema, el cliente debe conocer el orden y la lógica interna de las operaciones.

---

## 🧠 Solución con Facade

Se crea una clase `ComputadoraFacade` que encapsula las llamadas a los distintos subsistemas (`CPU`, `Memoria`, `DiscoDuro`) y expone un único método de alto nivel (`iniciarSistema()`).

Esto **simplifica la interacción del cliente** y oculta los detalles de implementación.

---

## 🧪 Ejemplo

### ❌ Sin aplicar el patrón Facade

```java
CPU cpu = new CPU();
Memoria memoria = new Memoria();
DiscoDuro disco = new DiscoDuro();

cpu.encender();
memoria.cargarDatos();
disco.leerSector();
```

El cliente conoce e interactúa con todas las clases.

✅ Aplicando el patrón Facade

```java
ComputadoraFacade computadora = new ComputadoraFacade();
computadora.iniciarSistema();
```

El cliente interactúa con una única clase que simplifica el uso del sistema.

📌 Diagrama simple
Sin patrón:

Cliente --> CPU
        --> Memoria
        --> DiscoDuro


Cliente --> ComputadoraFacade --> CPU
                            --> Memoria
                            --> DiscoDuro

📝 Conclusión
El patrón Facade permite reducir el acoplamiento entre el cliente y un sistema complejo. Es especialmente útil para simplificar APIs, sistemas legacy o cuando se desea encapsular procesos internos complejos detrás de una interfaz simple.


🧩 Participantes
CPU, Memoria, DiscoDuro: subsistemas internos.

 - ComputadoraFacade: clase fachada que delega las operaciones.

 - Main: cliente que consume la fachada.

 📚 Referencia  
Patrón Facade

- Categoría: Patrones Estructurales
- Relacionado con: Mediator, Singleton

