# 🧭 Patrón Mediator

El patrón **Mediator** es un patrón de comportamiento que encapsula cómo interactúan un conjunto de objetos.  
Promueve un **acoplamiento débil** al evitar que los objetos se refieran explícitamente entre sí.

---

## ✅ Problema

Cuando muchos objetos se comunican directamente entre sí, el sistema se vuelve difícil de mantener, escalar y probar debido a la gran cantidad de dependencias entre objetos.

---

## 🧠 Solución con Mediator

- Introducir un **objeto mediador** que coordine la comunicación entre los objetos (colegas).
- Los objetos ya no se refieren entre sí, sino que se comunican a través del mediador.

---

## 🧪 Ejemplo

### Sin patrón

```java
juan.enviarMensaje("Hola Ana!", ana);
ana.enviarMensaje("Hola Juan!", juan);
lucas.enviarMensaje("Hola!", juan);
```

Con patrón

```java
IChatRoom chatRoom = new ChatRoomConcreto();

Usuario jose = new Usuario("José", chatRoom);
Usuario maria = new Usuario("María", chatRoom);

jose.enviar("Hola a todos!");
maria.enviar("Hola José!");

```

📌 Diagrama simple

Usuario ↔ ChatRoom ↔ Usuario
       ↖         ↗
     (todos se comunican a través del mediador)



🧩 Participantes

 - IChatRoom: interfaz del mediador.

 - ChatRoomConcreto: mediador concreto que coordina la comunicación entre usuarios.

 - Usuario: objetos colegas que se comunican solo a través del mediador.

 - Main: el cliente que configura y usa el sistema.


📚 Referencia

 - Patrón Mediator

 - Categoría: Patrones de Comportamiento

 - Relacionado con: Observer, Command, Chain of Responsibility