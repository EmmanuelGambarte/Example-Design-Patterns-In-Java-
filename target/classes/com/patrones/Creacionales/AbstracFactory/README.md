# ✅ Patrón de Diseño: Abstract Factory

Este ejemplo demuestra cómo **violar** y cómo **aplicar correctamente** el patrón de diseño **Abstract Factory**, el cual:

> "Proporciona una interfaz para crear familias de objetos relacionados sin especificar sus clases concretas."

---

## ❌ Sin aplicar Abstract Factory

Se instancian manualmente las clases concretas (`Auto`, `Moto`, `SillaAuto`, `SillaMoto`). Esto genera:

- Acoplamiento fuerte con las clases concretas.
- Código duplicado para cada tipo de vehículo.
- Dificultad para escalar o intercambiar componentes.

```java
Auto auto = new Auto();
Moto moto = new Moto();
SillaAuto sillaAuto = new SillaAuto();
SillaMoto sillaMoto = new SillaMoto();

auto.conducir();
moto.conducir();
sillaAuto.sentarse();
sillaMoto.sentarse();
```

✅ Aplicación correcta del patrón Abstract Factory
Se define una fábrica abstracta que declara métodos para crear un IVehiculo y una ISilla. Luego, se crean fábricas concretas para auto y moto, que devuelven instancias específicas:

```java
FabricaVehiculo fabricaAuto = new FabricaAuto();
IVehiculo vehiculoAuto = fabricaAuto.crearVehiculo();
ISilla sillaAuto = fabricaAuto.crearSilla();

vehiculoAuto.conducir();
sillaAuto.sentarse();
```

✔ Esto permite:

 - Crear familias de objetos relacionados (Auto + SillaAuto, Moto + SillaMoto).

 - Reducir el acoplamiento al depender de interfaces en lugar de clases concretas.

 - Facilitar la extensión sin modificar el código cliente.

 🧩 Estructura del Código

 AbstractFactory/
├── IVehiculo.java           # Interfaz común para vehículos
├── ISilla.java              # Interfaz común para sillas
├── Auto.java                # Vehículo concreto (Auto)
├── Moto.java                # Vehículo concreto (Moto)
├── SillaAuto.java           # Silla concreta para Auto
├── SillaMoto.java           # Silla concreta para Moto
├── FabricaVehiculo.java     # Fábrica abstracta (declara los métodos)
├── FabricaAuto.java         # Fábrica concreta para Auto
├── FabricaMoto.java         # Fábrica concreta para Moto
└── Main.java                # Cliente que demuestra ambos enfoques

📌 Conclusión
Al usar el patrón Abstract Factory:

✅ Se crean objetos relacionados de forma consistente
✅ El código cliente no depende de clases concretas
✅ Se favorece la extensibilidad y mantenibilidad

📚 Referencias
 - GOF: Abstract Factory Pattern

 - Forma parte de los patrones creacionales

