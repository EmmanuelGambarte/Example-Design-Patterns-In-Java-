# ✅ Principio SOLID: Inversión de Dependencias (DIP)

Este ejemplo demuestra cómo **violar** y cómo **aplicar correctamente** el Principio de Inversión de Dependencias (DIP), que establece:

> "Los módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos deben depender de abstracciones."

---

## ❌ Violación de DIP

La clase `Computadora` depende **directamente** de las clases concretas `Teclado` y `Mouse`. Esto genera un fuerte **acoplamiento**:

- No se puede cambiar el tipo de teclado o mouse sin modificar la clase `Computadora`.
- No hay forma de sustituir los componentes sin cambiar su implementación.
- Viola **cuatro** principios SOLID: DIP, OCP, SRP y LSP.

```java
public class Computadora {
    private Teclado teclado;
    private Mouse mouse;

    public Computadora() {
        this.teclado = new Teclado(); // ❌ acoplamiento fuerte
        this.mouse = new Mouse();     // ❌ acoplamiento fuerte
    }

    public void encender() {
        teclado.conectar();
        mouse.conectar();
    }
}
```

✅ Aplicación correcta de DIP
La clase ComputadoraDIP depende de interfaces (ITeclado y IMouse) en lugar de implementaciones concretas:

 - Las dependencias se inyectan desde afuera (inyección de dependencias).

 - Permite cambiar fácilmente el tipo de teclado o mouse.

 - Cumple el principio de inversión de dependencias.

```java
 public class ComputadoraDIP {
    private ITeclado teclado;
    private IMouse mouse;

    public ComputadoraDIP(ITeclado teclado, IMouse mouse) {
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public void encenderDIP() {
        teclado.conectar();
        mouse.conectar();
    }
}
```

🧩 Estructura del código

InversionDeDependencia/
├── Main.java                 # Clase principal con ambos ejemplos
├── Computadora.java          # ❌ Ejemplo que viola DIP
├── Teclado.java              # ❌ Implementación concreta sin abstracción
├── Mouse.java                # ❌ Implementación concreta sin abstracción
├── ComputadoraDIP.java       # ✅ Ejemplo que aplica DIP
├── TecladoDIP.java           # ✅ Implementación concreta de ITeclado
├── MouseDIP.java             # ✅ Implementación concreta de IMouse
├── IComponente.java          # ✅ Abstracción común para todos los dispositivos
├── ITeclado.java             # ✅ Abstracción para teclado
├── IMouse.java               # ✅ Abstracción para mouse

📌 Conclusión
Este ejemplo muestra cómo, al utilizar interfaces en lugar de clases concretas:

✅ El código se vuelve más modular
✅ Es más fácil de probar, extender y mantener
✅ Se respeta el principio SOLID de Inversión de Dependencias

📚 Referencias
 - D: Dependency Inversion Principle

 - Parte de los principios SOLID de diseño orientado a objetos