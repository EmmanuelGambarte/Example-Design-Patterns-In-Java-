# 📘 Java Design Patterns Examples

Este repositorio contiene implementaciones **prácticas, simples y comentadas** de los principales **Patrones de Diseño de Software** y los **principios SOLID**, utilizando el lenguaje **Java**.

El objetivo es mostrar de forma clara la diferencia entre un código que **no aplica el patrón o principio** y otro que **sí lo aplica**, con ejemplos ejecutables desde una única clase `Main` por cada caso.

---

## 📁 Estructura del proyecto

```
com.patrones
├── SimpleFactory
├── SOLID
│ ├── SingleResponsabilityPrinciple
│ ├── Open-Close
│ ├── Liskov
│ ├── InterfaceSegregation
│ └── InversionDeDependencia
├── Creacionales
│ ├── Singleton
│ ├── Factory Method
│ ├── Abstract Factory
│ └── Builder
├── Estructurales
│ ├── Adapter
│ ├── Composite
│ ├── Decorator
│ ├── Facade
│ ├── Proxy
│ ├── Flyweight
│ └── Bridge
└── Comportamiento
├── Chain of Responsibility
├── Command
├── Strategy
├── Template Method
├── Observer
├── State
├── Iterator
├── Mediator
├── Memento
└── Visitor
```


---

## 🚀 Cómo ejecutar los ejemplos

Cada patrón o principio cuenta con una clase `Main.java` con dos bloques:

- ❌ Ejemplo **sin aplicar** el patrón o principio
- ✅ Ejemplo **aplicando correctamente** el patrón o principio

### 📦 Requisitos

- JDK 17+ (puede funcionar con versiones anteriores)
- Un IDE como IntelliJ IDEA o VS Code
- Compilador Java (`javac`)

### ▶️ Ejecutar

```bash
javac com/patrones/.../Main.java
java com.patrones...Main
```

O abrí el proyecto en tu IDE y ejecutá las clases Main.

📚 Contenido del proyecto
✅ Patrones de Diseño
Creacionales: patrones relacionados con la creación de objetos.

Estructurales: patrones que estructuran la relación entre clases/objetos.

Comportamiento: patrones que definen cómo interactúan los objetos entre sí.

Cada patrón incluye:

Código sin aplicar el patrón

Código aplicando correctamente el patrón

Clases comentadas

README.md con:

Explicación

Ventajas

Diagrama simple ASCII

Patrón relacionado

🧱 Otros temas incluidos
Simple Factory: patrón simple para iniciarse en el diseño orientado a objetos.

Principios SOLID:

S — Responsabilidad Única (SRP)

O — Abierto/Cerrado (OCP)

L — Sustitución de Liskov (LSP)

I — Segregación de Interfaces (ISP)

D — Inversión de Dependencias (DIP)

Cada principio incluye:

Código que viola el principio

Código que lo aplica correctamente

Comentarios explicativos

README.md para cada uno

🎯 Propósito del repositorio
📚 Entender qué problema resuelve cada patrón o principio

💡 Ver cómo se aplica con ejemplos simples

🔎 Comparar la diferencia entre mal diseño y buen diseño

🧠 Tener un repositorio personal de referencia para entrevistas o estudio

👨‍💻 Autor
Emmanuel Gambarte
Desarrollador Full Stack
GitHub

📌 Referencias
Design Patterns: Elements of Reusable Object-Oriented Software (Gang of Four)

Refactoring.Guru

Principios SOLID explicados

✅ Licencia
Este repositorio está disponible bajo la licencia MIT.
