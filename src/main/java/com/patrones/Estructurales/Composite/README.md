# ✅ Patrón de Diseño: Composite

Este ejemplo muestra cómo **violar** y cómo **aplicar correctamente** el patrón de diseño estructural **Composite**, que permite tratar objetos individuales y composiciones de objetos de forma uniforme.

> "El patrón Composite permite componer objetos en estructuras de árbol para representar jerarquías parte-todo. Permite a los clientes tratar de forma uniforme objetos individuales y composiciones de objetos."

---

## ❌ Sin aplicar Composite

En este caso, la clase `Carpeta` contiene una lista de objetos `Archivo`. No puede contener otras carpetas, por lo tanto:

- La estructura **no es recursiva**.
- No se puede anidar carpetas dentro de otras carpetas.
- Solo permite una estructura plana, sin jerarquías.

```java
Carpeta carpeta = new Carpeta("Documentos");
carpeta.agregarArchivo(new Archivo("archivo1.txt"));
carpeta.agregarArchivo(new Archivo("archivo2.txt"));
carpeta.mostrar();
```

✅ Aplicando el patrón Composite
Creamos una interfaz IComponenteArchivo que representa tanto archivos como carpetas. Luego:

ArchivoComposite representa archivos individuales.

CarpetaComposite representa carpetas que pueden contener archivos y otras carpetas (estructura recursiva).

Esto permite construir estructuras jerárquicas como árboles de archivos y carpetas, y tratarlas de manera uniforme.

```java
IComponenteArchivo archivo1 = new ArchivoComposite("archivo1.txt");
IComponenteArchivo archivo2 = new ArchivoComposite("archivo2.txt");

CarpetaComposite carpeta = new CarpetaComposite("Documentos");
carpeta.agregar(archivo1);
carpeta.agregar(archivo2);

CarpetaComposite subcarpeta = new CarpetaComposite("Fotos");
subcarpeta.agregar(new ArchivoComposite("foto1.png"));

carpeta.agregar(subcarpeta);
carpeta.mostrar();

```

🧩 Estructura del Código
Composite/
├── Main.java                  # Cliente que usa ambas versiones
├── Archivo.java               # ❌ Archivo sin interfaz común (no Composite)
├── Carpeta.java               # ❌ Carpeta sin soporte para subcarpetas
├── IComponenteArchivo.java    # ✅ Interfaz común para archivo y carpeta
├── ArchivoComposite.java      # ✅ Archivo que implementa la interfaz
├── CarpetaComposite.java      # ✅ Carpeta que puede contener archivos o carpetas


📌 Conclusión
Al aplicar el patrón Composite:

✅ Se puede representar estructuras jerárquicas (como un sistema de archivos)
✅ Se unifica el tratamiento de elementos simples y compuestos
✅ Se simplifica la lógica del cliente al usar una interfaz común

📚 Referencia
Patrón Composite

 - Categoría: Patrones Estructurales

 - Relacionado con: Decorator, Chain of Responsibility
