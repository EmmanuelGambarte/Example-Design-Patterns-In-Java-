# ✅ Patrón de Diseño: Adapter

Este ejemplo demuestra cómo **adaptar** una clase con una interfaz incompatible para que pueda ser utilizada por un cliente que espera otra interfaz.  
El patrón **Adapter** permite que dos interfaces incompatibles trabajen juntas sin modificar su código original.

---

## ❌ Sin aplicar el patrón Adapter

En este caso, la clase `EnchufeEuropeo` **no implementa** la interfaz `IEnchufeAmericano`, por lo que no puede ser utilizada directamente por el `Cliente`.

```java
EnchufeEuropeo europeo = new EnchufeEuropeo();
// cliente.usar(europeo); // ❌ Esto no compila: no implementa la interfaz esperada
```

✅ Aplicando el patrón Adapter
Creamos una clase AdaptadorEuropeo que implementa la interfaz esperada (IEnchufeAmericano) y adapta internamente una instancia de EnchufeEuropeo.

```java
IEnchufeAmericano adaptador = new AdaptadorEuropeo(new EnchufeEuropeo());
cliente.usar(adaptador); // ✅ Ahora sí es compatible
```

📌 Diagrama simple

Cliente --> IEnchufeAmericano <-- AdaptadorEuropeo --> EnchufeEuropeo

 - El cliente conoce solo la interfaz IEnchufeAmericano.

 - EnchufeEuropeo es una clase ya existente con una interfaz distinta.

 - AdaptadorEuropeo traduce entre ambos.

 🧩 Estructura del código

 Adapter/
├── Main.java               # Clase principal con ejemplo de uso
├── Cliente.java            # Clase que espera una interfaz americana
├── IEnchufeAmericano.java  # Interfaz esperada por el cliente
├── EnchufeEuropeo.java     # Clase existente con interfaz incompatible
├── AdaptadorEuropeo.java   # Clase que adapta EnchufeEuropeo a la interfaz esperada

📌 Diagrama simple

Main --> IComponenteArchivo
              ↑             ↑
        Archivo    CarpetaComposite --> IComponenteArchivo*


📚 Conclusión
Este patrón es útil cuando:

✅ Tenés código existente que no podés modificar.
✅ Querés integrar clases con interfaces incompatibles.
✅ Necesitás una solución flexible y extensible sin romper el código del cliente.

🧠 Referencias
 - [GoF] Adapter Pattern - Design Patterns: Elements of Reusable Object-Oriented Software

 - Patrón estructural - Permite la reutilización de clases existentes con interfaces distintas