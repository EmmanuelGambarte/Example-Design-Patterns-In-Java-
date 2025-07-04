# 🔍 Patrón Iterador

El patrón **Iterador** es un patrón de comportamiento que proporciona una forma de acceder secuencialmente a los elementos de un objeto agregado sin exponer su representación interna.

---

## ✅ Problema

Cuando una colección tiene una estructura interna compleja, exponer esa estructura para recorrer sus elementos genera acoplamiento y riesgos de romper encapsulación.

---

## 🧠 Solución con Iterador

- Definir una interfaz para iterar elementos (métodos como `tieneSiguiente` y `siguiente`).  
- Crear clases iteradoras concretas que implementen esa interfaz para distintas colecciones.  
- La colección proporciona un método para obtener su iterador sin exponer su estructura interna.

---

## 🧪 Ejemplo

### Sin patrón

```java
for (int i = 0; i < coleccion.size(); i++) {
    System.out.println(coleccion.get(i));
}
```

Con patrón

```java
IIterador iterador = coleccion.crearIterador();

while(iterador.tieneSiguiente()) {
    System.out.println(iterador.siguiente());
}

```

📌 Diagrama simple

Cliente --> IColeccion --> IIterador --> ColeccionConcreta / IteradorConcreto


🧩 Participantes
 - IIterador: interfaz para recorrer elementos.

 - IColeccion: interfaz para crear iteradores.

 - ColeccionConcreta: implementación de la colección.

 - IteradorConcreto: implementación del iterador concreto.

 - Cliente: usa el iterador para acceder a los elementos.


📚 Referencia

 - Patrón Iterador

 - Categoría: Patrones de Comportamiento

 - Relacionado con: Composite, Visitor, Mediator