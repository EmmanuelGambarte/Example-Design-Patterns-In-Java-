# 🧠 Patrón Proxy Virtual

El **Proxy Virtual** es una variante del patrón Proxy que **retrasa la creación de un objeto costoso hasta que realmente se necesita**. Es útil para optimizar el rendimiento y ahorrar recursos, especialmente cuando un objeto puede no ser usado inmediatamente (o nunca).

---

## ✅ Problema

Hay objetos que requieren operaciones pesadas en su construcción (por ejemplo, cargar una imagen desde el disco, abrir un archivo PDF, conectar a una base de datos, etc).  
Si el cliente no necesita ese recurso de inmediato, **gastamos memoria y tiempo innecesariamente**.

---

## 🧠 Solución con Proxy Virtual

Creamos un objeto **Proxy** que implementa la misma interfaz que el objeto costoso.  
Este proxy **simula** ser el objeto real, pero **retrasa su creación** hasta que sea estrictamente necesario (por ejemplo, al llamar a `mostrar()`).

---

## 🧪 Ejemplo

### ❌ Sin aplicar el patrón

```java
ImagenReal imagenPesada = new ImagenReal("foto.jpg");
// La imagen se carga desde disco aunque nunca se use.
```

✅ Aplicando Proxy Virtual

```java
IImagen imagen = new ProxyImagen("foto.jpg");
// La imagen no se carga aún

imagen.mostrar(); // Ahora se carga desde disco (sólo si se necesita)
imagen.mostrar(); // Ya estaba cargada, se reutiliza

```

📌 Diagrama simple

Cliente --> ProxyImagen --> ImagenReal (creación perezosa)


🧩 Participantes

 - IImagen: interfaz común entre el objeto real y el proxy.

 - ImagenReal: clase costosa que simula una operación lenta (ej. cargar desde disco).

 - ProxyImagen: proxy que retrasa la creación de ImagenReal hasta que se llama al método mostrar().

 - Main: cliente que decide usar o no la imagen.


📝 Conclusión

 - El Proxy Virtual es útil cuando:

 - El objeto real es costoso de crear.

 - No siempre se necesita su funcionalidad.

 - Queremos controlar cuándo se inicializa para mejorar el rendimiento.

 - Se lo relaciona fuertemente con la técnica de Lazy Initialization.


📚 Referencia

 - Patrón Proxy (Proxy Virtual)

 - Categoría: Patrones Estructurales

 - Relacionado con: Lazy Initialization, Decorator, Proxy de protección