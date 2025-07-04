# ☕️ Patrón de Diseño: Decorator

El patrón **Decorator** permite agregar funcionalidades adicionales a un objeto **de forma dinámica**, sin modificar su estructura original. Se basa en **envolver** un objeto con otros objetos que agregan comportamiento.

---

## ❌ Sin aplicar Decorator

En este caso, cada tipo de café se representa con una clase diferente. Esto provoca:

- Duplicación de código.
- Dificultad para extender combinaciones (ej: café con leche y azúcar).
- Poco uso de la composición.

```java
CafeSimple cafeSimple = new CafeSimple();
System.out.println(cafeSimple.getDescripcion() + " - $" + cafeSimple.costo());

CafeConLeche cafeConLeche = new CafeConLeche();
System.out.println(cafeConLeche.getDescripcion() + " - $" + cafeConLeche.costo());
```

✅ Aplicando el patrón Decorator
Creamos un sistema flexible donde podemos combinar decoradores (leche, azúcar, etc.) alrededor de un café base:

```java
ICafe cafeBase = new CafeSimple();

ICafe cafeConLeche = new CafeConLecheDecorator(cafeBase);

ICafe cafeCompleto = new CafeConAzucar(cafeConLeche);

System.out.println(cafeBase.getDescripcion() + " - $" + cafeBase.costo());
System.out.println(cafeConLeche.getDescripcion() + " - $" + cafeConLeche.costo());
System.out.println(cafeCompleto.getDescripcion() + " - $" + cafeCompleto.costo());

```

🧩 Estructura del Código

Decorator/
├── Main.java                   # Cliente que usa ambos enfoques
├── CafeSimple.java             # Café base que implementa la interfaz ICafe
├── ICafe.java                  # Interfaz común
├── CafeDecorator.java          # Decorador abstracto
├── CafeConLecheDecorator.java  # Decorador concreto que agrega leche
├── CafeConAzucar.java          # Decorador concreto que agrega azúcar
├── Cafe.java                   # Clase simple sin usar patrón
├── CafeConLeche.java           # Clase simple sin usar patrón

✅ Beneficios del patrón
 - Abierto a extensión sin modificar código existente (Open/Closed Principle).

 - Composición flexible de funcionalidades.

 - Alternativa a la herencia para extender comportamiento.

📌 Diagrama simple
Cliente --> ICafe <-- CafeConAzucar --> CafeConLecheDecorator --> CafeSimple


📚 Referencias
🔹 Patrón Estructural: Decorator

🔹 Parte de los patrones clásicos de diseño de GoF (Gang of Four)
