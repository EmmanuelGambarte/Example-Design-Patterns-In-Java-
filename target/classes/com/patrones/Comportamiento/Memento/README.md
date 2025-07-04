# 🧾 Patrón Memento

El patrón **Memento** es un patrón de comportamiento que permite guardar y restaurar el estado anterior de un objeto **sin violar el principio de encapsulamiento**.

---

## ✅ Problema

Cuando se necesita una funcionalidad de **deshacer (undo)** o **revertir**, guardar manualmente el estado de los objetos en el cliente rompe la encapsulación y genera código difícil de mantener.

---

## 🧠 Solución con Memento

- Encapsular el estado interno de un objeto en un **memento**.
- Permitir que el objeto (originador) cree y restaure ese estado.
- El **cuidador** (caretaker) administra el historial de mementos sin modificar su contenido.

---

## 🧪 Ejemplo

### Sin patrón

```java
String backup = editor.getContenido();
editor.escribir("Texto nuevo");
// Deshacer
editor.setContenido(backup);
```

Con patrón

```java
historial.guardarEstado(editor.guardar());
editor.escribir("Texto nuevo");
// Deshacer
editor.restaurar(historial.deshacer());

```

📌 Diagrama simple
Cliente --> Historial --> Memento <-- Originador
                        ↑          ↓
                   guarda y restaura estado


🧩 Participantes
 - Memento: objeto que almacena el estado interno del originador.

 - Originador: objeto cuyo estado puede cambiar; puede crear y restaurar mementos.

 - Cuidador (Historial): administra los mementos, pero no conoce su contenido interno.

 - Cliente: solicita guardar/restaurar el estado.



📚 Referencia

 - Patrón Memento

 - Categoría: Patrones de Comportamiento

 - Relacionado con: Command, State, Prototype