# 🎮 Patrón Command

El patrón **Command** es un patrón de comportamiento que encapsula una solicitud como un objeto, permitiendo parametrizar clientes con diferentes solicitudes, poner en cola o registrar solicitudes, y soportar operaciones reversibles.

---

## ✅ Problema

Ejecutar operaciones directamente desde el cliente genera acoplamiento fuerte y código difícil de extender.

---

## 🧠 Solución con Command

- Encapsular cada operación en un objeto comando.  
- Invocador ejecuta comandos sin conocer su implementación.  
- Separa quien pide la acción de quien la realiza.

---

## 🧪 Ejemplo

### Sin patrón

```java
reproductor.reproducir();
reproductor.pausar();
```

Con patrón

```java
ControlRemoto control = new ControlRemoto();

ICommand play = new ComandoReproducir(reproductor);
ICommand pause = new ComandoPausar(reproductor);

control.setComando(play);
control.presionarBoton();

control.setComando(pause);
control.presionarBoton();

```

📌 Diagrama simple
Cliente --> Invocador --> Comando --> Receptor


🧩 Participantes
 - ICommand: interfaz para comandos.

 - ComandoReproducir, ComandoPausar, ComandoDetener: comandos concretos.

 - ReproductorMusica: receptor que realiza las acciones.

 - ControlRemoto: invocador que ejecuta comandos.



📚 Referencia

 - Patrón Command

 - Categoría: Patrones de Comportamiento

 - Relacionado con: Chain of Responsibility, Observer, Mediator