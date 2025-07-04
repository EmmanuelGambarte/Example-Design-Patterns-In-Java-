package com.patrones.Estructurales.ProxyVirtual;

// Representa una imagen pesada que tarda en cargarse
public class ImagenReal implements IImagen {

    private String archivo;

    public ImagenReal(String archivo) {
        this.archivo = archivo;
        cargarDesdeDisco(); // Simula una carga costosa
    }

    private void cargarDesdeDisco() {
        System.out.println("🧠 Cargando imagen desde disco: " + archivo + " (esto es costoso)");
        try {
            Thread.sleep(2000); // Simula retardo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void mostrar() {
        System.out.println("📸 Mostrando imagen: " + archivo);
    }
}