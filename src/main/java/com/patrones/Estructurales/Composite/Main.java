package com.patrones.Estructurales.Composite;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Sin aplicar Composite ===");

        // ✅ Creamos una carpeta con archivos, pero solo permite archivos simples, no
        // carpetas dentro de carpetas
        Carpeta carpeta = new Carpeta("Documentos");
        carpeta.agregarArchivo(new Archivo("archivo1.txt"));
        carpeta.agregarArchivo(new Archivo("archivo2.txt"));
        carpeta.mostrar();

        System.out.println("\n=== Aplicando Composite ===");

        // ✅ Creamos archivos como componentes individuales
        IComponenteArchivo archivo1 = new ArchivoComposite("archivo1.txt");
        IComponenteArchivo archivo2 = new ArchivoComposite("archivo2.txt");

        // ✅ Creamos una carpeta que puede contener archivos y otras carpetas
        // (estructura jerárquica)
        CarpetaComposite carpetaComposite = new CarpetaComposite("Documentos");
        carpetaComposite.agregar(archivo1);
        carpetaComposite.agregar(archivo2);

        // ✅ Subcarpeta con archivos
        CarpetaComposite subcarpeta = new CarpetaComposite("Fotos");
        subcarpeta.agregar(new ArchivoComposite("foto1.png"));

        carpetaComposite.agregar(subcarpeta);
        carpetaComposite.mostrar();
    }
}
