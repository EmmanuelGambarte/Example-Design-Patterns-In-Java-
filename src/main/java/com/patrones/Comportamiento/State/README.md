# 🔄 Patrón State

El patrón **State** es un patrón de comportamiento que permite a un objeto alterar su comportamiento cuando su **estado interno cambia**, como si el objeto cambiara su clase.

---

## ✅ Problema

Cuando un objeto tiene múltiples comportamientos dependiendo de su estado,  
se suele terminar con muchos `if/else` o `switch` difíciles de mantener y extender.

---

## 🧠 Solución con State

- Representar **cada estado** como una clase separada que implementa una interfaz común.
- El objeto principal (contexto) delega el comportamiento al **estado actual**.
- Cambiar el estado del objeto cambia automáticamente su comportamiento.

---

## 🧪 Ejemplo

### Sin patrón

```java
if (estado.equals("SIN_MONEDA")) {
    // lógica
} else if (estado.equals("CON_MONEDA")) {
    // lógica
}
```

Con patrón


```java
maquina.insertarMoneda(); // Estado delega comportamiento
maquina.entregarProducto();

```

📌 Diagrama simple
Cliente --> MaquinaExpendedora --> IEstado
                                ↙        ↘
                  EstadoSinMoneda     EstadoConMoneda



🧩 Participantes
 - IEstado: interfaz común para todos los estados.

 - EstadoSinMoneda, EstadoConMoneda: clases concretas con lógica específica para cada estado.

 - MaquinaExpendedora: objeto principal que mantiene una referencia al estado actual y delega en él.

 - Main: cliente que interactúa con la máquina.



📚 Referencia

 - Patrón State

 - Categoría: Patrones de Comportamiento

 - Relacionado con: Strategy, Memento, Observer