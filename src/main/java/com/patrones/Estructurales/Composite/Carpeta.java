package com.patrones.Estructurales.Composite;

import java.util.ArrayList;
import java.util.List;

// ❌ Clase carpeta que solo puede contener archivos, no carpetas dentro de carpetas
public class Carpeta {

    private String nombre;
    private List<Archivo> archivos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregarArchivo(Archivo archivo) {
        archivos.add(archivo);
    }

    public void mostrar() {
        System.out.println("Carpeta: " + nombre);
        for (Archivo archivo : archivos) {
            archivo.mostrar();
        }
    }
}
