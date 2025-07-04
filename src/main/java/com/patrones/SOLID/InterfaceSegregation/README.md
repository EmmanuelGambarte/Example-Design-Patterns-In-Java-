# ✅ Principio SOLID: Interface Segregation Principle (ISP)

Este ejemplo demuestra cómo **violar** y cómo **cumplir** el **Principio de Segregación de Interfaces (ISP)**, que dice:

> "Ningún cliente debe estar obligado a depender de interfaces que no utiliza."

---

## ❌ Violación del ISP

La clase `Jaguar` implementa una interfaz `IFelino` que **obliga a implementar métodos innecesarios** como `maullar()`, algo que no tiene sentido en un jaguar.

### Problemas:
- Métodos forzados que no aplican al contexto real.
- Implementaciones vacías o que lanzan excepciones.
- Dificulta la mantenibilidad y la reutilización de código.

```java
Jaguar jaguar = new Jaguar();
jaguar.maullar(); // ⚠️ "Error, el jaguar no maulla"
```

✅ Aplicación correcta del ISP
Se crean interfaces específicas para cada tipo de felino:

 - IFelinoSalvajeIS: para felinos salvajes que rugen.

 - IFelinoCaseroIS: para felinos domésticos que maúllan.

 - Ambas extienden una interfaz común IFelinoIS que solo contiene el método cazar().

Beneficios:
 - Cada clase implementa solo lo que necesita.

 - Se evitan dependencias innecesarias.

 - Código más limpio, mantenible y extensible.

 ```java
JaguarIS jaguarIS = new JaguarIS();
jaguarIS.rugir();  // ✅
jaguarIS.cazar();  // ✅
 ```

 🧩 Estructura del código

 InterfaceSegregation/
├── Main.java                # Clase principal con ejemplos
├── IFelino.java             # ❌ Interfaz incorrecta (rompe ISP)
├── Jaguar.java              # ❌ Clase que viola ISP
├── IFelinoIS.java           # ✅ Interfaz base
├── IFelinoSalvajeIS.java    # ✅ Interfaz para felinos salvajes
├── IFelinoCaseroIS.java     # ✅ Interfaz para felinos domésticos
├── JaguarIS.java            # ✅ Clase correcta que implementa solo lo necesario


📚 Referencia
 - I: Interface Segregation Principle

 - Parte de los principios SOLID para diseño orientado a objetos.