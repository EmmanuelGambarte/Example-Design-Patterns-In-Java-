package com.patrones.Estructurales.Composite;

import java.util.ArrayList;
import java.util.List;

// ✅ Clase que implementa la interfaz para representar una carpeta que puede contener archivos y subcarpetas
public class CarpetaComposite implements IComponenteArchivo {

    private String nombre;
    private List<IComponenteArchivo> elementos = new ArrayList<>();

    public CarpetaComposite(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(IComponenteArchivo componente) {
        elementos.add(componente);
    }

    @Override
    public void mostrar() {
        System.out.println("Carpeta: " + nombre);
        for (IComponenteArchivo elemento : elementos) {
            elemento.mostrar();
        }
    }
}
