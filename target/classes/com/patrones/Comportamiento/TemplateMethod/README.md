# 📋 Patrón Template Method

El patrón **Template Method** es un patrón de comportamiento que define el **esqueleto de un algoritmo** en una clase base,  
permitiendo que las subclases redefinan ciertos pasos del algoritmo sin cambiar su estructura general.

---

## ✅ Problema

Cuando múltiples clases comparten una estructura común en un algoritmo,  
pero algunos pasos varían entre ellas, repetir el código genera duplicación y errores.

---

## 🧠 Solución con Template Method

- Definir en una clase abstracta un método **final** que representa el algoritmo completo.  
- Permitir que las subclases implementen o redefinan ciertos pasos (métodos abstractos o hooks).  
- Así se reutiliza la estructura común y se personalizan las partes variables.

---

## 🧪 Ejemplo

### Sin patrón

```java
class Cafe {
    public void preparar() {
        hervirAgua();
        prepararCafe();
        servir();
        agregarAzucar();
    }
}

class Te {
    public void preparar() {
        hervirAgua();
        prepararTe();
        servir();
        agregarLimon();
    }
}
```

Con patron

```java
abstract class BebidaCaliente {
    public final void prepararReceta() {
        hervirAgua();
        prepararBebida();
        servir();
        agregarComplemento();
    }

    protected abstract void prepararBebida();
    protected abstract void agregarComplemento();

    private void hervirAgua() { /*...*/ }
    private void servir() { /*...*/ }
}

```

📌 Diagrama simple

Cliente --> BebidaCaliente (abstracta)
                        ↙           ↘
                   CafeTM         TeTM


🧩 Participantes

 - BebidaCaliente: clase abstracta que define el algoritmo (template method).

 - CafeTM, TeTM: implementaciones concretas que redefinen pasos específicos.

 - Main: cliente que ejecuta el algoritmo.


📚 Referencia

 - Patrón Template Method

 - Categoría: Patrones de Comportamiento

 - Relacionado con: Strategy, Factory Method