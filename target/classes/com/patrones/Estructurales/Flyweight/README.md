# 🪶 Patrón Flyweight

El patrón **Flyweight** es un patrón estructural que permite compartir objetos para minimizar el uso de memoria cuando se crean muchos objetos similares.  
Separa el estado **intrínseco** (compartido) del **extrínseco** (variable).

---

## ✅ Problema

Crear muchos objetos similares que contienen datos redundantes (por ejemplo, cada letra en un editor de texto con su carácter y posición) consume mucha memoria innecesariamente.

---

## 🧠 Solución con Flyweight

- Compartir objetos con estado intrínseco común (carácter).  
- Mantener el estado extrínseco (posición) fuera del objeto compartido.  
- Usar una fábrica (`FlyweightFactory`) para gestionar y reutilizar los objetos.

---

## 🧪 Ejemplo

### Sin patrón

```java
Letra l1 = new Letra('H', 1, 1);
Letra l2 = new Letra('E', 2, 1);
...
```

Con patrón

```java
FlyweightFactory factory = new FlyweightFactory();

ILetra l1 = factory.getLetra('H');
ILetra l2 = factory.getLetra('E');
...

l1.mostrar(1,1);
l2.mostrar(2,1);
```

📌 Diagrama simple

Cliente --> FlyweightFactory --> LetraConcreta
                            ↳ reutiliza objetos existentes



🧩 Participantes
 - ILetra: interfaz común.

 - LetraConcreta: objeto compartido que contiene estado intrínseco.

 - FlyweightFactory: gestiona y reutiliza los objetos.

 - Cliente: usa la fábrica para obtener objetos y pasa estado extrínseco.


 📚 Referencia
 
 - Patrón Flyweight

 - Categoría: Patrones Estructurales

 - Relacionado con: Singleton, Proxy, Decorator
