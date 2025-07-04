# 🧠 Patrón Strategy

El patrón **Strategy** es un patrón de comportamiento que permite definir **una familia de algoritmos**, encapsular cada uno, y hacerlos **intercambiables**.  
Permite que el algoritmo varíe independientemente del cliente que lo utiliza.

---

## ✅ Problema

Cuando un objeto tiene múltiples formas de realizar una tarea (por ejemplo, distintos métodos de pago),  
es común usar `if` o `switch`, lo que **acopla el código** y dificulta su mantenimiento o extensión.

---

## 🧠 Solución con Strategy

- Definir una interfaz común para todas las estrategias.
- Implementar diferentes estrategias que cumplan esa interfaz.
- El objeto cliente (contexto) elige y usa la estrategia adecuada **en tiempo de ejecución**.

---

## 🧪 Ejemplo

### Sin patrón

```java
if (metodo.equals("efectivo")) {
    // lógica
} else if (metodo.equals("tarjeta")) {
    // lógica
}
```java

Con patrón

```java
Tienda tienda = new Tienda(new PagoEfectivo());
tienda.realizarPago(150);

tienda.setMetodoPago(new PagoTarjeta());
tienda.realizarPago(250);

```

📌 Diagrama simple
Cliente --> Contexto --> IMetodoPago
                        ↙         ↘
              PagoEfectivo    PagoTarjeta


🧩 Participantes
 - IMetodoPago: interfaz común para las estrategias.

 - PagoEfectivo, PagoTarjeta: estrategias concretas.

 - Tienda: contexto que utiliza una estrategia para realizar el pago.

 - Main: cliente que configura y usa el sistema.



📚 Referencia

 - Patrón Strategy

 - Categoría: Patrones de Comportamiento

 - Relacionado con: State, Template Method, Command