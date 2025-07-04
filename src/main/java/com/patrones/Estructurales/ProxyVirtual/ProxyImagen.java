package com.patrones.Estructurales.ProxyVirtual;

// Proxy que retrasa la creación de la imagen real hasta que se necesita
public class ProxyImagen implements IImagen {

    private String archivo;
    private ImagenReal imagenReal;

    public ProxyImagen(String archivo) {
        this.archivo = archivo;
    }

    @Override
    public void mostrar() {
        if (imagenReal == null) {
            System.out.println("⏳ Primera vez: creando imagen real...");
            imagenReal = new ImagenReal(archivo);
        } else {
            System.out.println("⚡ Imagen ya cargada, usando caché");
        }
        imagenReal.mostrar();
    }
}