# 🔄 Principio SOLID: Liskov Substitution Principle (LSP)

Este ejemplo demuestra cómo **cumplir** y cómo **violar** el Principio de Sustitución de Liskov (LSP), uno de los principios SOLID.

> "Las clases derivadas deben poder ser sustituidas por sus clases base sin alterar el comportamiento del programa."

---

## ❌ Ejemplo que **VIOLA** LSP

La clase `GatoDomestico` **hereda** de `Jaguar`, pero:

- Lanza una excepción en el método `rugir()`, que no tiene sentido para un gato.
- Tiene un comportamiento diferente en `cazar()` (el gato juega en lugar de cazar).

Esto **rompe el principio** porque una instancia de `GatoDomestico` **no puede ser usada como si fuera** un `Jaguar`.

```java
Jaguar otroJaguar = new GatoDomestico(); 
otroJaguar.emitirSonido(); // ⚠️ Comportamiento no esperado
```
✅ Ejemplo que CUMPLE LSP
Creamos una interfaz IFelinoPSL y hacemos que tanto Jaguar como GatoDomesticoPSL la implementen. Así:

 - Cada clase define su propio comportamiento sin heredar lo que no necesita.

 - Se pueden usar de forma intercambiable sin romper el programa.

 ```java
IFelinoPSL felino = new GatoDomesticoPSL();
felino.emitirSonido(); // ✅ El gato maúlla
 ```

 🧩 Estructura del proyecto

 Liskov/
├── Main.java               # Clase principal con ejemplos
├── Jaguar.java             # Clase que cumple LSP
├── GatoDomestico.java      # ❌ Viola el principio LSP
├── GatoDomesticoPSL.java   # ✅ Aplica correctamente LSP
├── IFelinoPSL.java         # Interfaz común


📚 Referencia
 - L: Liskov Substitution Principle

 - Parte de los principios SOLID para diseño orientado a objetos.