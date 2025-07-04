# ✅ Patrón de Diseño: Factory Method (FM)

Este ejemplo muestra cómo **NO aplicar** y cómo **aplicar correctamente** el patrón Factory Method, que se usa para delegar la creación de objetos a subclases.

> "Define una interfaz para crear un objeto, pero permite que las subclases decidan qué clase instanciar."

---

## ❌ Sin aplicar el patrón Factory Method

En este caso, el cliente (`Main.java`) instancia directamente las clases concretas `Auto` y `Moto`. Esto **viola el principio de inversión de dependencias** y genera un **alto acoplamiento**:

```java
IVehiculo auto = new Auto(); // 🔧 Instanciación directa (acoplamiento)
IVehiculo moto = new Moto(); // 🔧 Instanciación directa (acoplamiento)
```

 - El cliente depende de las clases concretas (Auto, Moto).

 - Si en el futuro se quiere cambiar el tipo de vehículo, hay que modificar el cliente.

 - No hay separación clara entre la lógica de negocio y la creación del objeto.

 ✅ Aplicando Factory Method
Ahora el cliente delega la creación de objetos a fábricas concretas (FabricaAuto, FabricaMoto) que heredan de una clase abstracta (FabricaVehiculo):

```java
FabricaVehiculo fabricaAuto = new FabricaAuto();
IVehiculo auto = fabricaAuto.crearVehiculo(); // El cliente no sabe qué clase concreta se instancia

FabricaVehiculo fabricaMoto = new FabricaMoto();
IVehiculo moto = fabricaMoto.crearVehiculo(); // El cliente no sabe qué clase concreta se instancia
```

Ventajas:
 - El cliente solo conoce la abstracción (FabricaVehiculo), no las clases concretas.

 - Es fácil agregar nuevos tipos de vehículos sin modificar el cliente.

 - Cumple con el principio de abierto/cerrado (Open/Closed).

 🧩 Estructura del Código

 FactoryMethod/
├── IVehiculo.java             # Interfaz común
├── Auto.java                  # Clase concreta Auto
├── Moto.java                  # Clase concreta Moto
├── FabricaVehiculo.java     # Clase abstracta (Creator)
├── FabricaAuto.java         # Fábrica concreta para Auto
├── FabricaMoto.java         # Fábrica concreta para Moto
└── Main.java                  # Cliente que contiene ambos ejemplos

🧪 Resultado del Main.java

```java
// ❌ Sin aplicar Factory Method
El auto está en marcha
La moto está en marcha

// ✅ Aplicando Factory Method
El auto está en marcha
La moto está en marcha
```

📚 Referencias
 - GoF - Design Patterns: Elements of Reusable Object-Oriented Software

 - Factory Method forma parte de los patrones creacionales.
