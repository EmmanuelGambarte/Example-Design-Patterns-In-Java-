# ✅ Principio SOLID: Single Responsibility Principle (SRP)

Este ejemplo muestra cómo aplicar el **Principio de Responsabilidad Única (SRP)**, el cual establece que:

> "Una clase debe tener una sola razón para cambiar."

---

## ❌  💡 Problema

En la clase `Rectangulo`, violamos el SRP porque la clase:

- Calcula el área del rectángulo (**responsabilidad lógica**)
- Imprime sus datos en consola (**responsabilidad de presentación**)

 ### ❌ Ejemplo incorrecto

```java
Rectangulo r = new Rectangulo(10, 20);
r.imprimir(); // Imprime dentro de la misma clase
```

---

### ❌ Ejemplo incorrecto

```java
Rectangulo r = new Rectangulo(10, 20);
r.imprimir(); // Imprime desde la misma clase que modela los datos
```

---


✅ Solución
Separamos la lógica de presentación en otra clase llamada Presentacion. Así:

 - RectanguloSRP: solo contiene datos y operaciones del rectángulo.

 - Presentacion: se encarga de mostrar los datos por consola.

✔ Ejemplo correcto

```java
RectanguloSRP r = new RectanguloSRP(10, 20);
Presentacion presentacion = new Presentacion();
presentacion.imprimir(r);
```

🧩 Estructura del código

SingleResponsibilityPrinciple/
├── Main.java                  # Clase ejecutora
├── Rectangulo.java            # Violación de SRP
├── RectanguloSRP.java         # Cumple con SRP
└── Presentacion.java          # Se encarga de la salida por consola


📚 Referencia
- S: Single Responsibility Principle

- Es el primer principio del conjunto SOLID, pilares fundamentales del diseño orientado a objetos.