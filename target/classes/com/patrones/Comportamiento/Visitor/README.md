# 👁️ Patrón Visitor

El patrón **Visitor** es un patrón de comportamiento que permite definir una nueva operación sin cambiar las clases de los elementos sobre los que opera.  
Separa el algoritmo de la estructura de objetos, permitiendo agregar funcionalidades sin modificar los elementos.

---

## ✅ Problema

Cuando se tienen muchas clases de elementos con operaciones específicas,  
agregar nuevas operaciones requiere modificar esas clases, violando el principio abierto/cerrado.

---

## 🧠 Solución con Visitor

- Definir una interfaz `IVisitor` con un método para cada tipo de elemento.  
- Los elementos implementan una interfaz que acepta un visitante (`aceptar`).  
- El visitante implementa las operaciones específicas para cada tipo.  
- Así se pueden agregar operaciones nuevas sin modificar los elementos.

---

## 🧪 Ejemplo

### Sin patrón

```java
if (figura instanceof Cuadrado) {
    // dibujar cuadrado
} else if (figura instanceof Circulo) {
    // dibujar círculo
}
```

Con patron

```java
cuadrado.aceptar(dibujante);
circulo.aceptar(dibujante);

```

📌 Diagrama simple

Cliente --> IElemento <-- CuadradoV
                  ↘
                   IVisitor <-- Dibujante
                  ↗
              CirculoV


🧩 Participantes
 - IElemento: interfaz para elementos que aceptan visitantes.

 - CuadradoV, CirculoV: elementos concretos que implementan IElemento.

 - IVisitor: interfaz visitante con métodos para cada tipo de elemento.

 - Dibujante: visitante concreto que implementa operaciones.

 - Main: cliente que usa visitantes para operar sobre elementos.



📚 Referencia

 - Patrón Visitor

 - Categoría: Patrones de Comportamiento

 - Relacionado con: Composite, Strategy, Iterator
