# 👁️ Patrón Observer

El patrón **Observer** es un patrón de comportamiento que define una dependencia uno-a-muchos entre objetos,  
de modo que cuando **uno cambia de estado**, todos sus **dependientes son notificados automáticamente**.

---

## ✅ Problema

Cuando múltiples objetos necesitan reaccionar ante cambios en otro objeto,  
tener referencias directas entre ellos produce **acoplamiento fuerte y difícil mantenimiento**.

---

## 🧠 Solución con Observer

- Crear una **interfaz Observer** con un método `actualizar`.  
- El **Sujeto (observable)** mantiene una lista de observadores y los notifica cuando su estado cambia.  
- Cada **Observer** puede reaccionar de forma independiente a las notificaciones.

---

## 🧪 Ejemplo

### Sin patrón

```java
servicio.setClima("Soleado");
servicio.notificarDispositivos(); // Notifica directamente a cada uno
```


Con patrón



```java
servicio.registrar(app);
servicio.registrar(reloj);
servicio.setClima("Lluvia"); // Todos son notificados automáticamente

```

📌 Diagrama simple
Cliente --> Sujeto --> IObservador --> ObservadorA
                            ↘            ↘
                          ObservadorB   ObservadorC



🧩 Participantes
 - ISujeto: interfaz que declara métodos para registrar, remover y notificar observadores.

 - ServicioMeteorologico: sujeto concreto que notifica a sus observadores.

 - IObservador: interfaz que define el método actualizar.

 - AppMovil, RelojInteligente: observadores concretos que reaccionan al cambio.



📚 Referencia

 - Patrón Observer

 - Categoría: Patrones de Comportamiento

 - Relacionado con: Mediator, EventEmitter, MVC