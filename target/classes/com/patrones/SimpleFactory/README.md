# 🏭 Patrón de Diseño: Simple Factory

Este proyecto muestra una implementación del patrón **Simple Factory** en Java a través de un ejemplo simple de una **pizzería** 🍕.

---

## 📌 ¿Qué es Simple Factory?

El patrón **Simple Factory** encapsula la creación de objetos en una clase separada llamada "fábrica". Aunque no forma parte de los 23 patrones originales del *Gang of Four (GoF)*, es ampliamente usado como paso previo al patrón Factory Method.

---

## 🎯 Objetivo

Evitar que el cliente tenga que conocer detalles sobre cómo se construyen los objetos, centralizando esa lógica en una clase *fábrica*.

---

## 🧩 Diagrama UML (simplificado)

```plaintext
Cliente
  |
  v
+---------+           +----------+
|  Main   | ------->  | Pizzeria |
+---------+           +----------+
                          |
         +----------------+------------------+
         |                |                  |
         v                v                  v
   PizzaChica       PizzaMediana        PizzaGrande

```
---

## 📦 Estructura de Clases

### `Pizza.java`

Representa el producto que se quiere construir.

```java
public class Pizza {
    private int cantidadRebanadas;

    public Pizza(int cantidadRebanadas) {
        this.cantidadRebanadas = cantidadRebanadas;
    }

    @Override
    public String toString() {
        return "Cantidad de rebanadas: " + this.cantidadRebanadas;
    }
}

```

Pizzeria.java
Es la fábrica que encapsula la lógica de creación de pizzas.

```java
public class Pizzeria {
    public Pizza crearPizzaChica() {
        return new Pizza(6);
    }

    public Pizza crearPizzaMediana() {
        return new Pizza(8);
    }

    public Pizza crearPizzaGrande() {
        return new Pizza(12);
    }
}

```

Main.java
Actúa como el cliente, que puede pedir pizzas sin conocer cómo se construyen.

```java
public class Main {
    public static void main(String[] args) {
        // Sin usar Simple Factory
        Pizza pizzaPeperoni = new Pizza(8);
        System.out.println("Sin usar Simple Factory: " + pizzaPeperoni);

        // Usando Simple Factory
        Pizzeria pizzeriaCF = new Pizzeria();
        Pizza pizzaPeperoniChica = pizzeriaCF.crearPizzaChica();
        System.out.println("Usando Simple Factory: " + pizzaPeperoniChica);
    }
}
```

✅ Ventajas

 - El cliente no necesita conocer detalles internos de construcción.

 - Se centraliza y organiza la lógica de creación.

Facilita validaciones o configuraciones adicionales al construir.

❌ Desventajas
 - Si hay muchos tipos, la clase fábrica puede crecer demasiado.

 - No es tan extensible como el patrón Factory Method o Abstract Factory.

 🧠 Cuándo usar este patrón
Usalo cuando:

 - Necesites encapsular la lógica de creación de objetos.

 - Quieras reducir el acoplamiento entre el cliente y las clases concretas.

 - Tengas construcciones repetidas en varios lugares del código.

 
