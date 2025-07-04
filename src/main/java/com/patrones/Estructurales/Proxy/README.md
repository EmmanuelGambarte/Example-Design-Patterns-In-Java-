# 🛡️ Patrón Proxy

El patrón **Proxy** es un patrón estructural que actúa como un intermediario entre el cliente y el objeto real. El Proxy puede controlar el acceso, agregar lógica adicional (como cacheo o logs), o proteger al objeto real de usos indebidos.

---

## ✅ Problema

El cliente accede directamente al objeto real (`InternetReal`) sin ningún tipo de validación o control. Esto puede generar accesos no deseados a recursos restringidos, inseguros o sensibles.

---

## 🧠 Solución con Proxy

Se introduce una clase `ProxyInternet` que **implementa la misma interfaz que el objeto real** (`IServicioInternet`), pero añade una capa de control. En este caso, el Proxy bloquea el acceso a ciertos sitios prohibidos antes de delegar la solicitud al objeto real.

---

## 🧪 Ejemplo

### ❌ Sin aplicar el patrón Proxy

```java
IServicioInternet internet = new InternetReal();
internet.accederSitio("www.google.com");
internet.accederSitio("www.sitioprohibido.com");
```

✅ Aplicando el patrón Proxy

```java
IServicioInternet internet = new ProxyInternet();
internet.accederSitio("www.google.com");            // ✅ permitido
internet.accederSitio("www.sitioprohibido.com");    // ❌ bloqueado
```

📌 Diagrama simple

Cliente --> ProxyInternet --> InternetReal
         ↳ (verifica acceso antes de delegar)

🧩 Participantes
 - IServicioInternet: interfaz común.

 - InternetReal: objeto real que proporciona la funcionalidad.

 - ProxyInternet: intermediario que controla el acceso al objeto real.

 - Main: cliente que interactúa con el sistema.

📝 Conclusión
El patrón Proxy es ideal para agregar una capa adicional de control sin modificar el objeto real. Es útil para escenarios como:

 - Control de acceso

 - Logs

 - Lazy loading

 - Caching

 - Validaciones de seguridad


📚 Referencia  
Patrón Proxy

- Categoría: Patrones Estructurales
- Relacionado con: Decorator, Adapter, Chain of Responsibility