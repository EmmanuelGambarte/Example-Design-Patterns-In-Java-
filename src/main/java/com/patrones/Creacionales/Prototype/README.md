# ✅ Patrón de Diseño: Prototype

Este ejemplo demuestra cómo **violar** y cómo **aplicar correctamente** el patrón de diseño **Prototype**, que forma parte de los patrones creacionales.

> 📌 **Definición**: El patrón Prototype permite crear nuevos objetos clonando una instancia existente, evitando la creación repetitiva manual.

---

## ❌ Sin aplicar Prototype

Creamos objetos similares instanciando **manualmente** con los mismos valores. Esto genera:

- Repetición de código.
- Alto acoplamiento si hay muchos atributos.
- Dificultad para mantener consistencia si cambia la estructura del objeto.

```java
Computadora computadora1 = new Computadora("Intel i7", 16, 512);
Computadora computadora2 = new Computadora("Intel i7", 16, 512); // ❌ Repetición manual
```

✅ Aplicando Prototype
Creamos una interfaz ClonablePrototype que define el método clonar() y cada clase concreta puede implementar su propia lógica de clonación.

Ventajas:

 - Evitamos repetir lógica.

 - Podemos clonar objetos complejos fácilmente.

 - Aislamos la lógica de creación.

```java
ComputadoraPrototype base = new ComputadoraPrototype("Intel i7", 16, 512);
ComputadoraPrototype copia = base.clonar(); // ✅ Copia exacta
```

🧩 Estructura del código
Prototype/
├── Main.java # Clase cliente
├── Computadora.java # ❌ Clase sin aplicar Prototype
├── ComputadoraPrototype.java # ✅ Clase con implementación del patrón
└── ClonablePrototype.java # ✅ Interfaz que define el método clonar()

📌 Conclusión
Usar el patrón Prototype es útil cuando:

✅ Necesitás duplicar objetos con muchos atributos.
✅ Crear objetos nuevos es costoso o complejo.
✅ Querés evitar instanciar manualmente.

📚 Referencia
 - Patrón Creacional: Prototype

 - Parte del catálogo de patrones de diseño de GoF (Gang of Four)