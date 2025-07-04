# 🔗 Patrón Chain of Responsibility

El patrón **Chain of Responsibility** es un patrón de comportamiento que permite pasar una solicitud a lo largo de una cadena de objetos hasta que alguno la maneje.  
Cada objeto decide si procesa la solicitud o la pasa al siguiente en la cadena.

---

## ✅ Problema

Cuando una solicitud puede ser manejada por diferentes objetos, tener todo el código de manejo en un solo lugar genera código difícil de mantener y extender.

---

## 🧠 Solución con Chain of Responsibility

- Encadenar objetos receptores que tienen una referencia al siguiente.  
- Cada objeto decide si maneja la solicitud o la pasa al siguiente.  
- Desacopla el emisor de la solicitud de sus manejadores.

---

## 🧪 Ejemplo

### Sin patrón

```java
SoporteTecnico soporte = new SoporteTecnico();

soporte.resolverTicket(t1);
soporte.resolverTicket(t2);
```

Con patrón

```java
IHandler nivel1 = new SoporteNivel1();
IHandler nivel2 = new SoporteNivel2();
IHandler nivel3 = new SoporteNivel3();

nivel1.setSiguiente(nivel2);
nivel2.setSiguiente(nivel3);

nivel1.manejar(t1);
nivel1.manejar(t2);

```

📌 Diagrama simple

Cliente --> SoporteNivel1 --> SoporteNivel2 --> SoporteNivel3
                           (pasa la solicitud si no la maneja)



🧩 Participantes
 - IHandler: interfaz común para los manejadores.

 - SoporteNivel1, SoporteNivel2, SoporteNivel3: manejadores concretos que deciden si procesan o pasan la solicitud.

 - Cliente: inicia la cadena enviando la solicitud al primer manejador.



📚 Referencia

 - Patrón Chain of Responsibility

 - Categoría: Patrones de Comportamiento

 - Relacionado con: Command, Mediator, State