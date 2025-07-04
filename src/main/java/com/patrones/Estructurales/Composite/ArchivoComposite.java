package com.patrones.Estructurales.Composite;

// ✅ Clase que implementa la interfaz para representar un archivo
public class ArchivoComposite implements IComponenteArchivo {

    private String nombre;

    public ArchivoComposite(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrar() {
        System.out.println("Archivo: " + nombre);
    }
}
